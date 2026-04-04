package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.equipment.Equipment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class BookingManagerAITest {

    private BookingManager manager;

    @BeforeEach
    public void setUp() {
        manager = BookingManager.getInstance();
    }

    @Test
    public void testSingletonInstance() {
        BookingManager anotherInstance = BookingManager.getInstance();
        assertSame(manager, anotherInstance);
    }

    @Test
    public void testCreateBookingTimeConstraints() {
        // Validation 1: Less than 1 hour in advance
        assertThrows(IllegalStateException.class, () -> {
            manager.createBooking("U1", "E1", LocalDateTime.now().plusMinutes(30), LocalDateTime.now().plusHours(2));
        });

        // Validation 2: Duration exceeds 4 hours max limit
        assertThrows(IllegalStateException.class, () -> {
            manager.createBooking("U1", "E1", LocalDateTime.now().plusHours(2), LocalDateTime.now().plusHours(7));
        });
    }

    @Test
    public void testInvalidBookingIDThrowsException() {
        // Because "fake-id" is not in the DAO, these should all immediately throw IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> manager.confirmBooking("fake-id"));
        assertThrows(IllegalArgumentException.class, () -> manager.cancelBooking("fake-id"));
        assertThrows(IllegalArgumentException.class, () -> manager.confirmArrival("fake-id"));
        assertThrows(IllegalArgumentException.class, () -> manager.completeBooking("fake-id"));

        assertThrows(IllegalArgumentException.class, () -> {
            manager.extendBooking("fake-id", LocalDateTime.now().plusHours(1));
        });

        assertThrows(IllegalArgumentException.class, () -> {
            manager.modifyBooking("fake-id", LocalDateTime.now(), LocalDateTime.now().plusHours(1));
        });
    }

    @Test
    public void testRegisterToAllSensorsNullSafety() {
        // The method should gracefully ignore null inputs without crashing
        manager.registerToAllSensors(null);

        List<Equipment> listWithNull = new ArrayList<>();
        listWithNull.add(null);
        manager.registerToAllSensors(listWithNull);

        // If it reaches this point without a NullPointerException, the test passes
        assertTrue(true);
    }
}