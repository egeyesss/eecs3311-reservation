package ca.yorku.eecs3311.model.enums;

public enum BookingStatus {
    /** Booking has been submitted and is awaiting confirmation. */
    PENDING,
    /** Booking has been approved and is scheduled. */
    CONFIRMED,
    /** Booking is currently in progress. */
    ACTIVE,
    /** Booking has been fulfilled and the session has ended. */
    COMPLETED,
    /** Booking was cancelled before or during the session. */
    CANCELLED
}
