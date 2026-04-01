package ca.yorku.eecs3311.model.payment;

import ca.yorku.eecs3311.model.enums.PaymentMethod;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Simple Payment record used by DAOs/services.
 */
public class Payment {

	private String paymentID;
	private String bookingID;
	private String userId;
	private double amount;
	private PaymentMethod paymentMethod;
	private LocalDateTime paymentDate;
	private String transactionID;
	private String status;
	private boolean isDeposit;

	public Payment(String bookingID, String userId, double amount, PaymentMethod paymentMethod, boolean isDeposit) {
		this.paymentID = UUID.randomUUID().toString();
		this.bookingID = bookingID;
		this.userId = userId;
		this.amount = amount;
		this.paymentMethod = paymentMethod;
		this.paymentDate = LocalDateTime.now();
		this.transactionID = "tx-" + UUID.randomUUID();
		this.status = "PENDING";
		this.isDeposit = isDeposit;
	}

	// Getters and setters
	public String getPaymentID() { return paymentID; }
	public String getBookingID() { return bookingID; }
	public String getUserId() { return userId; }
	public double getAmount() { return amount; }
	public PaymentMethod getPaymentMethod() { return paymentMethod; }
	public LocalDateTime getPaymentDate() { return paymentDate; }
	public String getTransactionID() { return transactionID; }
	public String getStatus() { return status; }
	public boolean isDeposit() { return isDeposit; }

	public void setStatus(String status) { this.status = status; }
	public void setTransactionID(String transactionID) { this.transactionID = transactionID; }
	public void setPaymentID(String paymentID) { this.paymentID = paymentID; }
	public void setPaymentDate(java.time.LocalDateTime paymentDate) { this.paymentDate = paymentDate; }

	@Override
	public String toString() {
		return "Payment{" + paymentID + ", amount=" + amount + ", method=" + paymentMethod + ", status=" + status + "}";
	}
}

