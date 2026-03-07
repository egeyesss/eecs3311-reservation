package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.dao.BookingDAO;
import ca.yorku.eecs3311.dao.EquipmentDAO;
import ca.yorku.eecs3311.dao.UserDAO;
import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.user.User;

import java.time.LocalDateTime;
import java.util.List;

public class BookingManager {

    private static BookingManager instance;

    private final UserDAO userDAO;
    private final EquipmentDAO equipmentDAO;
    private final BookingDAO bookingDAO;

    private BookingManager() {
        this.userDAO = new UserDAO();
        this.equipmentDAO = new EquipmentDAO();
        this.bookingDAO = new BookingDAO(userDAO, equipmentDAO);
    }

    public static BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    public boolean isEquipmentAvailable(String equipmentID, LocalDateTime start, LocalDateTime end) {
        Equipment equipment = equipmentDAO.findById(equipmentID);
        if (equipment == null) {
            return false;
        }

        if (!equipment.isAvailable()) {
            return false;
        }

        List<Booking> existingBookings = bookingDAO.findByEquipmentId(equipmentID);

        for (Booking booking : existingBookings) {
            if (booking.getStatus() == BookingStatus.CANCELLED ||
                    booking.getStatus() == BookingStatus.COMPLETED) {
                continue;
            }

            boolean overlaps =
                    start.isBefore(booking.getEndTime()) &&
                            end.isAfter(booking.getStartTime());

            if (overlaps) {
                return false;
            }
        }

        return true;
    }

    public Booking createBooking(String userID,
                                 String equipmentID,
                                 LocalDateTime start,
                                 LocalDateTime end) {

        if (start == null || end == null) {
            throw new IllegalArgumentException("Start time and end time cannot be null.");
        }

        if (!end.isAfter(start)) {
            throw new IllegalArgumentException("End time must be after start time.");
        }

        User user = userDAO.findById(userID);
        if (user == null) {
            throw new IllegalArgumentException("User not found.");
        }

        Equipment equipment = equipmentDAO.findById(equipmentID);
        if (equipment == null) {
            throw new IllegalArgumentException("Equipment not found.");
        }

        if (!isEquipmentAvailable(equipmentID, start, end)) {
            throw new IllegalStateException("Equipment is not available for the selected time slot.");
        }

        Booking booking = new Booking(user, equipment, start, end);
        bookingDAO.save(booking);
        return booking;
    }

    public Booking confirmBooking(String bookingID) {
        Booking booking = bookingDAO.findById(bookingID);
        if (booking == null) {
            throw new IllegalArgumentException("Booking not found.");
        }

        booking.confirm();
        bookingDAO.save(booking);
        return booking;
    }

    public Booking cancelBooking(String bookingID) {
        Booking booking = bookingDAO.findById(bookingID);
        if (booking == null) {
            throw new IllegalArgumentException("Booking not found.");
        }

        booking.cancel();
        bookingDAO.save(booking);
        return booking;
    }

    public Booking extendBooking(String bookingID, LocalDateTime newEndTime) {
        Booking booking = bookingDAO.findById(bookingID);
        if (booking == null) {
            throw new IllegalArgumentException("Booking not found.");
        }

        if (newEndTime == null || !newEndTime.isAfter(booking.getEndTime())) {
            throw new IllegalArgumentException("New end time must be after the current end time.");
        }

        List<Booking> equipmentBookings = bookingDAO.findByEquipmentId(
                booking.getEquipment().getEquipmentID()
        );

        for (Booking other : equipmentBookings) {
            if (other.getBookingID().equals(booking.getBookingID())) {
                continue;
            }

            if (other.getStatus() == BookingStatus.CANCELLED ||
                    other.getStatus() == BookingStatus.COMPLETED) {
                continue;
            }

            boolean overlaps =
                    booking.getStartTime().isBefore(other.getEndTime()) &&
                            newEndTime.isAfter(other.getStartTime());

            if (overlaps) {
                throw new IllegalStateException("Cannot extend booking because it overlaps another booking.");
            }
        }

        booking.extend(newEndTime);
        bookingDAO.save(booking);
        return booking;
    }

    public Booking findBookingById(String bookingID) {
        return bookingDAO.findById(bookingID);
    }

    public List<Booking> getBookingsByUser(String userID) {
        return bookingDAO.findByUserId(userID);
    }

    public List<Booking> getBookingsByEquipment(String equipmentID) {
        return bookingDAO.findByEquipmentId(equipmentID);
    }

    public BookingDAO getBookingDAO() {
        return bookingDAO;
    }

    public EquipmentDAO getEquipmentDAO() {
        return equipmentDAO;
    }

    public UserDAO getUserDAO() {
        return userDAO;
    }
}