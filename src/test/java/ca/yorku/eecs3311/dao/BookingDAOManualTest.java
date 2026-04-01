package ca.yorku.eecs3311.dao;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.user.Student;
import ca.yorku.eecs3311.model.user.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookingDAOManualTest {

    private static final String BOOKING_FILE = "src/main/resources/data/bookings.csv";
    private static final String HEADER =
            "bookingID,userId,equipmentID,startTime,endTime,createdAt,arrivedAt,status,totalCost,depositPaid";

    private Path bookingPath;
    private String originalBookingCsv;
    private boolean bookingFileExisted;

    private StubUserDAO userDAO;
    private StubEquipmentDAO equipmentDAO;
    private BookingDAO bookingDAO;
    private User user;
    private Equipment equipment;

    private static class StubUserDAO extends UserDAO {
        private final User user;

        StubUserDAO(User user) {
            this.user = user;
        }

        @Override
        public User findById(String userId) {
            return user != null && user.getUserId().equals(userId) ? user : null;
        }
    }

    private static class StubEquipmentDAO extends EquipmentDAO {
        private final Equipment equipment;

        StubEquipmentDAO(Equipment equipment) {
            this.equipment = equipment;
        }

        @Override
        public Equipment findById(String equipmentId) {
            return equipment != null && equipment.getEquipmentID().equals(equipmentId) ? equipment : null;
        }
    }

    @BeforeEach
    public void setUp() throws IOException {
        bookingPath = Path.of(BOOKING_FILE);
        bookingFileExisted = Files.exists(bookingPath);
        if (bookingFileExisted) {
            originalBookingCsv = Files.readString(bookingPath, StandardCharsets.UTF_8);
        } else {
            originalBookingCsv = null;
            Path parent = bookingPath.getParent();
            if (parent != null) {
                Files.createDirectories(parent);
            }
        }

        user = new Student("student@test.com", "pw", "EECS", "S-100", "CS", 3);
        equipment = new Equipment("EQ-100", "Microscope", "Optical microscope", "Bio", 20.0);
        userDAO = new StubUserDAO(user);
        equipmentDAO = new StubEquipmentDAO(equipment);
        bookingDAO = new BookingDAO(userDAO, equipmentDAO);
        writeRows(new ArrayList<>());
    }

    @AfterEach
    public void tearDown() throws IOException {
        if (bookingFileExisted) {
            Files.writeString(bookingPath, originalBookingCsv, StandardCharsets.UTF_8);
        } else {
            Files.deleteIfExists(bookingPath);
        }
    }

    private void writeRows(List<String> rows) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append(HEADER).append(System.lineSeparator());
        for (String row : rows) {
            sb.append(row).append(System.lineSeparator());
        }
        Files.writeString(bookingPath, sb.toString(), StandardCharsets.UTF_8);
    }

    private String makeRow(String bookingId, String userId, String equipmentId, BookingStatus status) {
        LocalDateTime start = LocalDateTime.of(2026, 1, 10, 9, 0);
        LocalDateTime end = start.plusHours(2);
        LocalDateTime created = LocalDateTime.of(2026, 1, 1, 10, 0);
        return String.join(",",
                bookingId,
                userId,
                equipmentId,
                start.toString(),
                end.toString(),
                created.toString(),
                "",
                status.name(),
                "50.0",
                "10.0");
    }

    private Booking makeBooking(String bookingId) {
        LocalDateTime start = LocalDateTime.of(2026, 2, 1, 12, 0);
        LocalDateTime end = start.plusHours(3);
        LocalDateTime created = LocalDateTime.of(2026, 1, 31, 9, 0);
        return new Booking(bookingId, user, equipment, start, end, created, null,
                BookingStatus.PENDING, 75.0, 15.0);
    }

    @Test
    public void testPipelineSetup() {
        // This is a dummy test just to prove Maven, JaCoCo, and PIT are connected
        // The member assigned to BookingManager would replace this with real tests.
        assertTrue(true, "The testing pipeline is fully operational!");
    }

    @Test
    public void testBookingDAO() {
        assertNotNull(bookingDAO);
        assertNotNull(bookingDAO.loadAll());
    }

    @Test
    public void testLoadAll() throws IOException {
        List<String> rows = List.of(
                makeRow("B-1", user.getUserId(), equipment.getEquipmentID(), BookingStatus.PENDING),
                makeRow("B-2", user.getUserId(), equipment.getEquipmentID(), BookingStatus.CONFIRMED)
        );
        writeRows(rows);

        List<Booking> all = bookingDAO.loadAll();

        assertEquals(2, all.size());
        assertEquals("B-1", all.get(0).getBookingID());
        assertEquals("B-2", all.get(1).getBookingID());
    }

    @Test
    public void testFindById() throws IOException {
        writeRows(List.of(makeRow("B-LOOKUP", user.getUserId(), equipment.getEquipmentID(), BookingStatus.PENDING)));

        Booking found = bookingDAO.findById("B-LOOKUP");
        Booking missing = bookingDAO.findById("NOPE");

        assertNotNull(found);
        assertEquals("B-LOOKUP", found.getBookingID());
        assertNull(missing);
    }

    @Test
    public void testFindByUserId() throws IOException {
        writeRows(List.of(
                makeRow("B-U1", user.getUserId(), equipment.getEquipmentID(), BookingStatus.PENDING),
                makeRow("B-U2", user.getUserId(), equipment.getEquipmentID(), BookingStatus.CONFIRMED),
                makeRow("B-OTHER", "unknown-user", equipment.getEquipmentID(), BookingStatus.PENDING)
        ));

        List<Booking> byUser = bookingDAO.findByUserId(user.getUserId());

        assertEquals(2, byUser.size());
        assertEquals("B-U1", byUser.get(0).getBookingID());
        assertEquals("B-U2", byUser.get(1).getBookingID());
    }

    @Test
    public void testFindByEquipmentId() throws IOException {
        writeRows(List.of(
                makeRow("B-E1", user.getUserId(), equipment.getEquipmentID(), BookingStatus.PENDING),
                makeRow("B-E2", user.getUserId(), equipment.getEquipmentID(), BookingStatus.CANCELLED),
                makeRow("B-OTHER", user.getUserId(), "unknown-eq", BookingStatus.PENDING)
        ));

        List<Booking> byEquipment = bookingDAO.findByEquipmentId(equipment.getEquipmentID());

        assertEquals(2, byEquipment.size());
        assertEquals("B-E1", byEquipment.get(0).getBookingID());
        assertEquals("B-E2", byEquipment.get(1).getBookingID());
    }

    @Test
    public void testSave() {
        Booking booking = makeBooking("B-SAVE");

        bookingDAO.save(booking);
        Booking loaded = bookingDAO.findById("B-SAVE");

        assertNotNull(loaded);
        assertEquals("B-SAVE", loaded.getBookingID());

        booking.setDepositPaid(99.0);
        bookingDAO.save(booking);
        Booking updated = bookingDAO.findById("B-SAVE");
        assertNotNull(updated);
        assertEquals(99.0, updated.getDepositPaid(), 0.0001);

    }

    @Test
    public void testUpdateStatus() {
        Booking booking = makeBooking("B-STATUS");
        bookingDAO.save(booking);

        bookingDAO.updateStatus("B-STATUS", BookingStatus.CONFIRMED);
        Booking confirmed = bookingDAO.findById("B-STATUS");
        assertNotNull(confirmed);
        assertEquals(BookingStatus.CONFIRMED, confirmed.getStatus());
    }

    @Test
    public void testDelete() {
        bookingDAO.save(makeBooking("B-DEL"));
        assertNotNull(bookingDAO.findById("B-DEL"));

        bookingDAO.delete("B-DEL");

        assertNull(bookingDAO.findById("B-DEL"));
    }

    @Test
    public void testParseRow() throws Exception {
        Method parseRow = BookingDAO.class.getDeclaredMethod("parseRow", String[].class);
        parseRow.setAccessible(true);

        String[] valid = makeRow("B-PR", user.getUserId(), equipment.getEquipmentID(), BookingStatus.ACTIVE)
                .split(",", -1);
        Booking parsed = (Booking) parseRow.invoke(bookingDAO, (Object) valid);

        assertNotNull(parsed);
        assertEquals("B-PR", parsed.getBookingID());
        assertEquals(BookingStatus.ACTIVE, parsed.getStatus());

        String[] unresolved = makeRow("B-PR2", "missing-user", equipment.getEquipmentID(), BookingStatus.PENDING)
                .split(",", -1);
        Booking shouldBeNull = (Booking) parseRow.invoke(bookingDAO, (Object) unresolved);
        assertNull(shouldBeNull);
    }

    @Test
    public void testToRow() throws Exception {
        Method toRow = BookingDAO.class.getDeclaredMethod("toRow", Booking.class);
        toRow.setAccessible(true);

        Booking booking = makeBooking("B-TOROW");
        String row = (String) toRow.invoke(bookingDAO, booking);
        String[] parts = row.split(",", -1);

        assertEquals(10, parts.length);
        assertEquals("B-TOROW", parts[0]);
        assertEquals(user.getUserId(), parts[1]);
        assertEquals(equipment.getEquipmentID(), parts[2]);
        assertEquals(booking.getStatus().name(), parts[7]);
    }

    @Test
    public void testWriteAll() throws Exception {
        Method writeAll = BookingDAO.class.getDeclaredMethod("writeAll", List.class);
        writeAll.setAccessible(true);

        Booking booking = makeBooking("B-WRITE");
        writeAll.invoke(bookingDAO, List.of(booking));

        String content = Files.readString(bookingPath, StandardCharsets.UTF_8);
        assertTrue(content.contains(HEADER));
        assertTrue(content.contains("B-WRITE"));
    }

    @Test
    public void testLoadAllSkipsMalformedRows() throws IOException {
        writeRows(List.of(
                "bad,row,with,too,few,columns",
                makeRow("B-GOOD", user.getUserId(), equipment.getEquipmentID(), BookingStatus.PENDING)
        ));

        List<Booking> all = bookingDAO.loadAll();

        assertEquals(1, all.size());
        assertEquals("B-GOOD", all.get(0).getBookingID());
    }

    @Test
    public void testUpdateStatusToInvalidTransitionThrows() {
        Booking booking = makeBooking("B-TRANSITION");
        bookingDAO.save(booking); // starts in PENDING

        assertThrows(IllegalStateException.class, () ->
                bookingDAO.updateStatus("B-TRANSITION", BookingStatus.ACTIVE));
    }

    @Test
    public void testParseRowWithTooFewColumnsReturnsNull() throws Exception {
        Method parseRow = BookingDAO.class.getDeclaredMethod("parseRow", String[].class);
        parseRow.setAccessible(true);

        Booking parsed = (Booking) parseRow.invoke(bookingDAO, (Object) new String[]{"only", "few"});
        assertNull(parsed);
    }
}
