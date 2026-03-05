package ca.yorku.eecs3311.model.booking;

import ca.yorku.eecs3311.model.equipment.Equipment;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookingManager {

	private static BookingManager instance;
	private final List<Booking> allBookings;

	private BookingManager() { this.allBookings = new ArrayList<>(); }

	public static synchronized BookingManager getInstance() {
		if (instance == null) instance = new BookingManager();
		return instance;
	}

	public Booking createBooking(ca.yorku.eecs3311.model.user.User user, Equipment equipment,
								 LocalDateTime start, LocalDateTime end) {
		if (!checkEquipmentAvailability(equipment, start, end)) throw new IllegalStateException("Equipment not available");
		Booking b = new Booking(user, equipment, start, end);
		allBookings.add(b);
		return b;
	}

	public boolean cancelBooking(String bookingId) {
		Optional<Booking> ob = findBookingById(bookingId);
		if (ob.isEmpty()) return false;
		ob.get().cancel();
		return true;
	}

	public boolean extendBooking(String bookingId, LocalDateTime newEnd) {
		Optional<Booking> ob = findBookingById(bookingId);
		if (ob.isEmpty()) return false;
		ob.get().extend(newEnd);
		return true;
	}

	public Optional<Booking> findBookingById(String id) {
		return allBookings.stream().filter(b -> b.getBookingID().equals(id)).findFirst();
	}

	public List<Booking> getUserBookings(ca.yorku.eecs3311.model.user.User user) {
		List<Booking> out = new ArrayList<>();
		for (Booking b : allBookings) if (b.getUser().equals(user)) out.add(b);
		return out;
	}

	public boolean checkEquipmentAvailability(Equipment equipment, LocalDateTime start, LocalDateTime end) {
		// Simple check: equipment must be available flag (doesn't check overlapping bookings yet)
		return equipment.isAvailable();
	}

	public List<Booking> getAllBookings() { return new ArrayList<>(allBookings); }
}

