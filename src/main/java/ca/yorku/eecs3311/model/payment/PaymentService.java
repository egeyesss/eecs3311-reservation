package ca.yorku.eecs3311.model.payment;

/**
 * PaymentService acts as the Strategy context.
 */
public class PaymentService {

	private PaymentStrategy strategy;

	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}

	public boolean executePayment(double amount) {
		if (strategy == null) throw new IllegalStateException("PaymentStrategy not set");
		if (!strategy.validatePayment()) return false;
		return strategy.processPayment(amount);
	}

	public String getStrategyDetails() {
		return strategy == null ? "<none>" : strategy.getPaymentDetails();
	}
}

