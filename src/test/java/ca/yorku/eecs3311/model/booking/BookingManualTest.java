package ca.yorku.eecs3311.model.booking;

import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.user.Faculty;
import ca.yorku.eecs3311.model.user.Guest;
import ca.yorku.eecs3311.model.user.Researcher;
import ca.yorku.eecs3311.model.user.Student;
import ca.yorku.eecs3311.model.user.User;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class BookingManualTest {

    private Equipment makeEquipment(double hourlyRate) {
        return new Equipment("EQ-1", "Oscilloscope", "Digital scope", "Electronics", hourlyRate);
    }

    private Student makeStudent() {
        return new Student("student@yorku.ca", "pass", "EECS", "S-1", "CS", 3);
    }

    private Faculty makeFaculty() {
        return new Faculty("faculty@yorku.ca", "pass", "EECS", "F-1", "Professor");
    }

    private Researcher makeResearcher() {
        return new Researcher("researcher@yorku.ca", "pass", "EECS", "R-1", "AI", "G-100");
    }

    private Guest makeGuest() {
        return new Guest("guest@yorku.ca", "pass", "External", "G-1", "Org", "sponsor@yorku.ca");
    }

    private Booking makePendingBooking() {
        LocalDateTime start = LocalDateTime.of(2026, 1, 1, 10, 0);
        LocalDateTime end = start.plusHours(2);
        return new Booking(makeStudent(), makeEquipment(12.0), start, end);
    }

    @Test
    public void testBookingPlaceholder() {
        // Placeholder for the team member assigned to test the Booking State patterns
        assertTrue(true);
    }

    @Test
    public void testNewBooking() {
        LocalDateTime beforeCreation = LocalDateTime.now();
        LocalDateTime start = LocalDateTime.of(2026, 1, 1, 9, 0);
        LocalDateTime end = start.plusHours(2);
        User user = makeStudent();
        Equipment equipment = makeEquipment(20.0);

        Booking booking = new Booking(user, equipment, start, end);

        assertNotNull(booking.getBookingID());
        assertEquals(user, booking.getUser());
        assertEquals(equipment, booking.getEquipment());
        assertEquals(start, booking.getStartTime());
        assertEquals(end, booking.getEndTime());
        assertEquals(Duration.ofHours(2), booking.getDuration());
        assertEquals(BookingStatus.PENDING, booking.getStatus());
        assertTrue(booking.getState() instanceof PendingState);
        assertEquals(50.0, booking.getTotalCost(), 0.0001); // 2*20 + student flat fee 10
        assertEquals(0.0, booking.getDepositPaid(), 0.0001);
        assertNotNull(booking.getCreatedAt());
        assertFalse(booking.getCreatedAt().isBefore(beforeCreation));
    }

    @Test
    public void testBooking() {
        LocalDateTime start = LocalDateTime.of(2026, 2, 1, 8, 0);
        LocalDateTime end = start.plusHours(3);
        LocalDateTime created = LocalDateTime.of(2026, 1, 31, 7, 0);
        LocalDateTime arrived = LocalDateTime.of(2026, 2, 1, 7, 50);
        String bookingId = "B-123";
        User user = makeFaculty();
        Equipment equipment = makeEquipment(25.0);

        Booking booking = new Booking(bookingId, user, equipment, start, end, created, arrived,
                BookingStatus.ACTIVE, 123.45, 50.0);

        assertEquals(bookingId, booking.getBookingID());
        assertEquals(user, booking.getUser());
        assertEquals(equipment, booking.getEquipment());
        assertEquals(start, booking.getStartTime());
        assertEquals(end, booking.getEndTime());
        assertEquals(created, booking.getCreatedAt());
        assertEquals(arrived, booking.getArrivedAt());
        assertEquals(BookingStatus.ACTIVE, booking.getStatus());
        assertEquals(123.45, booking.getTotalCost(), 0.0001);
        assertEquals(50.0, booking.getDepositPaid(), 0.0001);
        assertEquals(Duration.ofHours(3), booking.getDuration());
        assertTrue(booking.getState() instanceof PendingState);
    }

    @Test
    public void testGetDepositAmount() {
        Booking booking = makePendingBooking();
        assertEquals(12.0, booking.getDepositAmount(), 0.0001);
    }

    @Test
    public void testCalculateCost() {
        LocalDateTime start = LocalDateTime.of(2026, 1, 1, 10, 0);
        LocalDateTime end = start.plusHours(2);
        Equipment equipment = makeEquipment(10.0);

        Booking studentBooking = new Booking(makeStudent(), equipment, start, end);
        Booking facultyBooking = new Booking(makeFaculty(), equipment, start, end);
        Booking researcherBooking = new Booking(makeResearcher(), equipment, start, end);
        Booking guestBooking = new Booking(makeGuest(), equipment, start, end);

        assertEquals(30.0, studentBooking.calculateCost(), 0.0001);    // 20 + 10
        assertEquals(35.0, facultyBooking.calculateCost(), 0.0001);    // 20 + 15
        assertEquals(40.0, researcherBooking.calculateCost(), 0.0001); // 20 + 20
        assertEquals(50.0, guestBooking.calculateCost(), 0.0001);      // 20 + 30
    }

    @Test
    public void testSetState() {
        Booking booking = makePendingBooking();
        booking.setState(new ActiveState(booking));

        assertTrue(booking.getState() instanceof ActiveState);
        assertEquals(BookingStatus.ACTIVE, booking.getStatus());
    }

    @Test
    public void testConfirm() {
        Booking booking = makePendingBooking();

        booking.confirm();

        assertTrue(booking.getState() instanceof ConfirmedState);
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());
        assertFalse(booking.getEquipment().isAvailable());
    }

    @Test
    public void testCancel() {
        Booking booking = makePendingBooking();

        booking.cancel();

        assertTrue(booking.getState() instanceof CancelledState);
        assertEquals(BookingStatus.CANCELLED, booking.getStatus());
        assertTrue(booking.getEquipment().isAvailable());
    }

    @Test
    public void testActivate() {
        Booking booking = makePendingBooking();
        booking.confirm();

        booking.activate();

        assertTrue(booking.getState() instanceof ActiveState);
        assertEquals(BookingStatus.ACTIVE, booking.getStatus());
        assertFalse(booking.getEquipment().isAvailable());
    }

    @Test
    public void testComplete() {
        Booking booking = makePendingBooking();
        booking.confirm();
        booking.activate();

        booking.complete();

        assertTrue(booking.getState() instanceof CompletedState);
        assertEquals(BookingStatus.COMPLETED, booking.getStatus());
        assertTrue(booking.getEquipment().isAvailable());
    }

    @Test
    public void testExtend() {
        Booking booking = makePendingBooking();
        booking.confirm();

        LocalDateTime newEnd = booking.getEndTime().plusHours(2);
        booking.extend(newEnd);

        assertEquals(newEnd, booking.getEndTime());
        assertEquals(Duration.ofHours(4), booking.getDuration());
        assertEquals(58.0, booking.getTotalCost(), 0.0001); // 4*12 + student flat fee 10
    }

    @Test
    public void testSetEndTime() {
        Booking booking = makePendingBooking();
        LocalDateTime newEnd = booking.getEndTime().plusHours(1);

        booking.setEndTime(newEnd);

        assertEquals(newEnd, booking.getEndTime());
        assertEquals(Duration.ofHours(3), booking.getDuration());
    }

    @Test
    public void testModifyTimes() {
        Booking booking = makePendingBooking();
        LocalDateTime newStart = booking.getStartTime().plusHours(1);
        LocalDateTime newEnd = newStart.plusHours(5);

        booking.modifyTimes(newStart, newEnd);

        assertEquals(newStart, booking.getStartTime());
        assertEquals(newEnd, booking.getEndTime());
        assertEquals(Duration.ofHours(5), booking.getDuration());
        assertEquals(70.0, booking.getTotalCost(), 0.0001); // 5*12 + 10
    }

    @Test
    public void testGetBookingID() {
        Booking booking = makePendingBooking();
        assertNotNull(booking.getBookingID());
        assertFalse(booking.getBookingID().isBlank());
    }

    @Test
    public void testGetUser() {
        User user = makeStudent();
        Booking booking = new Booking(user, makeEquipment(12.0),
                LocalDateTime.of(2026, 1, 1, 10, 0),
                LocalDateTime.of(2026, 1, 1, 12, 0));

        assertEquals(user, booking.getUser());
    }

    @Test
    public void testGetEquipment() {
        Equipment equipment = makeEquipment(12.0);
        Booking booking = new Booking(makeStudent(), equipment,
                LocalDateTime.of(2026, 1, 1, 10, 0),
                LocalDateTime.of(2026, 1, 1, 12, 0));

        assertEquals(equipment, booking.getEquipment());
    }

    @Test
    public void testGetStartTime() {
        LocalDateTime start = LocalDateTime.of(2026, 3, 1, 11, 0);
        Booking booking = new Booking(makeStudent(), makeEquipment(12.0), start, start.plusHours(1));

        assertEquals(start, booking.getStartTime());
    }

    @Test
    public void testGetEndTime() {
        LocalDateTime end = LocalDateTime.of(2026, 3, 1, 13, 0);
        Booking booking = new Booking(makeStudent(), makeEquipment(12.0), end.minusHours(1), end);

        assertEquals(end, booking.getEndTime());
    }

    @Test
    public void testGetCreationTime() {
        Booking booking = makePendingBooking();
        assertNotNull(booking.getCreatedAt());
    }

    @Test
    public void testgetArrivedAt() {
        Booking booking = makePendingBooking();
        assertNull(booking.getArrivedAt());
    }

    @Test
    public void testGetStatus() {
        Booking booking = makePendingBooking();
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    public void testGetState() {
        Booking booking = makePendingBooking();
        assertTrue(booking.getState() instanceof PendingState);
    }

    @Test
    public void testGetTotalCost() {
        Booking booking = makePendingBooking();
        assertEquals(34.0, booking.getTotalCost(), 0.0001); // 2*12 + 10
    }

    @Test
    public void testGetDepositPaid() {
        Booking booking = makePendingBooking();
        assertEquals(0.0, booking.getDepositPaid(), 0.0001);
    }

    @Test
    public void testSetArrivedAt() {
        Booking booking = makePendingBooking();
        LocalDateTime arrivedAt = LocalDateTime.of(2026, 1, 1, 9, 55);

        booking.setArrivedAt(arrivedAt);

        assertEquals(arrivedAt, booking.getArrivedAt());
    }

    @Test
    public void testSetDepositPaid() {
        Booking booking = makePendingBooking();

        booking.setDepositPaid(40.0);

        assertEquals(40.0, booking.getDepositPaid(), 0.0001);
    }

    @Test
    public void testToString() {
        Booking booking = makePendingBooking();
        String text = booking.toString();

        assertTrue(text.contains(booking.getBookingID()));
        assertTrue(text.contains(booking.getUser().getEmail()));
        assertTrue(text.contains(booking.getEquipment().getName()));
        assertTrue(text.contains(booking.getStatus().toString()));
    }

    @Test
    public void testInvalidStateTransitionsThrowExceptions() {
        Booking booking = makePendingBooking();

        assertThrows(IllegalStateException.class, booking::activate);
        assertThrows(IllegalStateException.class, booking::complete);
        assertThrows(IllegalStateException.class, () -> booking.extend(booking.getEndTime().plusHours(1)));

        booking.confirm();
        booking.activate();
        assertThrows(IllegalStateException.class, booking::cancel);
    }

    @Test
    public void testExtendThrowsForNullOrEarlierEnd() {
        Booking booking = makePendingBooking();
        booking.confirm();

        assertThrows(IllegalArgumentException.class, () -> booking.extend(null));
        assertThrows(IllegalArgumentException.class, () -> booking.extend(booking.getEndTime()));
        assertThrows(IllegalArgumentException.class, () -> booking.extend(booking.getEndTime().minusMinutes(1)));
    }

    @Test
    public void testModifyTimesWithSubHourDurationUsesMinimumOneHourBilling() {
        Booking booking = makePendingBooking();
        LocalDateTime start = LocalDateTime.of(2026, 1, 1, 10, 0);
        LocalDateTime end = start.plusMinutes(30);

        booking.modifyTimes(start, end);

        assertEquals(Duration.ofMinutes(30), booking.getDuration());
        assertEquals(22.0, booking.getTotalCost(), 0.0001); // 1*12 + 10 flat fee
    }

}
