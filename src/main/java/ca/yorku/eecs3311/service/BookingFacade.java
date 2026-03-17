package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Lab;
import ca.yorku.eecs3311.model.payment.PaymentService;
import ca.yorku.eecs3311.model.payment.PaymentStrategy;
import ca.yorku.eecs3311.model.user.User;
import ca.yorku.eecs3311.dao.PaymentDAO;
import ca.yorku.eecs3311.model.enums.PaymentMethod;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
        // Call to AuthenticationService to handle state change and CSV upsert instead
        authService.approveUser(userId);

        // Fetch the updated user to trigger a notification
        User user = bookingManager.getUserDAO().findById(userId);
        if (user != null) {
            notificationService.sendApprovalNotification(user);
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
        boolean success = paymentService.executePayment(booking.getTotalCost());

        // req 10: The Missing Persistence Link
        if (success) {
            // Map the Strategy to the Enumerations
            PaymentMethod methodEnum;
            if (strategy instanceof ca.yorku.eecs3311.model.payment.CreditCardPayment) {
                methodEnum = PaymentMethod.CREDIT_CARD;
            } else if (strategy instanceof ca.yorku.eecs3311.model.payment.DebitCardPayment) {
                methodEnum = PaymentMethod.DEBIT_CARD;
            } else if (strategy instanceof ca.yorku.eecs3311.model.payment.InstitutionalAccountPayment) {
                methodEnum = PaymentMethod.INSTITUTIONAL_ACCOUNT;
            } else {
                methodEnum = PaymentMethod.RESEARCH_GRANT;
            }

            // Create the Payment Record (isDeposit = false)
            ca.yorku.eecs3311.model.payment.Payment paymentRecord =
                    new ca.yorku.eecs3311.model.payment.Payment(
                            bookingID,
                            booking.getUser().getUserId(),
                            booking.getTotalCost(),
                            methodEnum,
                            false
                    );
            paymentRecord.setStatus("COMPLETED");

            // Update the CSV
            PaymentDAO paymentDAO = new PaymentDAO();
            paymentDAO.save(paymentRecord);
        }

        return success;
    }

    // ----------------------------------------
    // Equipment queries & operations
    // ------------------------------------------
    public void saveEquipment(Equipment equipment) {
    // Optionally load the lab and add equipment to maintain bidirectional relationship
    // (not required for CSV, but keeps in‑memory objects consistent)
    if (equipment.getLabID() != null) {
        Lab lab = bookingManager.getEquipmentDAO().findLabById(equipment.getLabID()); // you need to implement this method
        if (lab != null) {
            lab.addEquipment(equipment);  // this sets equipment.lab = lab
        }
    }
    bookingManager.getEquipmentDAO().save(equipment);
}
    
    public List<Equipment> getAllEquipment() {
        // 1. Get raw equipment list (labID is present, lab field is null)
        List<Equipment> equipmentList = bookingManager.getEquipmentDAO().loadAll();

        // 2. Load all labs and build a map: labID → Lab
        List<Lab> allLabs = bookingManager.getEquipmentDAO().loadAllLabs(); // from EquipmentDAO
        Map<String, Lab> labMap = new HashMap<>();

        for (Lab lab : allLabs) {

        labMap.put(lab.getLabID(), lab);

        }

        // 3. For each equipment, set its lab using the map
        for (Equipment eq : equipmentList) {

            String labId = eq.getLabID();
            if (labId != null && labMap.containsKey(labId)) {
            // This calls eq.setLab(this) inside addEquipment()
            labMap.get(labId).addEquipment(eq);

            }
        }

        return equipmentList;
    }

    public List<Equipment> getAvailableEquipment() {
        // calling getAllEquipment() here to use Marwan's Lab-stitching logic,
        return getAllEquipment()
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
    public List<Lab> getAllLabs() {
    return bookingManager.getEquipmentDAO().loadAllLabs();
    }
    
    public List<Booking> getAllBookings() {
        return bookingManager.getBookingDAO().loadAll();
    }

    public List<Booking> getBookingsByUser(String userID) {
        return bookingManager.getBookingsByUser(userID);
    }

    public List<Booking> getBookingsByEquipment(String equipmentID) {
        return bookingManager.getBookingsByEquipment(equipmentID);
    }

    public ca.yorku.eecs3311.model.payment.Payment getPaymentReceipt(String bookingID) {
        ca.yorku.eecs3311.dao.PaymentDAO paymentDAO = new ca.yorku.eecs3311.dao.PaymentDAO();

        // 1. Get the list of payments for this booking
        java.util.List<ca.yorku.eecs3311.model.payment.Payment> payments = paymentDAO.findByBookingId(bookingID);

        // 2. Check if the list is empty
        if (payments != null && !payments.isEmpty()) {
            // 3. Return the most recent payment (the last one in the list)
            return payments.get(payments.size() - 1);
        }

        return null; // No payments found
    }
}