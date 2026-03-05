package ca.yorku.eecs3311.model.payment;

public class CreditCardPayment implements PaymentStrategy {

	private final String cardNumber;
	private final String expiryDate;
	private final String cvv;
	private final String cardHolderName;

	public CreditCardPayment(String cardNumber, String expiryDate, String cvv, String cardHolderName) {
		this.cardNumber = cardNumber;
		this.expiryDate = expiryDate;
		this.cvv = cvv;
		this.cardHolderName = cardHolderName;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		if (amount <= 0) return false;
		// Simulate successful charge
		return true;
	}

	@Override
	public boolean validatePayment() {
		if (cardNumber == null || cardNumber.trim().length() < 13) return false;
		if (expiryDate == null || expiryDate.trim().isEmpty()) return false;
		if (cvv == null || cvv.trim().length() < 3) return false;
		if (cardHolderName == null || cardHolderName.trim().isEmpty()) return false;
		return true;
	}

	@Override
	public String getPaymentDetails() {
		String masked = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
		return "CreditCard{holder='" + cardHolderName + "', card=" + masked + ", expiry=" + expiryDate + "}";
	}

	public String getCardNumber()     { return cardNumber; }
	public String getExpiryDate()     { return expiryDate; }
	public String getCvv()            { return cvv; }
	public String getCardHolderName() { return cardHolderName; }
}
