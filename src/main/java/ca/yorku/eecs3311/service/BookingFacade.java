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

    public Booking modifyBooking(String bookingID, LocalDateTime newStart, LocalDateTime newEnd) {
        Booking booking = bookingManager.modifyBooking(bookingID, newStart, newEnd);
        notificationService.notifyBookingModified(booking.getUser(), booking); // Optional: if you have this notification
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

     // Req 4: Process deposit payment for a PENDING booking.
     // Deposit = 1 hour's equipment fee. On success, auto-confirms the booking.
    public boolean processDeposit(String bookingID, PaymentStrategy strategy) {
        Booking booking = bookingManager.findBookingById(bookingID);
        if (booking == null) throw new IllegalArgumentException("Booking not found.");
        if (booking.getStatus() != ca.yorku.eecs3311.model.enums.BookingStatus.PENDING) {
            throw new IllegalStateException("Deposit can only be paid for PENDING bookings.");
        }

        double depositAmount = booking.getDepositAmount();
        paymentService.setStrategy(strategy);
        boolean success = paymentService.executePayment(depositAmount);

        if (success) {
            PaymentMethod methodEnum = resolvePaymentMethod(strategy);

            ca.yorku.eecs3311.model.payment.Payment depositRecord =
                    new ca.yorku.eecs3311.model.payment.Payment(
                            bookingID,
                            booking.getUser().getUserId(),
                            depositAmount,
                            methodEnum,
                            true // isDeposit = true
                    );
            depositRecord.setStatus("COMPLETED");
            new PaymentDAO().save(depositRecord);

            // Update in-memory booking and persist: set depositPaid then auto-confirm
            booking.setDepositPaid(depositAmount);
            booking.confirm();
            bookingManager.getEquipmentDAO().save(booking.getEquipment());
            bookingManager.getBookingDAO().save(booking);
            notificationService.notifyBookingConfirmed(booking.getUser(), booking);
        }

        return success;
    }

    /**
     * Req 4: Pay the remaining balance (totalCost - depositPaid). Only valid for ACTIVE bookings.
     */
    public boolean processPayment(String bookingID, PaymentStrategy strategy) {
        Booking booking = bookingManager.findBookingById(bookingID);
        if (booking == null) {
            throw new IllegalArgumentException("Booking not found.");
        }

        double balance = booking.getTotalCost() - booking.getDepositPaid();
        paymentService.setStrategy(strategy);
        boolean success = paymentService.executePayment(balance);

        if (success) {
            PaymentMethod methodEnum = resolvePaymentMethod(strategy);

            // Create the Payment Record (isDeposit = false)
            ca.yorku.eecs3311.model.payment.Payment paymentRecord =
                    new ca.yorku.eecs3311.model.payment.Payment(
                            bookingID,
                            booking.getUser().getUserId(),
                            balance,
                            methodEnum,
                            false
                    );
            paymentRecord.setStatus("COMPLETED");
            new PaymentDAO().save(paymentRecord);
        }

        return success;
    }

    private PaymentMethod resolvePaymentMethod(PaymentStrategy strategy) {
        if (strategy instanceof ca.yorku.eecs3311.model.payment.CreditCardPayment) {
            return PaymentMethod.CREDIT_CARD;
        } else if (strategy instanceof ca.yorku.eecs3311.model.payment.DebitCardPayment) {
            return PaymentMethod.DEBIT_CARD;
        } else if (strategy instanceof ca.yorku.eecs3311.model.payment.InstitutionalAccountPayment) {
            return PaymentMethod.INSTITUTIONAL_ACCOUNT;
        } else {
            return PaymentMethod.RESEARCH_GRANT;
        }
    }

    // ----------------------------------------
    // Equipment queries & operations
    // -------------
    public void saveEquipment(Equipment equipment) {
    // Optionally load the lab and add equipment to maintain bidirectional relationship
    // (not required for CSV, but keeps in‑memory objects consistent)
    if (equipment.getLabID() != null) {
        Lab lab = bookingManager.getEquipmentDAO().findLabById(equipment.getLabID());
        if (lab != null) {
            lab.addEquipment(equipment);  // this sets equipment.lab = lab
        }
    }
    bookingManager.getEquipmentDAO().save(equipment);
    }

    public void removeEquipment(String equipmentID) {
        // Mark as DISABLED instead of deleting
        bookingManager.getEquipmentDAO().updateStatus(equipmentID, EquipmentStatus.DISABLED);
    }

    public void deleteEquipment(String equipmentID) {
        // This is a hard delete that removes the record from CSV
        List<Equipment> all = bookingManager.getEquipmentDAO().loadAll();
        all.removeIf(e -> e.getEquipmentID().equals(equipmentID));
        bookingManager.getEquipmentDAO().writeAllEquipment(all);
    }
    
    public List<Equipment> getAllEquipment() {
        // Get raw equipment list (labID is present, lab field is null)
        List<Equipment> equipmentList = bookingManager.getEquipmentDAO().loadAll();

        // Load all labs and build a map: labID → Lab
        List<Lab> allLabs = bookingManager.getEquipmentDAO().loadAllLabs(); // from EquipmentDAO
        Map<String, Lab> labMap = new HashMap<>();

        for (Lab lab : allLabs) {

        labMap.put(lab.getLabID(), lab);

        }

        // For each equipment, set its lab using the map
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

    public List<Lab> getAllLabs() {
    return bookingManager.getEquipmentDAO().loadAllLabs();
    }
    
    public List<Booking> getAllBookings() {
        return bookingManager.getAllBookings();
    }

    public List<Booking> getBookingsByUser(String userID) {
        return bookingManager.getBookingsByUser(userID);
    }

    public List<Booking> getBookingsByEquipment(String equipmentID) {
        return bookingManager.getBookingsByEquipment(equipmentID);
    }

    public ca.yorku.eecs3311.model.payment.Payment getPaymentReceipt(String bookingID) {
        ca.yorku.eecs3311.dao.PaymentDAO paymentDAO = new ca.yorku.eecs3311.dao.PaymentDAO();
        java.util.List<ca.yorku.eecs3311.model.payment.Payment> payments = paymentDAO.findByBookingId(bookingID);
        if (payments == null || payments.isEmpty()) return null;

        // Return the most recent non-deposit (balance) payment, if any
        for (int i = payments.size() - 1; i >= 0; i--) {
            if (!payments.get(i).isDeposit()) return payments.get(i);
        }
        return null;
    }

    public ca.yorku.eecs3311.model.payment.Payment getDepositReceipt(String bookingID) {
        ca.yorku.eecs3311.dao.PaymentDAO paymentDAO = new ca.yorku.eecs3311.dao.PaymentDAO();
        java.util.List<ca.yorku.eecs3311.model.payment.Payment> payments = paymentDAO.findByBookingId(bookingID);
        if (payments == null || payments.isEmpty()) return null;
        for (ca.yorku.eecs3311.model.payment.Payment p : payments) {
            if (p.isDeposit() && "COMPLETED".equals(p.getStatus())) return p;
        }
        return null;
    }
}