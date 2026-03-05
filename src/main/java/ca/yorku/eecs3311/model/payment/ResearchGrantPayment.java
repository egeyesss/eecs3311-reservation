package ca.yorku.eecs3311.model.payment;

import ca.yorku.eecs3311.model.user.ResearchGrant;

public class ResearchGrantPayment implements PaymentStrategy {

	private final ResearchGrant grant;

	public ResearchGrantPayment(ResearchGrant grant) {
		if (grant == null) throw new IllegalArgumentException("ResearchGrant cannot be null.");
		this.grant = grant;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		if (amount <= 0) return false;
		return grant.allocateFunds(amount);
	}

	@Override
	public boolean validatePayment() {
		return grant != null && grant.validateGrant();
	}

	@Override
	public String getPaymentDetails() {
		return "ResearchGrant{grantID='" + grant.getGrantID() +
				"', name='" + grant.getGrantName() +
				"', remainingFunds=" + grant.getRemainingFunds() +
				"', expiry=" + grant.getExpiryDate() + "}";
	}

	public ResearchGrant getGrant() { return grant; }
}
