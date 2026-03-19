package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.dao.BookingDAO;
import ca.yorku.eecs3311.dao.EquipmentDAO;
import ca.yorku.eecs3311.dao.UserDAO;
import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Sensor;
import ca.yorku.eecs3311.model.equipment.SensorData;
import ca.yorku.eecs3311.model.equipment.SensorObserver;
import ca.yorku.eecs3311.model.user.User;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookingManager implements SensorObserver {

    private static BookingManager instance;
    private final UserDAO userDAO;
    private final EquipmentDAO equipmentDAO;
    private final BookingDAO bookingDAO;
    private final Map<String, String> sensorToEquipmentMap;

    private BookingManager() {
        this.userDAO = new UserDAO();
        this.equipmentDAO = new EquipmentDAO();
        this.bookingDAO = new BookingDAO(userDAO, equipmentDAO);
        this.sensorToEquipmentMap = new HashMap<>();
    }

    public static synchronized BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    public void registerToAllSensors(List<Equipment> equipmentList) {
        if (equipmentList == null) {
            return;
        }

        for (Equipment equipment : equipmentList) {
            if (equipment == null) {
                continue;
            }

            for (Sensor sensor : equipment.getSensors()) {
                if (sensor == null) {
                    continue;
                }

                sensor.register(this);
                sensorToEquipmentMap.put(sensor.getSensorID(), sensor.getEquipmentID());
            }
        }
    }

    @Override
    public void update(SensorData data) {
        if (data == null || !data.isAbnormal()) {
            return;
        }

        String equipmentID = sensorToEquipmentMap.get(data.getSensorID());
        if (equipmentID == null) {
            System.out.println("No equipment mapping found for sensor: " + data.getSensorID());
            return;
        }

        Equipment equipment = equipmentDAO.findById(equipmentID);
        if (equipment == null) {
            System.out.println("Equipment not found for sensor: " + data.getSensorID());
            return;
        }

        equipment.updateStatus(EquipmentStatus.UNDER_MAINTENANCE);
        equipment.setMaintenanceNotes(
                "Auto-flagged by sensor " + data.getSensorID() + " due to abnormal reading at " + data.getTimestamp()
        );
        equipment.setLastMaintenanceDate(LocalDateTime.now());
        equipmentDAO.save(equipment);

        System.out.println("Equipment " + equipmentID + " automatically set to UNDER_MAINTENANCE.");

        autoCancelUpcomingBookings(equipmentID);
    }

    private void autoCancelUpcomingBookings(String equipmentID) {
        List<Booking> bookings = bookingDAO.findByEquipmentId(equipmentID);
        LocalDateTime now = LocalDateTime.now();

        for (Booking booking : bookings) {
            if (booking == null) {
                continue;
            }

            BookingStatus status = booking.getStatus();

            boolean isUpcoming = booking.getStartTime() != null && booking.getStartTime().isAfter(now);
            boolean shouldCancel =
                    (status == BookingStatus.PENDING || status == BookingStatus.CONFIRMED) && isUpcoming;

            if (!shouldCancel) {
                continue;
            }

            booking.cancel();
            bookingDAO.save(booking);

            System.out.println(
                    "Auto-cancelled booking " + booking.getBookingID() +
                            " for user " + booking.getUser().getEmail() +
                            " because equipment " + equipmentID + " is UNDER_MAINTENANCE."
            );
        }
    }

    public boolean isEquipmentAvailable(String equipmentID, LocalDateTime start, LocalDateTime end) {
        Equipment equipment = equipmentDAO.findById(equipmentID);
        if (equipment == null) return false;

        if (equipment.getStatus() == EquipmentStatus.UNDER_MAINTENANCE || equipment.getStatus() == EquipmentStatus.DISABLED) {
            return false;
        }

        List<Booking> existing = bookingDAO.findByEquipmentId(equipmentID);
        for (Booking b : existing) {
            if (b.getStatus() == BookingStatus.CANCELLED || b.getStatus() == BookingStatus.COMPLETED) continue;

            if (start.isBefore(b.getEndTime()) && end.isAfter(b.getStartTime())) {
                return false;
            }
        }
        return true;
    }

    public Booking createBooking(String userID, String equipmentID, LocalDateTime start, LocalDateTime end) {
        if (start.isBefore(LocalDateTime.now().plusMinutes(59))) {
            throw new IllegalStateException("Bookings must be made at least 1 hour in advance.");
        }
        if (java.time.Duration.between(start, end).toHours() > 4) {
            throw new IllegalStateException("Maximum booking duration is 4 hours.");
        }

        if (!isEquipmentAvailable(equipmentID, start, end)) {
            throw new IllegalStateException("This equipment is in use by another student during this time slot.");
        }

        User user = userDAO.findById(userID);
        Equipment equipment = equipmentDAO.findById(equipmentID);

        Booking booking = new Booking(user, equipment, start, end);
        bookingDAO.save(booking);
        return booking;
    }

    public Booking confirmBooking(String bookingID) {
        Booking b = bookingDAO.findById(bookingID);
        if (b == null) throw new IllegalArgumentException("Booking not found.");

        b.confirm();
        equipmentDAO.save(b.getEquipment());
        bookingDAO.save(b);
        return b;
    }

    public Booking cancelBooking(String bookingID) {
        Booking b = bookingDAO.findById(bookingID);
        if (b == null) throw new IllegalArgumentException("Booking not found.");

        b.cancel();
        equipmentDAO.save(b.getEquipment());
        bookingDAO.save(b);
        return b;
    }

    public Booking extendBooking(String bookingID, LocalDateTime newEndTime) {
        Booking booking = bookingDAO.findById(bookingID);
        if (booking == null) throw new IllegalArgumentException("Booking not found.");

        if (java.time.Duration.between(booking.getStartTime(), newEndTime).toHours() > 4) {
            throw new IllegalStateException("Cannot extend: Maximum total booking duration is 4 hours.");
        }

        List<Booking> equipmentBookings = bookingDAO.findByEquipmentId(booking.getEquipment().getEquipmentID());
        for (Booking other : equipmentBookings) {
            if (other.getBookingID().equals(booking.getBookingID())) continue;
            if (other.getStatus() == BookingStatus.CANCELLED || other.getStatus() == BookingStatus.COMPLETED) continue;

            if (booking.getStartTime().isBefore(other.getEndTime()) && newEndTime.isAfter(other.getStartTime())) {
                throw new IllegalStateException("Cannot extend: slot is already taken by another student.");
            }
        }

        booking.extend(newEndTime);
        bookingDAO.save(booking);
        return booking;
    }

    public Booking modifyBooking(String bookingID, LocalDateTime newStart, LocalDateTime newEnd) {
        Booking booking = bookingDAO.findById(bookingID);
        if (booking == null) throw new IllegalArgumentException("Booking not found.");

        if (LocalDateTime.now().isAfter(booking.getStartTime()) || LocalDateTime.now().isEqual(booking.getStartTime())) {
            throw new IllegalStateException("Cannot modify a booking after its scheduled start time.");
        }

        if (java.time.Duration.between(newStart, newEnd).toHours() > 4) {
            throw new IllegalStateException("Cannot modify: Maximum booking duration is 4 hours.");
        }

        if (booking.getStatus() == BookingStatus.CANCELLED || booking.getStatus() == BookingStatus.COMPLETED) {
            throw new IllegalStateException("Cannot modify a cancelled or completed booking.");
        }

        List<Booking> equipmentBookings = bookingDAO.findByEquipmentId(booking.getEquipment().getEquipmentID());
        for (Booking other : equipmentBookings) {
            if (other.getBookingID().equals(booking.getBookingID())) continue;
            if (other.getStatus() == BookingStatus.CANCELLED || other.getStatus() == BookingStatus.COMPLETED) continue;

            if (newStart.isBefore(other.getEndTime()) && newEnd.isAfter(other.getStartTime())) {
                throw new IllegalStateException("Cannot modify: the new time slot overlaps with another student's booking.");
            }
        }

        booking.modifyTimes(newStart, newEnd);
        bookingDAO.save(booking);
        return booking;
    }

    public Booking confirmArrival(String bookingID) {
        Booking b = bookingDAO.findById(bookingID);
        if (b == null) throw new IllegalArgumentException("Booking not found.");

        b.setArrivedAt(LocalDateTime.now());
        b.activate();
        equipmentDAO.save(b.getEquipment());
        bookingDAO.save(b);
        return b;
    }

    public Booking completeBooking(String bookingID) {
        Booking b = bookingDAO.findById(bookingID);
        if (b == null) throw new IllegalArgumentException("Booking not found.");

        b.complete();
        equipmentDAO.save(b.getEquipment());
        bookingDAO.save(b);
        return b;
    }

    public Booking findBookingById(String id) { return bookingDAO.findById(id); }
    public List<Booking> getBookingsByUser(String id) { return bookingDAO.findByUserId(id); }
    public List<Booking> getBookingsByEquipment(String id) { return bookingDAO.findByEquipmentId(id); }
    public List<Booking> getAllBookings() { return bookingDAO.loadAll(); }
    public EquipmentDAO getEquipmentDAO() { return equipmentDAO; }
    public UserDAO getUserDAO() { return userDAO; }
    public BookingDAO getBookingDAO() { return bookingDAO; }
}