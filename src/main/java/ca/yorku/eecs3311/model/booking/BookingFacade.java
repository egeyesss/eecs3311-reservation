package ca.yorku.eecs3311.model.booking;

import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.payment.PaymentService;
import ca.yorku.eecs3311.model.user.User;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Facade for booking-related operations used by controllers.
 */
public class BookingFacade {

	private final BookingManager bookingManager;
	private final PaymentService paymentService;

	public BookingFacade() {
		this.bookingManager = BookingManager.getInstance();
		this.paymentService = new PaymentService();
	}

	public Booking createBooking(User user, Equipment equipment, LocalDateTime start, LocalDateTime end) {
		return bookingManager.createBooking(user, equipment, start, end);
	}

	public boolean cancelBooking(String bookingId) { return bookingManager.cancelBooking(bookingId); }

	public boolean extendBooking(String bookingId, LocalDateTime newEnd) { return bookingManager.extendBooking(bookingId, newEnd); }

	public List<Booking> getUserBookings(User user) { return bookingManager.getUserBookings(user); }

	// Placeholder for payment integration
	public boolean charge(double amount) {
		return paymentService.executePayment(amount);
	}
}

