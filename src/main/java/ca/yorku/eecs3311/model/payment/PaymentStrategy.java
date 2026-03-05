package ca.yorku.eecs3311.model.payment;

/**
 * Strategy interface for payment processing.
 */
public interface PaymentStrategy {
	boolean processPayment(double amount);
	boolean validatePayment();
	String getPaymentDetails();
}

