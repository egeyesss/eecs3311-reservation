package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class CompletedState implements BookingState {

	private final Booking booking;

	public CompletedState(Booking booking) { this.booking = booking; }

	@Override
	public void confirm() { throw new IllegalStateException("Booking already completed"); }

	@Override
	public void cancel() { throw new IllegalStateException("Booking already completed"); }

	@Override
	public void activate() { throw new IllegalStateException("Booking already completed"); }

	@Override
	public void complete() { /* already completed */ }

	@Override
	public void extend(LocalDateTime newEnd) { throw new IllegalStateException("Cannot extend a completed booking"); }

	@Override
	public String getStateName() { return "COMPLETED"; }
}

