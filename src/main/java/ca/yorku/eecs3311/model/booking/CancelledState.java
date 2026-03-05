package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class CancelledState implements BookingState {

	private final Booking booking;

	public CancelledState(Booking booking) {
		this.booking = booking;
	}

	@Override
	public void confirm() {
		throw new IllegalStateException("Cannot confirm a CANCELLED booking.");
	}

	@Override
	public void cancel() {
		throw new IllegalStateException("Booking is already CANCELLED.");
	}

	@Override
	public void activate() {
		throw new IllegalStateException("Cannot activate a CANCELLED booking.");
	}

	@Override
	public void complete() {
		throw new IllegalStateException("Cannot complete a CANCELLED booking.");
	}

	@Override
	public void extend(LocalDateTime newEnd) {
		throw new IllegalStateException("Cannot extend a CANCELLED booking.");
	}

	@Override
	public String getStateName() {
		return "CANCELLED";
	}
}
