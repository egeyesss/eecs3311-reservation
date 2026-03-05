package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class ConfirmedState implements BookingState {

	private final Booking booking;

	public ConfirmedState(Booking booking) {
		this.booking = booking;
	}

	@Override
	public void confirm() {
		throw new IllegalStateException("Booking is already CONFIRMED.");
	}

	@Override
	public void cancel() {
		booking.setState(new CancelledState(booking));
	}

	@Override
	public void activate() {
		booking.setState(new ActiveState(booking));
	}

	@Override
	public void complete() {
		throw new IllegalStateException("Cannot complete a CONFIRMED booking. Activate it first.");
	}

	@Override
	public void extend(LocalDateTime newEnd) {
		if (newEnd == null || !newEnd.isAfter(booking.getEndTime())) {
			throw new IllegalArgumentException("New end time must be after current end time.");
		}
		booking.setEndTime(newEnd);
	}

	@Override
	public String getStateName() {
		return "CONFIRMED";
	}
}
