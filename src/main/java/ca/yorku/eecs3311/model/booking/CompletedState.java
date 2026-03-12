package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class CompletedState implements BookingState {

	private final Booking booking;

	public CompletedState(Booking booking) {
		this.booking = booking;
		this.booking.getEquipment().release();
	}

	@Override
	public void confirm() {
		throw new IllegalStateException("Cannot modify a COMPLETED booking.");
	}

	@Override
	public void cancel() {
		throw new IllegalStateException("Cannot cancel a COMPLETED booking.");
	}

	@Override
	public void activate() {
		throw new IllegalStateException("Cannot activate a COMPLETED booking.");
	}

	@Override
	public void complete() {
		throw new IllegalStateException("Booking is already COMPLETED.");
	}

	@Override
	public void extend(LocalDateTime newEnd) {
		throw new IllegalStateException("Cannot extend a COMPLETED booking.");
	}

	@Override
	public String getStateName() {
		return "COMPLETED";
	}
}
