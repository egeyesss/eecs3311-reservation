package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class PendingState implements BookingState {

	private final Booking booking;

	public PendingState(Booking booking) { this.booking = booking; }

	@Override
	public void confirm() {
		booking.setState(new ConfirmedState(booking));
	}

	@Override
	public void cancel() {
		booking.setState(new CancelledState(booking));
	}

	@Override
	public void activate() {
		throw new IllegalStateException("Cannot activate a pending booking");
	}

	@Override
	public void complete() {
		throw new IllegalStateException("Cannot complete a pending booking");
	}

	@Override
	public void extend(LocalDateTime newEnd) {
		booking.setEndTime(newEnd);
	}

	@Override
	public String getStateName() { return "PENDING"; }
}

