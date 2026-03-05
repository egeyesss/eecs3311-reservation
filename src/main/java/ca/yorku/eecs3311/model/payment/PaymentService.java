package ca.yorku.eecs3311.model.payment;

public class PaymentService {

	private PaymentStrategy strategy;

	public PaymentService() {
		this.strategy = null;
	}

	public PaymentService(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public void setStrategy(PaymentStrategy strategy) {
		if (strategy == null) throw new IllegalArgumentException("Payment strategy cannot be null.");
		this.strategy = strategy;
	}

	public boolean executePayment(double amount) {
		if (strategy == null) throw new IllegalStateException("No payment strategy set.");
		if (amount <= 0) throw new IllegalArgumentException("Payment amount must be positive.");
		if (!strategy.validatePayment()) return false;
		return strategy.processPayment(amount);
	}

	public boolean chargeDeposit(double depositAmount) {
		return executePayment(depositAmount);
	}

	public boolean chargeFinalAmount(double totalCost, double depositAlreadyPaid) {
		double remaining = totalCost - depositAlreadyPaid;
		if (remaining <= 0) return true;
		return executePayment(remaining);
	}

	public boolean processRefund(double amount) {
		// Refund logic placeholder — in a real system this would credit back
		if (amount <= 0) throw new IllegalArgumentException("Refund amount must be positive.");
		return true;
	}

	public boolean validatePaymentMethod() {
		if (strategy == null) return false;
		return strategy.validatePayment();
	}

	public String getPaymentDetails() {
		if (strategy == null) return "No payment strategy set.";
		return strategy.getPaymentDetails();
	}

	public PaymentStrategy getStrategy() { return strategy; }
}
