package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class CancelledState implements BookingState {

	private final Booking booking;

	public CancelledState(Booking booking) { this.booking = booking; }

	@Override
	public void confirm() { throw new IllegalStateException("Booking cancelled"); }

	@Override
	public void cancel() { /* already cancelled */ }

	@Override
	public void activate() { throw new IllegalStateException("Booking cancelled"); }

	@Override
	public void complete() { throw new IllegalStateException("Booking cancelled"); }

	@Override
	public void extend(LocalDateTime newEnd) { throw new IllegalStateException("Booking cancelled"); }

	@Override
	public String getStateName() { return "CANCELLED"; }
}

