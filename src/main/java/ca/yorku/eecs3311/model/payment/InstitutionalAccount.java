package ca.yorku.eecs3311.model.payment;

/** 
 * Simple institutional account representing department funds.
 */
public class InstitutionalAccount {

	private final String accountID;
	private final String department;
	private double balance;

	public InstitutionalAccount(String accountID, String department, double balance) {
		this.accountID = accountID;
		this.department = department;
		this.balance = balance;
	}

	public boolean deductAmount(double amount) {
		if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
		if (balance < amount) return false;
		balance -= amount;
		return true;
	}

	public void addFunds(double amount) {
		if (amount <= 0) throw new IllegalArgumentException("Amount must be positive");
		balance += amount;
	}

	public double getBalance() { return balance; }
	public String getAccountID() { return accountID; }
	public String getDepartment() { return department; }
}

