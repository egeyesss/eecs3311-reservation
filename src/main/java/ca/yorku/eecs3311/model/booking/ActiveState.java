package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public class ActiveState implements BookingState {

	private final Booking booking;

	public ActiveState(Booking booking) {
		this.booking = booking;
	}

	@Override
	public void confirm() {
		throw new IllegalStateException("Cannot confirm an ACTIVE booking.");
	}

	@Override
	public void cancel() {
		throw new IllegalStateException("Cannot cancel an ACTIVE booking. Complete it instead.");
	}

	@Override
	public void activate() {
		throw new IllegalStateException("Booking is already ACTIVE.");
	}

	@Override
	public void complete() {
		booking.setState(new CompletedState(booking));
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
		return "ACTIVE";
	}
}
