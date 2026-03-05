package ca.yorku.eecs3311.model.booking;

import ca.yorku.eecs3311.model.equipment.Equipment;
import ca.yorku.eecs3311.model.enums.BookingStatus;
import ca.yorku.eecs3311.model.user.User;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.UUID;

public class Booking {

	private final String bookingID;
	private final User user;
	private final Equipment equipment;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private final LocalDateTime createdAt;
	private LocalDateTime arrivedAt;
	private Duration duration;
	private BookingStatus status;
	private BookingState state;
	private double totalCost;
	private double depositPaid;

	public Booking(User user, Equipment equipment, LocalDateTime startTime, LocalDateTime endTime) {
		this.bookingID = UUID.randomUUID().toString();
		this.user = user;
		this.equipment = equipment;
		this.startTime = startTime;
		this.endTime = endTime;
		this.createdAt = LocalDateTime.now();
		this.duration = Duration.between(startTime, endTime);
		this.status = BookingStatus.PENDING;
		this.state = new PendingState(this);
		this.totalCost = calculateCost();
		this.depositPaid = 0.0;
	}

	public double calculateCost() {
		long hours = Math.max(1, duration.toHours());
		return equipment.getHourlyRate() * hours;
	}

	public void setState(BookingState state) {
		this.state = state;
		switch (state.getStateName()) {
			case "PENDING":   this.status = BookingStatus.PENDING;   break;
			case "CONFIRMED": this.status = BookingStatus.CONFIRMED; break;
			case "ACTIVE":    this.status = BookingStatus.ACTIVE;    break;
			case "COMPLETED": this.status = BookingStatus.COMPLETED; break;
			case "CANCELLED": this.status = BookingStatus.CANCELLED; break;
		}
	}

	// Delegate to state
	public void confirm()  { state.confirm(); }
	public void cancel()   { state.cancel(); }
	public void activate() { state.activate(); }
	public void complete() { state.complete(); }

	public void extend(LocalDateTime newEnd) {
		this.duration = Duration.between(this.startTime, newEnd);
		state.extend(newEnd);
		this.totalCost = calculateCost();
	}

	// Package-private: used only by state classes
	void setEndTime(LocalDateTime newEnd) {
		this.endTime = newEnd;
		this.duration = Duration.between(startTime, endTime);
	}

	// Getters
	public String getBookingID()          { return bookingID; }
	public User getUser()                  { return user; }
	public Equipment getEquipment()        { return equipment; }
	public LocalDateTime getStartTime()    { return startTime; }
	public LocalDateTime getEndTime()      { return endTime; }
	public LocalDateTime getCreatedAt()    { return createdAt; }
	public LocalDateTime getArrivedAt()    { return arrivedAt; }
	public Duration getDuration()          { return duration; }
	public BookingStatus getStatus()       { return status; }
	public BookingState getState()         { return state; }
	public double getTotalCost()           { return totalCost; }
	public double getDepositPaid()         { return depositPaid; }

	public void setArrivedAt(LocalDateTime arrivedAt) { this.arrivedAt = arrivedAt; }
	public void setDepositPaid(double depositPaid)     { this.depositPaid = depositPaid; }

	@Override
	public String toString() {
		return "Booking{" + bookingID + ", user=" + user.getEmail() +
				", equip=" + equipment.getName() + ", status=" + status + "}";
	}
}
