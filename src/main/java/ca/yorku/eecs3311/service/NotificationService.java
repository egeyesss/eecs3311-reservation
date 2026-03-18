package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.user.User;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// some additions made by Ege, shown with "Added" after Gurnoor completed
public class NotificationService {

    // Added: stores notification history so the UI can retrieve and display past alerts
    private final List<String> notifications = new ArrayList<>();

    public void notifyBookingCreated(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking created for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID());
        // Added: persists message to history list so the UI can show it later
        notifications.add("Booking created for " + user.getEmail()
                + " | ID: " + booking.getBookingID());
    }

    public void notifyBookingConfirmed(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking confirmed for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID());
        // Added: persists message to history list so the UI can show it later
        notifications.add("Booking confirmed for " + user.getEmail()
                + " | ID: " + booking.getBookingID());
    }

    public void notifyBookingCancelled(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking cancelled for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID());
        // Added: persists message to history list so the UI can show it later
        notifications.add("Booking cancelled for " + user.getEmail()
                + " | ID: " + booking.getBookingID());
    }

    public void notifyBookingExtended(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking extended for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID()
                + " | New end time: " + booking.getEndTime());
        // Added: persists message to history list so the UI can show it later
        notifications.add("Booking extended for " + user.getEmail()
                + " | New end: " + booking.getEndTime());
    }

    public void notifyEquipmentUnavailable(Equipment equipment) {
        System.out.println("[NOTIFICATION] Equipment unavailable: "
                + equipment.getName()
                + " | Equipment ID: " + equipment.getEquipmentID());
        // Added: persists message to history list so the UI can show it later
        notifications.add("Equipment unavailable: " + equipment.getName()
                + " | ID: " + equipment.getEquipmentID());
    }

    // Added: context-specified method name for confirmation; delegates to notifyBookingConfirmed for consistency
    public void sendBookingConfirmation(User user, Booking booking) {
        notifyBookingConfirmed(user, booking);
    }

    // Added: required by context spec; notifies user of their upcoming start time to prevent no-shows
    public void sendArrivalReminder(User user, Booking booking) {
        String msg = "Arrival reminder for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID()
                + " | Starts at: " + booking.getStartTime();
        System.out.println("[NOTIFICATION] " + msg);
        notifications.add(msg);
    }

    // Added: required by context spec; tells user their deposit was forfeited due to a no-show
    public void sendDepositForfeitureNotice(User user, Booking booking) {
        String msg = "Deposit forfeited for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID()
                + " | Amount: $" + booking.getDepositPaid();
        System.out.println("[NOTIFICATION] " + msg);
        notifications.add(msg);
    }

    // Added: required by context spec; alerts manager/admin when equipment requires maintenance
    public void sendMaintenanceAlert(Equipment equipment) {
        String msg = "Maintenance alert: " + equipment.getName()
                + " | Equipment ID: " + equipment.getEquipmentID();
        System.out.println("[NOTIFICATION] " + msg);
        notifications.add(msg);
    }

    // Added: required by context spec; notifies user their account or booking request has been approved
    public void sendApprovalNotification(User user) {
        String msg = "Account/request approved for " + user.getEmail();
        System.out.println("[NOTIFICATION] " + msg);
        notifications.add(msg);
    }

    public void notifyBookingModified(User user, Booking booking) {
        System.out.println("NOTIFICATION: Hi " + user.getEmail() +
                ", your booking for " + booking.getEquipment().getName() +
                " has been successfully modified to " + booking.getStartTime() + ".");
    }

    // Added: exposes an unmodifiable view of notification history so callers cannot mutate it directly
    public List<String> getNotifications() {
        return Collections.unmodifiableList(notifications);
    }
}
