package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class ActiveState implements BookingState {

	private final Booking booking;

	public ActiveState(Booking booking) { this.booking = booking; }

	@Override
	public void confirm() { throw new IllegalStateException("Already active"); }

	@Override
	public void cancel() { booking.setState(new CancelledState(booking)); }

	@Override
	public void activate() { /* already active */ }

	@Override
	public void complete() { booking.setState(new CompletedState(booking)); }

	@Override
	public void extend(LocalDateTime newEnd) { booking.setEndTime(newEnd); }

	@Override
	public String getStateName() { return "ACTIVE"; }
}
