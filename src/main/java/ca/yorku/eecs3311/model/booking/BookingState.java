package ca.yorku.eecs3311.model.booking;

import java.time.LocalDateTime;

public interface BookingState {
	void confirm();
	void cancel();
	void activate();
	void complete();
	void extend(LocalDateTime newEnd);
	String getStateName();
}

