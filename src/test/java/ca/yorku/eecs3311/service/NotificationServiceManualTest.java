package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.user.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceManualTest {

    private NotificationService notificationService;
    private Student testUser;
    private Equipment testEquipment;
    private Booking testBooking;

    @BeforeEach
    public void setUp() {
        notificationService = new NotificationService();
        testUser = new Student("notify@test.com", "pass", "EECS", "S-1", "CS", 1);
        testEquipment = new Equipment("EQ-1", "Microscope", "Lab Scope", "Microscopy", 20.0);
        testBooking = new Booking(testUser, testEquipment, LocalDateTime.now(), LocalDateTime.now().plusHours(1));
    }

    @Test
    public void testNotifyBookingCreated() {
        notificationService.notifyBookingCreated(testUser, testBooking);
        List<String> logs = notificationService.getNotifications();
        assertEquals(1, logs.size());
        assertTrue(logs.get(0).contains("Booking created"));
        assertTrue(logs.get(0).contains("notify@test.com"));
    }

    @Test
    public void testNotifyBookingConfirmedAndCancelled() {
        notificationService.notifyBookingConfirmed(testUser, testBooking);
        notificationService.notifyBookingCancelled(testUser, testBooking);

        List<String> logs = notificationService.getNotifications();
        assertEquals(2, logs.size());
        assertTrue(logs.get(0).contains("Booking confirmed"));
        assertTrue(logs.get(1).contains("Booking cancelled"));
    }

    @Test
    public void testMaintenanceAndApprovalAlerts() {
        notificationService.sendMaintenanceAlert(testEquipment);
        notificationService.sendApprovalNotification(testUser);

        List<String> logs = notificationService.getNotifications();
        assertTrue(logs.get(0).contains("Maintenance alert: Microscope"));
        assertTrue(logs.get(1).contains("Account/request approved"));
    }

    @Test
    public void testGetNotificationsReturnsUnmodifiableList() {
        notificationService.notifyBookingCreated(testUser, testBooking);
        List<String> logs = notificationService.getNotifications();

        // This explicitly kills a PIT mutant that might try to return a modifiable list
        assertThrows(UnsupportedOperationException.class, () -> logs.add("Hack the list"));
    }
}