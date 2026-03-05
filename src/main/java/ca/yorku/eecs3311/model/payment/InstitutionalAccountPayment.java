package ca.yorku.eecs3311.model.payment;

public class InstitutionalAccountPayment implements PaymentStrategy {

	private final InstitutionalAccount account;

	public InstitutionalAccountPayment(InstitutionalAccount account) {
		if (account == null) throw new IllegalArgumentException("InstitutionalAccount cannot be null.");
		this.account = account;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		if (amount <= 0) return false;
		return account.deductAmount(amount);
	}

	@Override
	public boolean validatePayment() {
		return account != null && account.getBalance() > 0;
	}

	@Override
	public String getPaymentDetails() {
		return "InstitutionalAccount{accountID='" + account.getAccountID() +
				"', department='" + account.getDepartment() +
				"', balance=" + account.getBalance() + "}";
	}

	public InstitutionalAccount getAccount() { return account; }
}
