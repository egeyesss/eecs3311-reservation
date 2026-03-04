package ca.yorku.eecs3311.model.payment;

/**
 * Charges a departmental/institutional account.
 */
public class InstitutionalAccountPayment implements PaymentStrategy {

	private final InstitutionalAccount account;

	public InstitutionalAccountPayment(InstitutionalAccount account) {
		this.account = account;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		return account.deductAmount(amount);
	}

	@Override
	public boolean validatePayment() {
		return account != null && account.getBalance() > 0;
	}

	@Override
	public String getPaymentDetails() {
		return "InstitutionalAccount(id=" + account.getAccountID() + ", dept=" + account.getDepartment() + ")";
	}
}

