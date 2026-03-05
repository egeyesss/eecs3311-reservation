package ca.yorku.eecs3311.model.payment;

public class InstitutionalAccount {

	private final String accountID;
	private final String department;
	private final String userID;
	private double balance;

	public InstitutionalAccount(String accountID, String department, String userID, double balance) {
		this.accountID = accountID;
		this.department = department;
		this.userID = userID;
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
	public String getUserID() { return userID; }

	@Override
	public String toString() {
		return "InstitutionalAccount{accountID='" + accountID + "', department='" + department +
				"', userID='" + userID + "', balance=" + balance + "}";
	}
}
