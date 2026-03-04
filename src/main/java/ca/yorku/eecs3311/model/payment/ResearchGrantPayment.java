package ca.yorku.eecs3311.model.payment;

import ca.yorku.eecs3311.model.user.ResearchGrant;
 public class ResearchGrantPayment implements PaymentStrategy {
	private final ResearchGrant grant;

	public ResearchGrantPayment(ResearchGrant grant) {
		this.grant = grant;
	}

	@Override
	public boolean processPayment(double amount) {
		if (!validatePayment()) return false;
		return grant.allocateFunds(amount);
	}

	@Override
	public boolean validatePayment() {
		return grant != null && grant.validateGrant();
	}

	@Override
	public String getPaymentDetails() {
		return "ResearchGrant(id=" + (grant == null ? "<null>" : grant.getGrantID()) + ")";
	}
 }
