package ca.yorku.eecs3311.model.payment;

public class DebitCardPayment implements PaymentStrategy {

	private final String cardNumber;
	private final String pin;
	private final String cardHolderName;
	private double accountBalance;

	public DebitCardPayment(String cardNumber, String pin, String cardHolderName, double accountBalance) {
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.cardHolderName = cardHolderName;
		this.accountBalance = accountBalance;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		if (amount <= 0) return false;
		if (accountBalance < amount) return false;
		accountBalance -= amount;
		return true;
	}

	@Override
	public boolean validatePayment() {
		if (cardNumber == null || cardNumber.trim().length() < 13) return false;
		if (pin == null || pin.trim().length() < 4) return false;
		if (cardHolderName == null || cardHolderName.trim().isEmpty()) return false;
		return true;
	}

	@Override
	public String getPaymentDetails() {
		String masked = "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
		return "DebitCard{holder='" + cardHolderName + "', card=" + masked +
				", balance=" + accountBalance + "}";
	}

	public String getCardNumber()     { return cardNumber; }
	public String getCardHolderName() { return cardHolderName; }
	public double getAccountBalance() { return accountBalance; }
}
