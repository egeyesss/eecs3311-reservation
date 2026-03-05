package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class ConfirmedState implements BookingState {

	private final Booking booking;

	public ConfirmedState(Booking booking) { this.booking = booking; }

	@Override
	public void confirm() { /* already confirmed */ }

	@Override
	public void cancel() { booking.setState(new CancelledState(booking)); }

	@Override
	public void activate() { booking.setState(new ActiveState(booking)); }

	@Override
	public void complete() { throw new IllegalStateException("Cannot complete a confirmed booking before activation"); }

	@Override
	public void extend(LocalDateTime newEnd) { booking.setEndTime(newEnd); }

	@Override
	public String getStateName() { return "CONFIRMED"; }
}

