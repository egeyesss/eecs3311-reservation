package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.booking.Booking;
import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.user.User;

public class NotificationService {

    public void notifyBookingCreated(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking created for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID());
    }

    public void notifyBookingConfirmed(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking confirmed for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID());
    }

    public void notifyBookingCancelled(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking cancelled for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID());
    }

    public void notifyBookingExtended(User user, Booking booking) {
        System.out.println("[NOTIFICATION] Booking extended for " + user.getEmail()
                + " | Booking ID: " + booking.getBookingID()
                + " | New end time: " + booking.getEndTime());
    }

    public void notifyEquipmentUnavailable(Equipment equipment) {
        System.out.println("[NOTIFICATION] Equipment unavailable: "
                + equipment.getName()
                + " | Equipment ID: " + equipment.getEquipmentID());
    }
}