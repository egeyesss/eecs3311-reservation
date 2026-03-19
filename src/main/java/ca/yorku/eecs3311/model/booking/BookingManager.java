//package ca.yorku.eecs3311.model.booking;
//
//import ca.yorku.eecs3311.dao.BookingDAO;
//import ca.yorku.eecs3311.dao.EquipmentDAO;
//import ca.yorku.eecs3311.dao.UserDAO;
//import ca.yorku.eecs3311.model.enums.BookingStatus;
//import ca.yorku.eecs3311.model.enums.EquipmentStatus;
//import ca.yorku.eecs3311.model.equipment.Equipment;
//import ca.yorku.eecs3311.model.equipment.Sensor;
//import ca.yorku.eecs3311.model.equipment.SensorData;
//import ca.yorku.eecs3311.model.equipment.SensorObserver;
//
//import java.time.LocalDateTime;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class BookingManager implements SensorObserver {
//
//    private static BookingManager instance;
//
//    private final EquipmentDAO equipmentDAO;
//    private final UserDAO userDAO;
//    private final BookingDAO bookingDAO;
//    private final Map<String, String> sensorToEquipmentMap;
//
//    private BookingManager() {
//        this.equipmentDAO = new EquipmentDAO();
//        this.userDAO = new UserDAO();
//        this.bookingDAO = new BookingDAO(userDAO, equipmentDAO);
//        this.sensorToEquipmentMap = new HashMap<>();
//    }
//
//    public static BookingManager getInstance() {
//        if (instance == null) {
//            instance = new BookingManager();
//        }
//        return instance;
//    }
//
//    public void registerToAllSensors(List<Equipment> equipmentList) {
//        if (equipmentList == null) {
//            return;
//        }
//
//        for (Equipment equipment : equipmentList) {
//            if (equipment == null) {
//                continue;
//            }
//
//            for (Sensor sensor : equipment.getSensors()) {
//                if (sensor == null) {
//                    continue;
//                }
//
//                sensor.register(this);
//                sensorToEquipmentMap.put(sensor.getSensorID(), sensor.getEquipmentID());
//            }
//        }
//    }
//
//    @Override
//    public void update(SensorData data) {
//        if (data == null || !data.isAbnormal()) {
//            return;
//        }
//
//        String equipmentID = sensorToEquipmentMap.get(data.getSensorID());
//        if (equipmentID == null) {
//            System.out.println("No equipment mapping found for sensor: " + data.getSensorID());
//            return;
//        }
//
//        Equipment equipment = equipmentDAO.findById(equipmentID);
//        if (equipment == null) {
//            System.out.println("Equipment not found for sensor: " + data.getSensorID());
//            return;
//        }
//
//        equipment.updateStatus(EquipmentStatus.UNDER_MAINTENANCE);
//        equipment.setMaintenanceNotes(
//                "Auto-flagged by sensor " + data.getSensorID() + " due to abnormal reading at " + data.getTimestamp()
//        );
//        equipment.setLastMaintenanceDate(LocalDateTime.now());
//        equipmentDAO.save(equipment);
//
//        System.out.println("Equipment " + equipmentID + " automatically set to UNDER_MAINTENANCE.");
//
//        autoCancelUpcomingBookings(equipmentID);
//    }
//
//    private void autoCancelUpcomingBookings(String equipmentID) {
//        List<Booking> bookings = bookingDAO.findByEquipmentId(equipmentID);
//        LocalDateTime now = LocalDateTime.now();
//
//        for (Booking booking : bookings) {
//            if (booking == null) {
//                continue;
//            }
//
//            BookingStatus status = booking.getStatus();
//
//            boolean isUpcoming = booking.getStartTime() != null && booking.getStartTime().isAfter(now);
//            boolean shouldCancel =
//                    (status == BookingStatus.PENDING || status == BookingStatus.CONFIRMED) && isUpcoming;
//
//            if (!shouldCancel) {
//                continue;
//            }
//
//            booking.cancel();
//            bookingDAO.save(booking);
//
//            System.out.println(
//                    "Auto-cancelled booking " + booking.getBookingID() +
//                            " for user " + booking.getUser().getEmail() +
//                            " because equipment " + equipmentID + " is UNDER_MAINTENANCE."
//            );
//        }
//    }
//}