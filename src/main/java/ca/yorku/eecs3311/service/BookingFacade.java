package ca.yorku.eecs3311.service;

import ca.yorku.eecs3311.model.booking.Booking;

import java.time.LocalDateTime;
import java.util.List;

public class BookingFacade {

    private final BookingManager bookingManager;
    private final NotificationService notificationService;

    public BookingFacade() {
        this.bookingManager = BookingManager.getInstance();
        this.notificationService = new NotificationService();
    }

    public Booking createAndConfirmBooking(String userID,
                                           String equipmentID,
                                           LocalDateTime start,
                                           LocalDateTime end) {

        Booking booking = bookingManager.createBooking(userID, equipmentID, start, end);
        notificationService.notifyBookingCreated(booking.getUser(), booking);

        booking = bookingManager.confirmBooking(booking.getBookingID());
        notificationService.notifyBookingConfirmed(booking.getUser(), booking);

        return booking;
    }

    public Booking cancelBooking(String bookingID) {
        Booking booking = bookingManager.cancelBooking(bookingID);
        notificationService.notifyBookingCancelled(booking.getUser(), booking);
        return booking;
    }

    public Booking extendBooking(String bookingID, LocalDateTime newEndTime) {
        Booking booking = bookingManager.extendBooking(bookingID, newEndTime);
        notificationService.notifyBookingExtended(booking.getUser(), booking);
        return booking;
    }

    public boolean isEquipmentAvailable(String equipmentID, LocalDateTime start, LocalDateTime end) {
        return bookingManager.isEquipmentAvailable(equipmentID, start, end);
    }

    public Booking getBookingById(String bookingID) {
        return bookingManager.findBookingById(bookingID);
    }

    public List<Booking> getBookingsByUser(String userID) {
        return bookingManager.getBookingsByUser(userID);
    }

    public List<Booking> getBookingsByEquipment(String equipmentID) {
        return bookingManager.getBookingsByEquipment(equipmentID);
    }
}