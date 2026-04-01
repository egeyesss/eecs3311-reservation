package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.dao.BookingDAO;
import ca.yorku.eecs3311.dao.EquipmentDAO;
import ca.yorku.eecs3311.dao.UserDAO;
import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.equipment.Sensor;
import ca.yorku.eecs3311.model.equipment.SensorData;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.enums.EquipmentStatus;
import ca.yorku.eecs3311.model.user.Student;
import ca.yorku.eecs3311.model.user.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

public class BookingManagerManualTest {

    private static final Path USERS_FILE = Path.of("src/main/resources/data/users.csv");
    private static final Path EQUIPMENT_FILE = Path.of("src/main/resources/data/equipment.csv");
    private static final Path BOOKINGS_FILE = Path.of("src/main/resources/data/bookings.csv");

    private static final String USERS_HEADER =
            "userId,email,password,userType,accountStatus,registrationDate,department,credentialNumber,extraField1,extraField2,extraField3";
    private static final String EQUIPMENT_HEADER =
            "equipmentID,name,description,category,status,hourlyRate,maintenanceNotes,lastMaintenanceDate,labID";
    private static final String BOOKINGS_HEADER =
            "bookingID,userId,equipmentID,startTime,endTime,createdAt,arrivedAt,status,totalCost,depositPaid";

    private final Map<Path, String> originalContents = new HashMap<>();
    private final Map<Path, Boolean> originalExists = new HashMap<>();

    private BookingManager manager;
    private UserDAO userDAO;
    private EquipmentDAO equipmentDAO;
    private BookingDAO bookingDAO;

    @BeforeEach
    public void setUp() throws Exception {
        backupAndResetCsv(USERS_FILE, USERS_HEADER);
        backupAndResetCsv(EQUIPMENT_FILE, EQUIPMENT_HEADER);
        backupAndResetCsv(BOOKINGS_FILE, BOOKINGS_HEADER);

        resetBookingManagerSingleton();
        manager = BookingManager.getInstance();
        userDAO = manager.getUserDAO();
        equipmentDAO = manager.getEquipmentDAO();
        bookingDAO = manager.getBookingDAO();
    }

