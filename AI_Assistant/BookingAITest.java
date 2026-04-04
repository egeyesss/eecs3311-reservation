package ca.yorku.eecs3311.model.booking;

import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.user.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

public class BookingAITest {

    private Booking booking;
    private Student testUser;
    private Equipment testEquipment;
    private LocalDateTime start;
    private LocalDateTime end;

    @BeforeEach
    public void setUp() {
        // Student flat fee is $10.0
        testUser = new Student("test@yorku.ca", "Pass123!", "EECS", "210000000", "Undergrad", 2);
        // Equipment hourly rate is $15.0
        testEquipment = new Equipment("EQ-1", "Oscilloscope", "Lab Tech", "Electronics", 15.0);

        start = LocalDateTime.now().plusDays(1).withHour(10).withMinute(0);
        end = start.plusHours(2); // 2 hour duration

        booking = new Booking(testUser, testEquipment, start, end);
    }

    @Test
    public void testBookingInitialization() {
        assertNotNull(booking.getBookingID());
        assertEquals(testUser, booking.getUser());
        assertEquals(testEquipment, booking.getEquipment());
        assertEquals(start, booking.getStartTime());
        assertEquals(end, booking.getEndTime());
        assertEquals(BookingStatus.PENDING, booking.getStatus());
    }

    @Test
    public void testTotalCostCalculationIncludesFlatFee() {
        // Base: 2 hours * $15.0/hr = $30.0
        // Flat Fee for STUDENT: $10.0
        // Total Expected: $40.0
        assertEquals(40.0, booking.getTotalCost(), 0.001);
    }

    @Test
    public void testDepositMatchesHourlyRate() {
        // Deposit should exactly match the equipment's hourly rate ($15.0)
        assertEquals(15.0, booking.getDepositAmount(), 0.001);
    }

    @Test
    public void testModifyTimesUpdatesDurationAndCost() {
        LocalDateTime newStart = start.plusHours(1);
        LocalDateTime newEnd = newStart.plusHours(3); // 3 hour duration

        booking.modifyTimes(newStart, newEnd);

        assertEquals(newStart, booking.getStartTime());
        assertEquals(3, booking.getDuration().toHours());
        // 3 hours * $15 + $10 student fee = $55.0
        assertEquals(55.0, booking.getTotalCost(), 0.001);
    }
}