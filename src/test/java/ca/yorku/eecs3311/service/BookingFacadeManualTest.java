package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.dao.BookingDAO;
import ca.yorku.eecs3311.dao.EquipmentDAO;
import ca.yorku.eecs3311.dao.PaymentDAO;
import ca.yorku.eecs3311.dao.UserDAO;
import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Lab;
import ca.yorku.eecs3311.model.enums.AccountStatus;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.enums.PaymentMethod;
import ca.yorku.eecs3311.model.enums.UserType;
import ca.yorku.eecs3311.model.payment.CreditCardPayment;
import ca.yorku.eecs3311.model.payment.DebitCardPayment;
import ca.yorku.eecs3311.model.payment.InstitutionalAccount;
import ca.yorku.eecs3311.model.payment.InstitutionalAccountPayment;
import ca.yorku.eecs3311.model.payment.Payment;
import ca.yorku.eecs3311.model.payment.PaymentStrategy;
import ca.yorku.eecs3311.model.payment.ResearchGrantPayment;
import ca.yorku.eecs3311.model.user.Faculty;
import ca.yorku.eecs3311.model.user.ResearchGrant;
import ca.yorku.eecs3311.model.user.Student;
import ca.yorku.eecs3311.model.user.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class BookingFacadeManualTest {

    private static final Path USERS_FILE = Path.of("src/main/resources/data/users.csv");
    private static final Path EQUIPMENT_FILE = Path.of("src/main/resources/data/equipment.csv");
    private static final Path LABS_FILE = Path.of("src/main/resources/data/labs.csv");
    private static final Path BOOKINGS_FILE = Path.of("src/main/resources/data/bookings.csv");
    private static final Path PAYMENTS_FILE = Path.of("src/main/resources/data/payments.csv");

    private static final String USERS_HEADER =
            "userId,email,password,userType,accountStatus,registrationDate,department,credentialNumber,extraField1,extraField2,extraField3";
    private static final String EQUIPMENT_HEADER =
            "equipmentID,name,description,category,status,hourlyRate,maintenanceNotes,lastMaintenanceDate,labID";
    private static final String LABS_HEADER = "labID,name,building,roomNumber,capacity";
    private static final String BOOKINGS_HEADER =
            "bookingID,userId,equipmentID,startTime,endTime,createdAt,arrivedAt,status,totalCost,depositPaid";
    private static final String PAYMENTS_HEADER =
            "paymentID,bookingID,userId,amount,paymentMethod,paymentDate,transactionID,status,isDeposit";

    private final Map<Path, String> originalContents = new HashMap<>();
    private final Map<Path, Boolean> originalExists = new HashMap<>();

    private BookingFacade facade;
    private UserDAO userDAO;
    private EquipmentDAO equipmentDAO;
    private BookingDAO bookingDAO;
    private PaymentDAO paymentDAO;

    @BeforeEach
    public void setUp() throws IOException {
        backupAndResetCsv(USERS_FILE, USERS_HEADER);
        backupAndResetCsv(EQUIPMENT_FILE, EQUIPMENT_HEADER);
        backupAndResetCsv(LABS_FILE, LABS_HEADER);
        backupAndResetCsv(BOOKINGS_FILE, BOOKINGS_HEADER);
        backupAndResetCsv(PAYMENTS_FILE, PAYMENTS_HEADER);

        facade = new BookingFacade();
        userDAO = new UserDAO();
        equipmentDAO = new EquipmentDAO();
        bookingDAO = new BookingDAO(userDAO, equipmentDAO);
        paymentDAO = new PaymentDAO();
    }

    @AfterEach
    public void tearDown() throws IOException {
        restoreCsv(USERS_FILE);
        restoreCsv(EQUIPMENT_FILE);
        restoreCsv(LABS_FILE);
        restoreCsv(BOOKINGS_FILE);
        restoreCsv(PAYMENTS_FILE);
    }

    private void backupAndResetCsv(Path file, String header) throws IOException {
        originalExists.put(file, Files.exists(file));
        if (Files.exists(file)) {
            originalContents.put(file, Files.readString(file, StandardCharsets.UTF_8));
        }

        Path parent = file.getParent();
        if (parent != null) {
            Files.createDirectories(parent);
        }
        Files.writeString(file, header + System.lineSeparator(), StandardCharsets.UTF_8);
    }

    private void restoreCsv(Path file) throws IOException {
        boolean existed = originalExists.getOrDefault(file, false);
        if (existed) {
            Files.writeString(file, originalContents.get(file), StandardCharsets.UTF_8);
        } else {
            Files.deleteIfExists(file);
        }
    }

    private String unique(String prefix) {
        return prefix + "-" + UUID.randomUUID();
    }

    private Student makeActiveStudent(String email) {
        Student student = new Student(email, "StrongP@ss1", "EECS", unique("S"), "CS", 3);
        student.activate();
        return student;
    }

    private Equipment makeEquipment(String id, EquipmentStatus status, double hourlyRate) {
        Equipment equipment = new Equipment(id, "Equipment-" + id, "Desc", "Category", hourlyRate);
        equipment.updateStatus(status);
        return equipment;
    }

    private Booking makeBooking(User user, Equipment equipment, BookingStatus status,
                                LocalDateTime start, LocalDateTime end) {
        Booking booking = new Booking(user, equipment, start, end);
        switch (status) {
            case CONFIRMED:
                booking.confirm();
                break;
            case ACTIVE:
                booking.confirm();
                booking.activate();
                break;
            case COMPLETED:
                booking.confirm();
                booking.activate();
                booking.complete();
                break;
            case CANCELLED:
                booking.cancel();
                break;
            default:
                break;
        }
        return booking;
    }

    @Test
    public void testPipelineSetup() {
        assertTrue(true, "The testing pipeline is fully operational!");
    }

    @Test
    public void testBookingFacade() {
        assertNotNull(facade);
    }

    @Test
    public void testLogin() {
        Student user = makeActiveStudent("login@test.com");
        userDAO.save(user);

        User loggedIn = facade.login("login@test.com", "StrongP@ss1");

        assertNotNull(loggedIn);
        assertEquals(user.getUserId(), loggedIn.getUserId());
    }

    @Test
    public void testLogout() {
        Student user = makeActiveStudent("logout@test.com");
        userDAO.save(user);
        User loggedIn = facade.login("logout@test.com", "StrongP@ss1");
        assertNotNull(loggedIn);
        assertTrue(facade.isLoggedIn(loggedIn.getUserId()));

        facade.logout(loggedIn.getUserId());

        assertFalse(facade.isLoggedIn(loggedIn.getUserId()));
    }

    @Test
    public void testRegisterUser() {
        User registered = facade.registerUser(
                UserType.STUDENT,
                "register@test.com",
                "StrongP@ss1",
                "EECS",
                "SID-100",
                "CS",
                "2",
                null
        );

        assertNotNull(registered);
        assertEquals(AccountStatus.ACTIVE, registered.getAccountStatus());
        assertNotNull(userDAO.findByEmail("register@test.com"));
    }

    @Test
    public void testIsLoggedIn() {
        Student user = makeActiveStudent("isloggedin@test.com");
        userDAO.save(user);
        assertFalse(facade.isLoggedIn(user.getUserId()));

        facade.login("isloggedin@test.com", "StrongP@ss1");

        assertTrue(facade.isLoggedIn(user.getUserId()));
    }

    @Test
    public void testApproveUser() {
        Faculty pendingFaculty = new Faculty("approve@test.com", "StrongP@ss1", "EECS", "F-100", "Professor");
        userDAO.save(pendingFaculty);
        assertEquals(AccountStatus.PENDING, userDAO.findById(pendingFaculty.getUserId()).getAccountStatus());

        facade.approveUser(pendingFaculty.getUserId());

        User approved = userDAO.findById(pendingFaculty.getUserId());
        assertNotNull(approved);
        assertEquals(AccountStatus.ACTIVE, approved.getAccountStatus());
    }

    @Test
    public void testGetAllUsers() {
        Student user = makeActiveStudent("users@test.com");
        userDAO.save(user);

        List<User> users = facade.getAllUsers();

        assertNotNull(users);
        assertTrue(users.stream().anyMatch(u -> u.getUserId().equals(user.getUserId())));
    }

    @Test
    public void testCreateBooking() {
        Student user = makeActiveStudent("createbooking@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-CREATE", EquipmentStatus.AVAILABLE, 30.0);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(2);

        Booking booking = facade.createBooking(user.getUserId(), equipment.getEquipmentID(), start, end);

        assertNotNull(booking);
        assertEquals(BookingStatus.PENDING, booking.getStatus());
        assertNotNull(bookingDAO.findById(booking.getBookingID()));
    }

    @Test
    public void testCompleteBooking() {
        Student user = makeActiveStudent("complete@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-COMPLETE", EquipmentStatus.AVAILABLE, 20.0);
        equipmentDAO.save(equipment);

        Booking activeBooking = makeBooking(
                user,
                equipment,
                BookingStatus.ACTIVE,
                LocalDateTime.now().minusHours(1),
                LocalDateTime.now().plusHours(1)
        );
        bookingDAO.save(activeBooking);

        Booking completed = facade.completeBooking(activeBooking.getBookingID());

        assertNotNull(completed);
        assertEquals(BookingStatus.COMPLETED, completed.getStatus());
        assertTrue(completed.getEquipment().isAvailable());
    }

    @Test
    public void testConfirmBooking() {
        Student user = makeActiveStudent("confirm@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-CONFIRM", EquipmentStatus.AVAILABLE, 25.0);
        equipmentDAO.save(equipment);

        Booking pending = makeBooking(
                user,
                equipment,
                BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(3)
        );
        bookingDAO.save(pending);

        Booking confirmed = facade.confirmBooking(pending.getBookingID());

        assertNotNull(confirmed);
        assertEquals(BookingStatus.CONFIRMED, confirmed.getStatus());
    }

    @Test
    public void testModifyBooking() {
        Student user = makeActiveStudent("modify@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-MODIFY", EquipmentStatus.AVAILABLE, 25.0);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(3);
        LocalDateTime end = start.plusHours(1);

        Booking pending = makeBooking(user, equipment, BookingStatus.PENDING, start, end);
        bookingDAO.save(pending);

        LocalDateTime newStart = start.plusMinutes(30);
        LocalDateTime newEnd = newStart.plusHours(2);

        Booking modified = facade.modifyBooking(pending.getBookingID(), newStart, newEnd);

        assertNotNull(modified);
        assertEquals(newStart, modified.getStartTime());
        assertEquals(newEnd, modified.getEndTime());
    }

    @Test
    public void testCancelBooking() {
        Student user = makeActiveStudent("cancel@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-CANCEL", EquipmentStatus.AVAILABLE, 25.0);
        equipmentDAO.save(equipment);

        Booking pending = makeBooking(
                user,
                equipment,
                BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(3)
        );
        bookingDAO.save(pending);

        Booking cancelled = facade.cancelBooking(pending.getBookingID());

        assertNotNull(cancelled);
        assertEquals(BookingStatus.CANCELLED, cancelled.getStatus());
    }

    @Test
    public void testExtendBooking() {
        Student user = makeActiveStudent("extend@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-EXTEND", EquipmentStatus.AVAILABLE, 25.0);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(1);
        Booking confirmed = makeBooking(user, equipment, BookingStatus.CONFIRMED, start, end);
        bookingDAO.save(confirmed);

        LocalDateTime newEnd = start.plusHours(3);
        Booking extended = facade.extendBooking(confirmed.getBookingID(), newEnd);

        assertNotNull(extended);
        assertEquals(newEnd, extended.getEndTime());
    }

    @Test
    public void testConfirmArrival() {
        Student user = makeActiveStudent("arrival@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-ARRIVAL", EquipmentStatus.AVAILABLE, 25.0);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().minusMinutes(5);
        LocalDateTime end = LocalDateTime.now().plusHours(1);
        Booking booking = makeBooking(user, equipment, BookingStatus.CONFIRMED, start, end);
        bookingDAO.save(booking);

        Booking arrived = facade.confirmArrival(booking.getBookingID());

        assertNotNull(arrived);
        assertEquals(BookingStatus.ACTIVE, arrived.getStatus());
        assertNotNull(arrived.getArrivedAt());
    }

    @Test
    public void testProcessDeposit() {
        Student user = makeActiveStudent("deposit@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-DEPOSIT", EquipmentStatus.AVAILABLE, 40.0);
        equipmentDAO.save(equipment);

        Booking pending = makeBooking(
                user,
                equipment,
                BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(4)
        );
        bookingDAO.save(pending);

        PaymentStrategy strategy = new CreditCardPayment("4111111111111111", "12/30", "123", "Test User");
        boolean result = facade.processDeposit(pending.getBookingID(), strategy);

        Booking reloaded = bookingDAO.findById(pending.getBookingID());
        assertTrue(result);
        assertNotNull(reloaded);
        assertEquals(BookingStatus.CONFIRMED, reloaded.getStatus());
        assertEquals(40.0, reloaded.getDepositPaid(), 0.0001);
    }

    @Test
    public void testProcessPayment() {
        Student user = makeActiveStudent("payment@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-PAYMENT", EquipmentStatus.AVAILABLE, 30.0);
        equipmentDAO.save(equipment);

        Booking booking = makeBooking(
                user,
                equipment,
                BookingStatus.CONFIRMED,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(4)
        );
        booking.setDepositPaid(10.0);
        bookingDAO.save(booking);

        PaymentStrategy strategy = new DebitCardPayment("4444333322221111", "1234", "Test User", 1000.0);
        boolean result = facade.processPayment(booking.getBookingID(), strategy);

        Payment receipt = facade.getPaymentReceipt(booking.getBookingID());
        assertTrue(result);
        assertNotNull(receipt);
        assertFalse(receipt.isDeposit());
        assertEquals("COMPLETED", receipt.getStatus());
    }

    @Test
    public void testResolvePaymentMethod() {
        try {
            Method method = BookingFacade.class.getDeclaredMethod("resolvePaymentMethod", PaymentStrategy.class);
            method.setAccessible(true);

            PaymentMethod credit = (PaymentMethod) method.invoke(
                    facade, new CreditCardPayment("4111111111111111", "12/30", "123", "A")
            );
            PaymentMethod debit = (PaymentMethod) method.invoke(
                    facade, new DebitCardPayment("4111111111111111", "1234", "A", 1000.0)
            );
            PaymentMethod institutional = (PaymentMethod) method.invoke(
                    facade, new InstitutionalAccountPayment(new InstitutionalAccount("IA-1", "EECS", "U-1", 200.0))
            );
            PaymentMethod grant = (PaymentMethod) method.invoke(
                    facade, new ResearchGrantPayment(new ResearchGrant("RG-1", "Grant", "PI", 500.0, LocalDate.now().plusDays(30)))
            );

            assertEquals(PaymentMethod.CREDIT_CARD, credit);
            assertEquals(PaymentMethod.DEBIT_CARD, debit);
            assertEquals(PaymentMethod.INSTITUTIONAL_ACCOUNT, institutional);
            assertEquals(PaymentMethod.RESEARCH_GRANT, grant);
        } catch (Exception e) {
            fail("Reflection call failed: " + e.getMessage());
        }
    }

    @Test
    public void testRemoveEquipment() {
        Equipment equipment = makeEquipment("EQ-REMOVE", EquipmentStatus.AVAILABLE, 20.0);
        equipmentDAO.save(equipment);

        facade.removeEquipment(equipment.getEquipmentID());

        Equipment updated = equipmentDAO.findById(equipment.getEquipmentID());
        assertNotNull(updated);
        assertEquals(EquipmentStatus.DISABLED, updated.getStatus());
    }

    @Test
    public void testDeleteEquipment() {
        Equipment equipment = makeEquipment("EQ-DELETE", EquipmentStatus.AVAILABLE, 20.0);
        equipmentDAO.save(equipment);
        assertNotNull(equipmentDAO.findById(equipment.getEquipmentID()));

        facade.deleteEquipment(equipment.getEquipmentID());

        assertNull(equipmentDAO.findById(equipment.getEquipmentID()));
    }

    @Test
    public void testGetAllEquipment() {
        Lab lab = new Lab("LAB-1", "Main Lab", "Lassonde", "101", 20);
        equipmentDAO.saveLab(lab);

        Equipment equipment = makeEquipment("EQ-LAB", EquipmentStatus.AVAILABLE, 20.0);
        equipment.setLabID("LAB-1");
        equipmentDAO.save(equipment);

        List<Equipment> list = facade.getAllEquipment();

        Equipment found = list.stream().filter(e -> "EQ-LAB".equals(e.getEquipmentID())).findFirst().orElse(null);
        assertNotNull(found);
        assertNotNull(found.getLab());
        assertEquals("LAB-1", found.getLab().getLabID());
    }

    @Test
    public void testGetAvailableEquipment() {
        Equipment available = makeEquipment("EQ-AVAIL", EquipmentStatus.AVAILABLE, 20.0);
        Equipment inUse = makeEquipment("EQ-INUSE", EquipmentStatus.IN_USE, 20.0);
        equipmentDAO.save(available);
        equipmentDAO.save(inUse);

        List<Equipment> list = facade.getAvailableEquipment();

        assertTrue(list.stream().anyMatch(e -> "EQ-AVAIL".equals(e.getEquipmentID())));
        assertTrue(list.stream().noneMatch(e -> "EQ-INUSE".equals(e.getEquipmentID())));
    }

    @Test
    public void testMarkEquipmentAvailable() {
        Equipment equipment = makeEquipment("EQ-MARK", EquipmentStatus.IN_USE, 20.0);
        equipmentDAO.save(equipment);

        facade.markEquipmentAvailable(equipment.getEquipmentID());

        Equipment updated = equipmentDAO.findById(equipment.getEquipmentID());
        assertNotNull(updated);
        assertEquals(EquipmentStatus.AVAILABLE, updated.getStatus());
    }

    @Test
    public void testUpdateEquipmentStatus() {
        Equipment equipment = makeEquipment("EQ-STATUS", EquipmentStatus.AVAILABLE, 20.0);
        equipmentDAO.save(equipment);

        facade.updateEquipmentStatus(equipment.getEquipmentID(), EquipmentStatus.UNDER_MAINTENANCE);

        Equipment updated = equipmentDAO.findById(equipment.getEquipmentID());
        assertNotNull(updated);
        assertEquals(EquipmentStatus.UNDER_MAINTENANCE, updated.getStatus());
    }

    @Test
    public void testGetAllLabs() {
        Lab lab = new Lab("LAB-ALL", "Bio Lab", "Steacie", "201", 30);
        equipmentDAO.saveLab(lab);

        List<Lab> labs = facade.getAllLabs();

        assertTrue(labs.stream().anyMatch(l -> "LAB-ALL".equals(l.getLabID())));
    }

    @Test
    public void testGetAllBookings() {
        Student user = makeActiveStudent("allbookings@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-ALLBOOKINGS", EquipmentStatus.AVAILABLE, 20.0);
        equipmentDAO.save(equipment);

        Booking booking = makeBooking(
                user,
                equipment,
                BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(3)
        );
        bookingDAO.save(booking);

        List<Booking> bookings = facade.getAllBookings();

        assertTrue(bookings.stream().anyMatch(b -> b.getBookingID().equals(booking.getBookingID())));
    }

    @Test
    public void testGetBookingsByUser() {
        Student user = makeActiveStudent("byuser@test.com");
        userDAO.save(user);

        Equipment e1 = makeEquipment("EQ-BU-1", EquipmentStatus.AVAILABLE, 20.0);
        Equipment e2 = makeEquipment("EQ-BU-2", EquipmentStatus.AVAILABLE, 25.0);
        equipmentDAO.save(e1);
        equipmentDAO.save(e2);

        bookingDAO.save(makeBooking(user, e1, BookingStatus.PENDING, LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3)));
        bookingDAO.save(makeBooking(user, e2, BookingStatus.CONFIRMED, LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5)));

        List<Booking> list = facade.getBookingsByUser(user.getUserId());

        assertEquals(2, list.size());
    }

    @Test
    public void testGetBookingsByEquipment() {
        Student u1 = makeActiveStudent("byeq1@test.com");
        Student u2 = makeActiveStudent("byeq2@test.com");
        userDAO.save(u1);
        userDAO.save(u2);

        Equipment equipment = makeEquipment("EQ-BE", EquipmentStatus.AVAILABLE, 20.0);
        equipmentDAO.save(equipment);

        bookingDAO.save(makeBooking(u1, equipment, BookingStatus.PENDING, LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3)));
        bookingDAO.save(makeBooking(u2, equipment, BookingStatus.CONFIRMED, LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5)));

        List<Booking> list = facade.getBookingsByEquipment(equipment.getEquipmentID());

        assertEquals(2, list.size());
    }

    @Test
    public void testgetPaymentReceipt() {
        String bookingId = "B-RECEIPT";
        Payment deposit = new Payment(bookingId, "U-1", 20.0, PaymentMethod.CREDIT_CARD, true);
        deposit.setStatus("COMPLETED");
        paymentDAO.save(deposit);

        Payment balance = new Payment(bookingId, "U-1", 40.0, PaymentMethod.DEBIT_CARD, false);
        balance.setStatus("COMPLETED");
        paymentDAO.save(balance);

        Payment receipt = facade.getPaymentReceipt(bookingId);

        assertNotNull(receipt);
        assertFalse(receipt.isDeposit());
        assertEquals(40.0, receipt.getAmount(), 0.0001);
    }

    @Test
    public void testGetDepositReceipt() {
        String bookingId = "B-DEPOSIT-RECEIPT";
        Payment deposit = new Payment(bookingId, "U-2", 15.0, PaymentMethod.CREDIT_CARD, true);
        deposit.setStatus("COMPLETED");
        paymentDAO.save(deposit);

        Payment receipt = facade.getDepositReceipt(bookingId);

        assertNotNull(receipt);
        assertTrue(receipt.isDeposit());
        assertEquals("COMPLETED", receipt.getStatus());
    }

    @Test
    public void testLoginInvalidCredentialsReturnsNull() {
        Student user = makeActiveStudent("badlogin@test.com");
        userDAO.save(user);

        assertNull(facade.login("badlogin@test.com", "wrong-password"));
        assertNull(facade.login("missing@test.com", "StrongP@ss1"));
    }

    @Test
    public void testApproveUserThrowsWhenMissing() {
        assertThrows(IllegalArgumentException.class, () -> facade.approveUser("missing-user"));
    }

    @Test
    public void testCreateBookingThrowsForInvalidTimeWindow() {
        Student user = makeActiveStudent("create-invalid@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-INVALID-TIME", EquipmentStatus.AVAILABLE, 20.0);
        equipmentDAO.save(equipment);

        LocalDateTime soonStart = LocalDateTime.now().plusMinutes(30);
        assertThrows(IllegalStateException.class, () ->
                facade.createBooking(user.getUserId(), equipment.getEquipmentID(), soonStart, soonStart.plusHours(1)));
    }

    @Test
    public void testProcessDepositThrowsForMissingAndNonPendingBooking() {
        PaymentStrategy strategy = new CreditCardPayment("4111111111111111", "12/30", "123", "Test User");
        assertThrows(IllegalArgumentException.class, () -> facade.processDeposit("missing-booking", strategy));

        Student user = makeActiveStudent("deposit-nonpending@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-NONPENDING", EquipmentStatus.AVAILABLE, 40.0);
        equipmentDAO.save(equipment);
        Booking confirmed = makeBooking(
                user, equipment, BookingStatus.CONFIRMED,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3)
        );
        bookingDAO.save(confirmed);

        assertThrows(IllegalStateException.class, () -> facade.processDeposit(confirmed.getBookingID(), strategy));
    }

    @Test
    public void testProcessPaymentThrowsForMissingAndBadStrategy() {
        assertThrows(IllegalArgumentException.class, () ->
                facade.processPayment("missing-booking", new CreditCardPayment("4111111111111111", "12/30", "123", "A")));

        Student user = makeActiveStudent("payment-badstrategy@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-BAD-STRATEGY", EquipmentStatus.AVAILABLE, 30.0);
        equipmentDAO.save(equipment);
        Booking booking = makeBooking(
                user, equipment, BookingStatus.CONFIRMED,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(4)
        );
        bookingDAO.save(booking);

        assertThrows(IllegalArgumentException.class, () -> facade.processPayment(booking.getBookingID(), null));
    }

    @Test
    public void testMarkEquipmentAvailableAndUpdateStatusThrowWhenMissing() {
        assertThrows(IllegalArgumentException.class, () -> facade.markEquipmentAvailable("missing-equipment"));
        assertThrows(IllegalArgumentException.class, () ->
                facade.updateEquipmentStatus("missing-equipment", EquipmentStatus.AVAILABLE));
    }

    @Test
    public void testGetPaymentAndDepositReceiptReturnNullWhenMissing() {
        assertNull(facade.getPaymentReceipt("missing-booking"));
        assertNull(facade.getDepositReceipt("missing-booking"));
    }
}
