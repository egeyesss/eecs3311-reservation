package ca.yorku.eecs3311.model.booking;

import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.user.Student;
import ca.yorku.eecs3311.model.user.User;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BookingStateManualTest {

    private Booking makeBooking() {
        User user = new Student("state@test.com", "pw", "EECS", "S-1", "CS", 2);
        Equipment equipment = new Equipment("EQ-1", "Scope", "Oscilloscope", "Electronics", 15.0);
        LocalDateTime start = LocalDateTime.of(2026, 1, 1, 10, 0);
        LocalDateTime end = start.plusHours(2);
        return new Booking(user, equipment, start, end);
    }

    @Test
    public void testPipelineSetup() {
        // This is a dummy test just to prove Maven, JaCoCo, and PIT are connected
        // The member assigned to BookingManager would replace this with real tests.
        assertTrue(true, "The testing pipeline is fully operational!");
    }

    @Test
    public void testConfirm() {
        Booking booking = makeBooking();
        BookingState pending = new PendingState(booking);

        pending.confirm();
        assertEquals(BookingStatus.CONFIRMED, booking.getStatus());

        assertThrows(IllegalStateException.class, () -> new ConfirmedState(booking).confirm());
        assertThrows(IllegalStateException.class, () -> new ActiveState(booking).confirm());
        assertThrows(IllegalStateException.class, () -> new CompletedState(booking).confirm());
        assertThrows(IllegalStateException.class, () -> new CancelledState(booking).confirm());
    }

    @Test
    public void testCancel() {
        Booking b1 = makeBooking();
        new PendingState(b1).cancel();
        assertEquals(BookingStatus.CANCELLED, b1.getStatus());

        Booking b2 = makeBooking();
        new ConfirmedState(b2).cancel();
        assertEquals(BookingStatus.CANCELLED, b2.getStatus());

        Booking b3 = makeBooking();
        assertThrows(IllegalStateException.class, () -> new ActiveState(b3).cancel());
        assertThrows(IllegalStateException.class, () -> new CompletedState(b3).cancel());
        assertThrows(IllegalStateException.class, () -> new CancelledState(b3).cancel());
    }

    @Test
    public void testActivate() {
        Booking b1 = makeBooking();
        assertThrows(IllegalStateException.class, () -> new PendingState(b1).activate());

        Booking b2 = makeBooking();
        new ConfirmedState(b2).activate();
        assertEquals(BookingStatus.ACTIVE, b2.getStatus());

        Booking b3 = makeBooking();
        assertThrows(IllegalStateException.class, () -> new ActiveState(b3).activate());
        assertThrows(IllegalStateException.class, () -> new CompletedState(b3).activate());
        assertThrows(IllegalStateException.class, () -> new CancelledState(b3).activate());
    }

    @Test
    public void testComplete() {
        Booking b1 = makeBooking();
        assertThrows(IllegalStateException.class, () -> new PendingState(b1).complete());

        Booking b2 = makeBooking();
        assertThrows(IllegalStateException.class, () -> new ConfirmedState(b2).complete());

        Booking b3 = makeBooking();
        new ActiveState(b3).complete();
        assertEquals(BookingStatus.COMPLETED, b3.getStatus());

        Booking b4 = makeBooking();
        assertThrows(IllegalStateException.class, () -> new CompletedState(b4).complete());
        assertThrows(IllegalStateException.class, () -> new CancelledState(b4).complete());
    }

    @Test
    public void testExtend() {
        Booking b1 = makeBooking();
        LocalDateTime oldEnd = b1.getEndTime();
        LocalDateTime newEnd = oldEnd.plusHours(1);

        assertThrows(IllegalStateException.class, () -> new PendingState(b1).extend(newEnd));

        Booking b2 = makeBooking();
        new ConfirmedState(b2).extend(newEnd);
        assertEquals(newEnd, b2.getEndTime());

        Booking b3 = makeBooking();
        new ActiveState(b3).extend(newEnd);
        assertEquals(newEnd, b3.getEndTime());

        Booking b4 = makeBooking();
        assertThrows(IllegalStateException.class, () -> new CompletedState(b4).extend(newEnd));
        assertThrows(IllegalStateException.class, () -> new CancelledState(b4).extend(newEnd));
    }

    @Test
    public void testExtendInvalidInputsThrowInConfirmedAndActive() {
        Booking b1 = makeBooking();
        BookingState confirmed = new ConfirmedState(b1);
        assertThrows(IllegalArgumentException.class, () -> confirmed.extend(null));
        assertThrows(IllegalArgumentException.class, () -> confirmed.extend(b1.getEndTime()));
        assertThrows(IllegalArgumentException.class, () -> confirmed.extend(b1.getEndTime().minusMinutes(1)));

        Booking b2 = makeBooking();
        BookingState active = new ActiveState(b2);
        assertThrows(IllegalArgumentException.class, () -> active.extend(null));
        assertThrows(IllegalArgumentException.class, () -> active.extend(b2.getEndTime()));
        assertThrows(IllegalArgumentException.class, () -> active.extend(b2.getEndTime().minusMinutes(1)));
    }

    @Test
    public void testGetStateName() {
        Booking booking = makeBooking();
        assertEquals("PENDING", new PendingState(booking).getStateName());
        assertEquals("CONFIRMED", new ConfirmedState(booking).getStateName());
        assertEquals("ACTIVE", new ActiveState(booking).getStateName());
        assertEquals("COMPLETED", new CompletedState(booking).getStateName());
        assertEquals("CANCELLED", new CancelledState(booking).getStateName());
    }


}
