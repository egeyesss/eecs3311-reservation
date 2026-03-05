package ca.yorku.eecs3311.model.payment;

/**
 * Simulated credit card payment strategy.
 */
public class CreditCardPayment implements PaymentStrategy {

	private final String cardNumber;
	private final String cardHolder;
	private final String expiry; // MM/YY

	public CreditCardPayment(String cardNumber, String cardHolder, String expiry) {
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
		this.expiry = expiry;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		// Simulate processing latency / gateway interactions here
		return amount > 0;
	}

	@Override
	public boolean validatePayment() {
		return cardNumber != null && cardNumber.replaceAll("\\s+", "").length() >= 12;
	}

	@Override
	public String getPaymentDetails() {
		return "CreditCard(holder=" + cardHolder + ", number=****" + (cardNumber.length() > 4 ? cardNumber.substring(cardNumber.length()-4) : cardNumber) + ")";
	}
}

