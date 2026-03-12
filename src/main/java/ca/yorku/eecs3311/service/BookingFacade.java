package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.payment.PaymentService;
import ca.yorku.eecs3311.model.payment.PaymentStrategy;
import ca.yorku.eecs3311.model.user.User;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class BookingFacade {

    private final BookingManager bookingManager;
    private final NotificationService notificationService;
    private final AuthenticationService authService;
    private final PaymentService paymentService;

    public BookingFacade() {
        this.bookingManager = BookingManager.getInstance();
        this.notificationService = new NotificationService();
        this.authService = AuthenticationService.getInstance();
        this.paymentService = new PaymentService();
    }

    // --------------------------
    // Auth delegates
    // ---------------

    public User login(String email, String password) {
        return authService.login(email, password);
    }

    public void logout(String userId) {
        authService.logout(userId);
    }

    public User registerUser(UserType type, String email, String password, String department,
                             String credentialNumber, String extraField1,
                             String extraField2, String extraField3) {
        return authService.registerUser(type, email, password, department,
                credentialNumber, extraField1, extraField2, extraField3);
    }

    public boolean isLoggedIn(String userId) {
        return authService.isLoggedIn(userId);
    }

    // ------------------------------------------
    // Admin / Manager User Operations
    // --------------------

    public void approveUser(String userId) {
        User user = bookingManager.getUserDAO().findById(userId);
        if (user != null) {
            user.activate();
            bookingManager.getUserDAO().save(user);
            notificationService.sendApprovalNotification(user);
        } else {
            throw new IllegalArgumentException("User not found.");
        }
    }

    public List<User> getAllUsers() {
        return bookingManager.getUserDAO().loadAll();
    }

    // ------------------------------------------
    // Booking operations
    // --------------------

    public Booking createBooking(String userID, String equipmentID,
                                 LocalDateTime start, LocalDateTime end) {
        Booking booking = bookingManager.createBooking(userID, equipmentID, start, end);
        notificationService.notifyBookingCreated(booking.getUser(), booking);
        return booking;
    }

    public Booking completeBooking(String bookingID) {
        return bookingManager.completeBooking(bookingID);
    }

    public Booking confirmBooking(String bookingID) {
        Booking booking = bookingManager.confirmBooking(bookingID);
        notificationService.notifyBookingConfirmed(booking.getUser(), booking);
        return booking;
    }

    public Booking cancelBooking(String bookingID) {
        Booking booking = bookingManager.cancelBooking(bookingID);
        notificationService.notifyBookingCancelled(booking.getUser(), booking);
        return booking;
    }

    public Booking extendBooking(String bookingID, LocalDateTime newEndTime) {
        Booking booking = bookingManager.extendBooking(bookingID, newEndTime);
        notificationService.notifyBookingExtended(booking.getUser(), booking);
        return booking;
    }

    public Booking confirmArrival(String bookingID) {
        Booking booking = bookingManager.confirmArrival(bookingID);
        notificationService.sendArrivalReminder(booking.getUser(), booking);
        return booking;
    }

    // --------------------------------
    // Payment
    // ------------------

    public boolean processPayment(String bookingID, PaymentStrategy strategy) {
        Booking booking = bookingManager.findBookingById(bookingID);
        if (booking == null) {
            throw new IllegalArgumentException("Booking not found.");
        }
        paymentService.setStrategy(strategy);
        return paymentService.executePayment(booking.getTotalCost());
    }

    // ----------------------------------------
    // Equipment queries & operations
    // -----------------

    public List<Equipment> getAllEquipment() {
        return bookingManager.getEquipmentDAO().loadAll();
    }

    public List<Equipment> getAvailableEquipment() {
        return bookingManager.getEquipmentDAO().loadAll()
                .stream()
                .filter(Equipment::isAvailable)
                .collect(Collectors.toList());
    }

    public void markEquipmentAvailable(String equipmentID) {
        Equipment equipment = bookingManager.getEquipmentDAO().findById(equipmentID);
        if (equipment != null) {
            bookingManager.getEquipmentDAO().updateStatus(equipmentID, EquipmentStatus.AVAILABLE);
        } else {
            throw new IllegalArgumentException("Equipment not found.");
        }
    }

    public void updateEquipmentStatus(String equipmentID, EquipmentStatus status) {
        Equipment equipment = bookingManager.getEquipmentDAO().findById(equipmentID);
        if (equipment != null) {
            bookingManager.getEquipmentDAO().updateStatus(equipmentID, status);
            if (status == EquipmentStatus.UNDER_MAINTENANCE) {
                notificationService.sendMaintenanceAlert(equipment);
            }
        } else {
            throw new IllegalArgumentException("Equipment not found.");
        }
    }

    // --------------------------------------
    // Query helpers
    // --------------------

    /**
     * Added: Support for the Manager Dashboard's global Booking Management tab.
     */
    public List<Booking> getAllBookings() {
        return bookingManager.getBookingDAO().loadAll();
    }

    public List<Booking> getBookingsByUser(String userID) {
        return bookingManager.getBookingsByUser(userID);
    }

    public List<Booking> getBookingsByEquipment(String equipmentID) {
        return bookingManager.getBookingsByEquipment(equipmentID);
    }
}