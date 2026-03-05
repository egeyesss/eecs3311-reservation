package ca.yorku.eecs3311.model.payment;

/**
 * Simulated debit card payment strategy.
 */
public class DebitCardPayment implements PaymentStrategy {

	private final String cardNumber;
	private final String cardHolder;

	public DebitCardPayment(String cardNumber, String cardHolder) {
		this.cardNumber = cardNumber;
		this.cardHolder = cardHolder;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		return amount > 0;
	}

	@Override
	public boolean validatePayment() {
		return cardNumber != null && cardNumber.replaceAll("\\s+", "").length() >= 12;
	}

	@Override
	public String getPaymentDetails() {
		return "DebitCard(holder=" + cardHolder + ", ****" + (cardNumber.length() > 4 ? cardNumber.substring(cardNumber.length()-4) : cardNumber) + ")";
	}
}