    @AfterEach
    public void tearDown() throws Exception {
        restoreCsv(USERS_FILE);
        restoreCsv(EQUIPMENT_FILE);
        restoreCsv(BOOKINGS_FILE);
        resetBookingManagerSingleton();
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

    private void resetBookingManagerSingleton() throws Exception {
        Field instanceField = BookingManager.class.getDeclaredField("instance");
        instanceField.setAccessible(true);
        instanceField.set(null, null);
    }

    private String unique(String prefix) {
        return prefix + "-" + UUID.randomUUID();
    }

    private Student makeActiveStudent(String email) {
        Student s = new Student(email, "StrongP@ss1", "EECS", unique("S"), "CS", 3);
        s.activate();
        return s;
    }

    private Equipment makeEquipment(String id, EquipmentStatus status) {
        Equipment e = new Equipment(id, "Eq-" + id, "Desc", "Category", 20.0);
        e.updateStatus(status);
        return e;
    }

    private Booking makeBooking(User user, Equipment equipment, BookingStatus status,
                                LocalDateTime start, LocalDateTime end) {
        Booking b = new Booking(user, equipment, start, end);
        switch (status) {
            case CONFIRMED:
                b.confirm();
                break;
            case ACTIVE:
                b.confirm();
                b.activate();
                break;
            case COMPLETED:
                b.confirm();
                b.activate();
                b.complete();
                break;
            case CANCELLED:
                b.cancel();
                break;
            default:
                break;
        }
        return b;
    }

    @Test
    public void testPipelineSetup() {
        assertTrue(true, "The testing pipeline is fully operational!");
    }

    @Test
    public void testBookingManager() {
        assertNotNull(manager);
    }

    @Test
    public void testGetInstance() {
        BookingManager second = BookingManager.getInstance();
        assertSame(manager, second);
    }

    @Test
    public void testRegisterToAllSensors() {
        Equipment equipment = makeEquipment("EQ-SENSOR", EquipmentStatus.AVAILABLE);
        Sensor sensor = new Sensor("S-1", "TEMP", equipment.getEquipmentID());
        equipment.addSensor(sensor);
        equipmentDAO.save(equipment);

        manager.registerToAllSensors(Collections.singletonList(equipment));

        SensorData abnormal = new SensorData(sensor.getSensorID(), "USAGE", Collections.emptyMap(), 95.0, Duration.ofHours(1));
        manager.update(abnormal);

        Equipment updated = equipmentDAO.findById(equipment.getEquipmentID());
        assertNotNull(updated);
        assertEquals(EquipmentStatus.UNDER_MAINTENANCE, updated.getStatus());
    }

    @Test
    public void testRegisterToAllSensorsHandlesNulls() {
        manager.registerToAllSensors(null);
        manager.registerToAllSensors(Collections.singletonList(null));
        manager.registerToAllSensors(Collections.singletonList(makeEquipment("EQ-NO-SENS", EquipmentStatus.AVAILABLE)));
        assertTrue(true);
    }

    @Test
    public void testProcessNoShows() throws Exception {
        User user = makeActiveStudent("noshow@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-NOSHOW", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking confirmedPast = makeBooking(
                user,
                equipment,
                BookingStatus.CONFIRMED,
                LocalDateTime.now().minusMinutes(40),
                LocalDateTime.now().plusMinutes(10)
        );
        bookingDAO.save(confirmedPast);

        Method processNoShows = BookingManager.class.getDeclaredMethod("processNoShows");
        processNoShows.setAccessible(true);
        processNoShows.invoke(manager);

        Booking reloaded = bookingDAO.findById(confirmedPast.getBookingID());
        assertNotNull(reloaded);
        assertEquals(BookingStatus.CANCELLED, reloaded.getStatus());
    }

    @Test
    public void testProcessNoShowsIgnoresNonEligibleBookings() throws Exception {
        User user = makeActiveStudent("noshow-ignore@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-NOSHOW-IGNORE", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking pendingPast = makeBooking(
                user,
                equipment,
                BookingStatus.PENDING,
                LocalDateTime.now().minusMinutes(40),
                LocalDateTime.now().plusMinutes(10)
        );
        Booking confirmedFuture = makeBooking(
                user,
                equipment,
                BookingStatus.CONFIRMED,
                LocalDateTime.now().plusMinutes(30),
                LocalDateTime.now().plusHours(1)
        );
        bookingDAO.save(pendingPast);
        bookingDAO.save(confirmedFuture);

        Method processNoShows = BookingManager.class.getDeclaredMethod("processNoShows");
        processNoShows.setAccessible(true);
        processNoShows.invoke(manager);

        assertEquals(BookingStatus.PENDING, bookingDAO.findById(pendingPast.getBookingID()).getStatus());
        assertEquals(BookingStatus.CONFIRMED, bookingDAO.findById(confirmedFuture.getBookingID()).getStatus());
    }

    @Test
    public void testUpdate() {
        User user = makeActiveStudent("update@test.com");
        userDAO.save(user);

        Equipment equipment = makeEquipment("EQ-UPDATE", EquipmentStatus.AVAILABLE);
        Sensor sensor = new Sensor("S-UPDATE", "TEMP", equipment.getEquipmentID());
        equipment.addSensor(sensor);
        equipmentDAO.save(equipment);

        Booking upcoming = makeBooking(
                user,
                equipment,
                BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(3)
        );
        bookingDAO.save(upcoming);

        manager.registerToAllSensors(Collections.singletonList(equipment));

        SensorData abnormal = new SensorData(sensor.getSensorID(), "USAGE", Collections.emptyMap(), 90.0, Duration.ofHours(2));
        manager.update(abnormal);

        Equipment updatedEquipment = equipmentDAO.findById(equipment.getEquipmentID());
        Booking updatedBooking = bookingDAO.findById(upcoming.getBookingID());

        assertNotNull(updatedEquipment);
        assertEquals(EquipmentStatus.UNDER_MAINTENANCE, updatedEquipment.getStatus());
        assertNotNull(updatedBooking);
        assertEquals(BookingStatus.CANCELLED, updatedBooking.getStatus());
    }

    @Test
    public void testUpdateIgnoresNullAndNormalData() {
        manager.update(null);

        SensorData normal = new SensorData("S-NORMAL", "USAGE", Collections.emptyMap(), 25.0, Duration.ofHours(1));
        manager.update(normal);

        assertTrue(true);
    }

    @Test
    public void testUpdateHandlesMissingMappingAndMissingEquipment() {
        SensorData abnormalUnmapped = new SensorData("S-UNMAPPED", "USAGE", Collections.emptyMap(), 99.0, Duration.ofHours(1));
        manager.update(abnormalUnmapped);

        Equipment transientEquipment = makeEquipment("EQ-NOT-SAVED", EquipmentStatus.AVAILABLE);
        Sensor sensor = new Sensor("S-MISSING-EQ", "TEMP", transientEquipment.getEquipmentID());
        transientEquipment.addSensor(sensor);
        manager.registerToAllSensors(Collections.singletonList(transientEquipment)); // mapped, but equipment not in DAO

        SensorData abnormalMappedMissing = new SensorData(sensor.getSensorID(), "USAGE", Collections.emptyMap(), 99.0, Duration.ofHours(1));
        manager.update(abnormalMappedMissing);

        assertTrue(true);
    }

    @Test
    public void testAutoCancelUpcomingBookings() throws Exception {
        User user = makeActiveStudent("autocancel@test.com");
        userDAO.save(user);

        Equipment equipment = makeEquipment("EQ-AUTO", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking pending = makeBooking(
                user,
                equipment,
                BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2),
                LocalDateTime.now().plusHours(3)
        );
        Booking confirmed = makeBooking(
                user,
                equipment,
                BookingStatus.CONFIRMED,
                LocalDateTime.now().plusHours(4),
                LocalDateTime.now().plusHours(5)
        );
        bookingDAO.save(pending);
        bookingDAO.save(confirmed);

        Method method = BookingManager.class.getDeclaredMethod("autoCancelUpcomingBookings", String.class);
        method.setAccessible(true);
        method.invoke(manager, equipment.getEquipmentID());

        Booking pReload = bookingDAO.findById(pending.getBookingID());
        Booking cReload = bookingDAO.findById(confirmed.getBookingID());
        assertEquals(BookingStatus.CANCELLED, pReload.getStatus());
        assertEquals(BookingStatus.CANCELLED, cReload.getStatus());
    }

    @Test
    public void testAutoCancelUpcomingBookingsSkipsPastCompletedAndCancelled() throws Exception {
        User user = makeActiveStudent("autocancel-skip@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-AUTO-SKIP", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking pastConfirmed = makeBooking(
                user, equipment, BookingStatus.CONFIRMED,
                LocalDateTime.now().minusHours(2), LocalDateTime.now().minusHours(1)
        );
        Booking completedUpcoming = makeBooking(
                user, equipment, BookingStatus.COMPLETED,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3)
        );
        Booking cancelledUpcoming = makeBooking(
                user, equipment, BookingStatus.CANCELLED,
                LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5)
        );
        bookingDAO.save(pastConfirmed);
        bookingDAO.save(completedUpcoming);
        bookingDAO.save(cancelledUpcoming);

        Method method = BookingManager.class.getDeclaredMethod("autoCancelUpcomingBookings", String.class);
        method.setAccessible(true);
        method.invoke(manager, equipment.getEquipmentID());

        assertEquals(BookingStatus.CONFIRMED, bookingDAO.findById(pastConfirmed.getBookingID()).getStatus());
        assertEquals(BookingStatus.COMPLETED, bookingDAO.findById(completedUpcoming.getBookingID()).getStatus());
        assertEquals(BookingStatus.CANCELLED, bookingDAO.findById(cancelledUpcoming.getBookingID()).getStatus());
    }

    @Test
    public void testIsEquipmentAvailable() {
        User user = makeActiveStudent("avail@test.com");
        userDAO.save(user);

        Equipment equipment = makeEquipment("EQ-AV", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(1);
        assertTrue(manager.isEquipmentAvailable(equipment.getEquipmentID(), start, end));

        Booking overlap = makeBooking(user, equipment, BookingStatus.PENDING, start.minusMinutes(30), end.plusMinutes(30));
        bookingDAO.save(overlap);

        assertFalse(manager.isEquipmentAvailable(equipment.getEquipmentID(), start, end));
    }

    @Test
    public void testIsEquipmentAvailableHandlesMissingAndBlockedEquipment() {
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(1);

        assertFalse(manager.isEquipmentAvailable("UNKNOWN-EQ", start, end));

        Equipment disabled = makeEquipment("EQ-DISABLED", EquipmentStatus.DISABLED);
        equipmentDAO.save(disabled);
        assertFalse(manager.isEquipmentAvailable(disabled.getEquipmentID(), start, end));

        Equipment maintenance = makeEquipment("EQ-MAINT", EquipmentStatus.UNDER_MAINTENANCE);
        equipmentDAO.save(maintenance);
        assertFalse(manager.isEquipmentAvailable(maintenance.getEquipmentID(), start, end));
    }

    @Test
    public void testIsEquipmentAvailableIgnoresCancelledAndCompletedOverlaps() {
        User user = makeActiveStudent("avail-ignore@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-IGNORE", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(3);
        LocalDateTime end = start.plusHours(1);

        Booking cancelledOverlap = makeBooking(user, equipment, BookingStatus.CANCELLED, start.minusMinutes(15), end.plusMinutes(15));
        Booking completedOverlap = makeBooking(user, equipment, BookingStatus.COMPLETED, start.minusMinutes(10), end.plusMinutes(10));
        bookingDAO.save(cancelledOverlap);
        bookingDAO.save(completedOverlap);

        assertTrue(manager.isEquipmentAvailable(equipment.getEquipmentID(), start, end));
    }

    @Test
    public void testCreateBooking() {
        User user = makeActiveStudent("create@test.com");
        userDAO.save(user);

        Equipment equipment = makeEquipment("EQ-CREATE", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(2);

        Booking booking = manager.createBooking(user.getUserId(), equipment.getEquipmentID(), start, end);

        assertNotNull(booking);
        assertEquals(BookingStatus.PENDING, booking.getStatus());
        assertNotNull(bookingDAO.findById(booking.getBookingID()));
    }

    @Test
    public void testCreateBookingThrowsWhenTooSoon() {
        User user = makeActiveStudent("create-soon@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-SOON", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusMinutes(30);
        LocalDateTime end = start.plusHours(1);

        assertThrows(IllegalStateException.class, () ->
                manager.createBooking(user.getUserId(), equipment.getEquipmentID(), start, end));
    }

    @Test
    public void testCreateBookingThrowsWhenDurationTooLong() {
        User user = makeActiveStudent("create-long@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-LONG", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(5);

        assertThrows(IllegalStateException.class, () ->
                manager.createBooking(user.getUserId(), equipment.getEquipmentID(), start, end));
    }

    @Test
    public void testCreateBookingThrowsWhenUnavailable() {
        User user = makeActiveStudent("create-unavail@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-UNAVAIL", EquipmentStatus.DISABLED);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(1);

        assertThrows(IllegalStateException.class, () ->
                manager.createBooking(user.getUserId(), equipment.getEquipmentID(), start, end));
    }

    @Test
    public void testCreateBookingWithUnknownUserTriggersFailurePath() {
        Equipment equipment = makeEquipment("EQ-UNKNOWN-USER", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(1);

        assertThrows(NullPointerException.class, () ->
                manager.createBooking("MISSING-USER", equipment.getEquipmentID(), start, end));
    }

    @Test
    public void testCreateBookingWithUnknownEquipmentThrowsAvailabilityError() {
        User user = makeActiveStudent("create-missing-eq@test.com");
        userDAO.save(user);
        LocalDateTime start = LocalDateTime.now().plusHours(2);
        LocalDateTime end = start.plusHours(1);

        assertThrows(IllegalStateException.class, () ->
                manager.createBooking(user.getUserId(), "MISSING-EQUIPMENT", start, end));
    }

    @Test
    public void testConfirmBooking() {
        User user = makeActiveStudent("confirm@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-CONF", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking booking = makeBooking(user, equipment, BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3));
        bookingDAO.save(booking);

        Booking confirmed = manager.confirmBooking(booking.getBookingID());

        assertEquals(BookingStatus.CONFIRMED, confirmed.getStatus());
    }

    @Test
    public void testConfirmBookingThrowsWhenMissing() {
        assertThrows(IllegalArgumentException.class, () -> manager.confirmBooking("missing"));
    }

    @Test
    public void testCancelBooking() {
        User user = makeActiveStudent("cancel@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-CAN", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking booking = makeBooking(user, equipment, BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3));
        bookingDAO.save(booking);

        Booking cancelled = manager.cancelBooking(booking.getBookingID());

        assertEquals(BookingStatus.CANCELLED, cancelled.getStatus());
    }

    @Test
    public void testCancelBookingThrowsWhenMissing() {
        assertThrows(IllegalArgumentException.class, () -> manager.cancelBooking("missing"));
    }

    @Test
    public void testExtendBooking() {
        User user = makeActiveStudent("extend@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-EXT", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Booking booking = makeBooking(user, equipment, BookingStatus.CONFIRMED, start, start.plusHours(1));
        bookingDAO.save(booking);

        Booking extended = manager.extendBooking(booking.getBookingID(), start.plusHours(3));

        assertEquals(start.plusHours(3), extended.getEndTime());
    }

    @Test
    public void testExtendBookingThrowsWhenMissing() {
        assertThrows(IllegalArgumentException.class, () ->
                manager.extendBooking("missing", LocalDateTime.now().plusHours(3)));
    }

    @Test
    public void testExtendBookingThrowsWhenDurationTooLong() {
        User user = makeActiveStudent("extend-long@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-EXT-LONG", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Booking booking = makeBooking(user, equipment, BookingStatus.CONFIRMED, start, start.plusHours(1));
        bookingDAO.save(booking);

        assertThrows(IllegalStateException.class, () ->
                manager.extendBooking(booking.getBookingID(), start.plusHours(5)));
    }

    @Test
    public void testExtendBookingThrowsWhenOverlap() {
        User user = makeActiveStudent("extend-overlap@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-EXT-OVER", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(2);
        Booking target = makeBooking(user, equipment, BookingStatus.CONFIRMED, start, start.plusHours(1));
        Booking other = makeBooking(user, equipment, BookingStatus.CONFIRMED, start.plusHours(2), start.plusHours(3));
        bookingDAO.save(target);
        bookingDAO.save(other);

        assertThrows(IllegalStateException.class, () ->
                manager.extendBooking(target.getBookingID(), start.plusHours(2).plusMinutes(15)));
    }

    @Test
    public void testModifyBooking() {
        User user = makeActiveStudent("modify@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-MOD", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(3);
        Booking booking = makeBooking(user, equipment, BookingStatus.PENDING, start, start.plusHours(1));
        bookingDAO.save(booking);

        LocalDateTime newStart = start.plusMinutes(30);
        LocalDateTime newEnd = newStart.plusHours(2);

        Booking modified = manager.modifyBooking(booking.getBookingID(), newStart, newEnd);

        assertEquals(newStart, modified.getStartTime());
        assertEquals(newEnd, modified.getEndTime());
    }

    @Test
    public void testModifyBookingThrowsWhenMissing() {
        assertThrows(IllegalArgumentException.class, () ->
                manager.modifyBooking("missing", LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3)));
    }

    @Test
    public void testModifyBookingThrowsAfterStartTime() {
        User user = makeActiveStudent("modify-after@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-MOD-AFTER", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking booking = makeBooking(user, equipment, BookingStatus.PENDING, LocalDateTime.now().minusMinutes(1), LocalDateTime.now().plusHours(1));
        bookingDAO.save(booking);

        assertThrows(IllegalStateException.class, () ->
                manager.modifyBooking(booking.getBookingID(), LocalDateTime.now().plusHours(1), LocalDateTime.now().plusHours(2)));
    }

    @Test
    public void testModifyBookingThrowsWhenDurationTooLong() {
        User user = makeActiveStudent("modify-long@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-MOD-LONG", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(3);
        Booking booking = makeBooking(user, equipment, BookingStatus.PENDING, start, start.plusHours(1));
        bookingDAO.save(booking);

        assertThrows(IllegalStateException.class, () ->
                manager.modifyBooking(booking.getBookingID(), start, start.plusHours(5)));
    }

    @Test
    public void testModifyBookingThrowsForCancelledOrCompleted() {
        User user = makeActiveStudent("modify-status@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-MOD-STATUS", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(3);
        Booking cancelled = makeBooking(user, equipment, BookingStatus.CANCELLED, start, start.plusHours(1));
        bookingDAO.save(cancelled);

        assertThrows(IllegalStateException.class, () ->
                manager.modifyBooking(cancelled.getBookingID(), start.plusMinutes(10), start.plusHours(1).plusMinutes(10)));
    }

    @Test
    public void testModifyBookingThrowsWhenOverlap() {
        User user = makeActiveStudent("modify-overlap@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-MOD-OVER", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        LocalDateTime start = LocalDateTime.now().plusHours(3);
        Booking target = makeBooking(user, equipment, BookingStatus.PENDING, start, start.plusHours(1));
        Booking other = makeBooking(user, equipment, BookingStatus.CONFIRMED, start.plusHours(2), start.plusHours(3));
        bookingDAO.save(target);
        bookingDAO.save(other);

        assertThrows(IllegalStateException.class, () ->
                manager.modifyBooking(target.getBookingID(), start.plusHours(1).plusMinutes(30), start.plusHours(2).plusMinutes(30)));
    }

    @Test
    public void testConfirmArrival() {
        User user = makeActiveStudent("arrival@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-ARR", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking confirmed = makeBooking(
                user,
                equipment,
                BookingStatus.CONFIRMED,
                LocalDateTime.now().minusMinutes(5),
                LocalDateTime.now().plusHours(1)
        );
        bookingDAO.save(confirmed);

        Booking arrived = manager.confirmArrival(confirmed.getBookingID());

        assertEquals(BookingStatus.ACTIVE, arrived.getStatus());
        assertNotNull(arrived.getArrivedAt());
    }

    @Test
    public void testConfirmArrivalThrowsWhenMissing() {
        assertThrows(IllegalArgumentException.class, () -> manager.confirmArrival("missing"));
    }

    @Test
    public void testConfirmArrivalThrowsBeforeStart() {
        User user = makeActiveStudent("arrival-before@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-ARR-BEFORE", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking confirmed = makeBooking(
                user, equipment, BookingStatus.CONFIRMED,
                LocalDateTime.now().plusMinutes(10), LocalDateTime.now().plusHours(1)
        );
        bookingDAO.save(confirmed);

        assertThrows(IllegalStateException.class, () -> manager.confirmArrival(confirmed.getBookingID()));
    }

    @Test
    public void testConfirmArrivalAfterWindowCancelsBooking() {
        User user = makeActiveStudent("arrival-late@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-ARR-LATE", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking confirmed = makeBooking(
                user, equipment, BookingStatus.CONFIRMED,
                LocalDateTime.now().minusMinutes(30), LocalDateTime.now().plusHours(1)
        );
        bookingDAO.save(confirmed);

        assertThrows(IllegalStateException.class, () -> manager.confirmArrival(confirmed.getBookingID()));
        assertEquals(BookingStatus.CANCELLED, bookingDAO.findById(confirmed.getBookingID()).getStatus());
    }

    @Test
    public void testCompleteBooking() {
        User user = makeActiveStudent("complete@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-COMP", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking active = makeBooking(
                user,
                equipment,
                BookingStatus.ACTIVE,
                LocalDateTime.now().minusMinutes(10),
                LocalDateTime.now().plusMinutes(50)
        );
        bookingDAO.save(active);

        Booking completed = manager.completeBooking(active.getBookingID());

        assertEquals(BookingStatus.COMPLETED, completed.getStatus());
        assertFalse(completed.getEquipment().getSensors().isEmpty());
    }

    @Test
    public void testCompleteBookingThrowsWhenMissing() {
        assertThrows(IllegalArgumentException.class, () -> manager.completeBooking("missing"));
    }

    @Test
    public void testCompleteBookingWithExistingSensor() {
        User user = makeActiveStudent("complete-sensor@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-COMP-SENSOR", EquipmentStatus.AVAILABLE);
        equipment.addSensor(new Sensor("S-COMP", "TEMP", equipment.getEquipmentID()));
        equipmentDAO.save(equipment);

        Booking active = makeBooking(
                user,
                equipment,
                BookingStatus.ACTIVE,
                LocalDateTime.now().minusMinutes(10),
                LocalDateTime.now().plusMinutes(40)
        );
        bookingDAO.save(active);

        Booking completed = manager.completeBooking(active.getBookingID());
        assertEquals(BookingStatus.COMPLETED, completed.getStatus());
        assertEquals(1, completed.getEquipment().getSensors().size());
    }

    @Test
    public void testFindBookingById() {
        User user = makeActiveStudent("findid@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-FIND", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking booking = makeBooking(user, equipment, BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3));
        bookingDAO.save(booking);

        Booking found = manager.findBookingById(booking.getBookingID());

        assertNotNull(found);
        assertEquals(booking.getBookingID(), found.getBookingID());
    }

    @Test
    public void testFindBookingByIdReturnsNullWhenMissing() {
        assertNull(manager.findBookingById("missing"));
    }

    @Test
    public void testGetBookingsByUser() {
        User user = makeActiveStudent("byuser@test.com");
        userDAO.save(user);
        Equipment e1 = makeEquipment("EQ-U1", EquipmentStatus.AVAILABLE);
        Equipment e2 = makeEquipment("EQ-U2", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(e1);
        equipmentDAO.save(e2);

        bookingDAO.save(makeBooking(user, e1, BookingStatus.PENDING, LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3)));
        bookingDAO.save(makeBooking(user, e2, BookingStatus.CONFIRMED, LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5)));

        List<Booking> list = manager.getBookingsByUser(user.getUserId());

        assertEquals(2, list.size());
    }

    @Test
    public void testGetBookingsByUserRunsNoShowProcessing() {
        User user = makeActiveStudent("byuser-noshow@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-BYUSER-NOSHOW", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking confirmedPast = makeBooking(
                user, equipment, BookingStatus.CONFIRMED,
                LocalDateTime.now().minusMinutes(40), LocalDateTime.now().plusMinutes(10)
        );
        bookingDAO.save(confirmedPast);

        manager.getBookingsByUser(user.getUserId());

        assertEquals(BookingStatus.CANCELLED, bookingDAO.findById(confirmedPast.getBookingID()).getStatus());
    }

    @Test
    public void testGetBookingsByEquipment() {
        User u1 = makeActiveStudent("eq1@test.com");
        User u2 = makeActiveStudent("eq2@test.com");
        userDAO.save(u1);
        userDAO.save(u2);

        Equipment equipment = makeEquipment("EQ-LIST", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        bookingDAO.save(makeBooking(u1, equipment, BookingStatus.PENDING, LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3)));
        bookingDAO.save(makeBooking(u2, equipment, BookingStatus.CONFIRMED, LocalDateTime.now().plusHours(4), LocalDateTime.now().plusHours(5)));

        List<Booking> list = manager.getBookingsByEquipment(equipment.getEquipmentID());

        assertEquals(2, list.size());
    }

    @Test
    public void testGetBookingsByUserAndEquipmentReturnEmptyForUnknownIds() {
        assertTrue(manager.getBookingsByUser("unknown-user").isEmpty());
        assertTrue(manager.getBookingsByEquipment("unknown-equipment").isEmpty());
    }

    @Test
    public void testGetAllBookings() {
        User user = makeActiveStudent("all@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-ALL", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking booking = makeBooking(user, equipment, BookingStatus.PENDING,
                LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(3));
        bookingDAO.save(booking);

        List<Booking> all = manager.getAllBookings();

        assertTrue(all.stream().anyMatch(b -> b.getBookingID().equals(booking.getBookingID())));
    }

    @Test
    public void testGetAllBookingsRunsNoShowProcessing() {
        User user = makeActiveStudent("all-noshow@test.com");
        userDAO.save(user);
        Equipment equipment = makeEquipment("EQ-ALL-NOSHOW", EquipmentStatus.AVAILABLE);
        equipmentDAO.save(equipment);

        Booking confirmedPast = makeBooking(
                user, equipment, BookingStatus.CONFIRMED,
                LocalDateTime.now().minusMinutes(45), LocalDateTime.now().plusMinutes(10)
        );
        bookingDAO.save(confirmedPast);

        manager.getAllBookings();

        assertEquals(BookingStatus.CANCELLED, bookingDAO.findById(confirmedPast.getBookingID()).getStatus());
    }

    @Test
    public void testgetEquipmentDAO() {
        assertNotNull(manager.getEquipmentDAO());
    }

    @Test
    public void testgetUserDAO() {
        assertNotNull(manager.getUserDAO());
    }

    @Test
    public void testGetBookingDAO() {
        assertNotNull(manager.getBookingDAO());
    }
}
