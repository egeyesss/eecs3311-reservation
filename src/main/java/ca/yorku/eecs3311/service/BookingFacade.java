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
    // Added: AuthenticationService so controllers go through the facade for auth, never calling it directly
    private final AuthenticationService authService;
    // Added: PaymentService so processPayment() can be routed through the facade as the sole entry point
    private final PaymentService paymentService;

    public BookingFacade() {
        this.bookingManager = BookingManager.getInstance();
        this.notificationService = new NotificationService();
        // Uses getInstance() so the facade shares the same session state as the rest of the app
        this.authService = AuthenticationService.getInstance();
        this.paymentService = new PaymentService();
    }

    // --------------------------
    // Auth delegates — controllers call these instead of AuthenticationService directly
    // ---------------

    // Added: auth delegate so LoginController never needs to import or call AuthenticationService itself
    public User login(String email, String password) {
        return authService.login(email, password);
    }

    // Added: auth delegate to keep logout flow inside the facade boundary
    public void logout(String userId) {
        authService.logout(userId);
    }

    // Added: auth delegate so registration is also controlled through a single entry point
    public User registerUser(UserType type, String email, String password, String department,
                             String credentialNumber, String extraField1,
                             String extraField2, String extraField3) {
        return authService.registerUser(type, email, password, department,
                credentialNumber, extraField1, extraField2, extraField3);
    }

    // Added: auth delegate so controllers can check session status without touching AuthenticationService
    public boolean isLoggedIn(String userId) {
        return authService.isLoggedIn(userId);
    }

    // ------------------------------------------
    // Admin / Manager User Operations
    // --------------------

    // Added: allows admins to approve/activate a pending user account
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

    // Added: allows admins to view all users in the system
    public List<User> getAllUsers() {
        return bookingManager.getUserDAO().loadAll();
    }

    // ------------------------------------------
    // Booking operations
    // --------------------

    public Booking createAndConfirmBooking(String userID,
                                           String equipmentID,
                                           LocalDateTime start,
                                           LocalDateTime end) {

        Booking booking = bookingManager.createBooking(userID, equipmentID, start, end);
        notificationService.notifyBookingCreated(booking.getUser(), booking);

        booking = bookingManager.confirmBooking(booking.getBookingID());
        notificationService.notifyBookingConfirmed(booking.getUser(), booking);

        return booking;
    }

    // Added: standalone createBooking so PENDING state is usable for approval workflows before auto-confirm
    public Booking createBooking(String userID, String equipmentID,
                                 LocalDateTime start, LocalDateTime end) {
        Booking booking = bookingManager.createBooking(userID, equipmentID, start, end);
        notificationService.notifyBookingCreated(booking.getUser(), booking);
        return booking;
    }

    // Added: standalone confirmBooking so a manager/admin can explicitly approve a PENDING booking
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

    // Added: required by context spec; delegates arrival confirmation and sends the arrival reminder
    public Booking confirmArrival(String bookingID) {
        Booking booking = bookingManager.confirmArrival(bookingID);
        notificationService.sendArrivalReminder(booking.getUser(), booking);
        return booking;
    }

    // --------------------------------
    // Payment
    // ------------------

    // Added: required by context spec; sets the strategy and executes payment through PaymentService
    public boolean processPayment(String bookingID, PaymentStrategy strategy) {
        Booking booking = bookingManager.findBookingById(bookingID);
        if (booking == null) {
            throw new IllegalArgumentException("Booking not found.");
        }
        paymentService.setStrategy(strategy);
        return paymentService.executePayment(booking.getTotalCost());
    }

    // Added: convenience overload for charging only the deposit and updating depositPaid on the booking
    public boolean processDeposit(String bookingID, PaymentStrategy strategy, double depositAmount) {
        Booking booking = bookingManager.findBookingById(bookingID);
        if (booking == null) {
            throw new IllegalArgumentException("Booking not found.");
        }
        paymentService.setStrategy(strategy);
        boolean success = paymentService.chargeDeposit(depositAmount);
        if (success) {
            booking.setDepositPaid(depositAmount);
            bookingManager.getBookingDAO().save(booking);
        }
        return success;
    }

    // ----------------------------------------
    // Equipment queries & operations
    // -----------------


    // Added: allows managers to fetch all equipment to register as sensor observers
    public List<Equipment> getAllEquipment() {
        return bookingManager.getEquipmentDAO().loadAll();
    }

    // Added: required by context spec; returns all equipment whose status is AVAILABLE
    public List<Equipment> getAvailableEquipment() {
        return bookingManager.getEquipmentDAO().loadAll()
                .stream()
                .filter(Equipment::isAvailable)
                .collect(Collectors.toList());
    }

    public boolean isEquipmentAvailable(String equipmentID, LocalDateTime start, LocalDateTime end) {
        return bookingManager.isEquipmentAvailable(equipmentID, start, end);
    }

    // Added: allows managers to update equipment status directly (e.g., for maintenance alerts)
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

    public Booking getBookingById(String bookingID) {
        return bookingManager.findBookingById(bookingID);
    }

    public List<Booking> getBookingsByUser(String userID) {
        return bookingManager.getBookingsByUser(userID);
    }

    public List<Booking> getBookingsByEquipment(String equipmentID) {
        return bookingManager.getBookingsByEquipment(equipmentID);
    }
}