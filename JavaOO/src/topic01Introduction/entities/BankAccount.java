package topic01Introduction.entities;

public class BankAccount {
	
	private String customerName;
	private int accountNumber;
	private double balance;
	
	public BankAccount() {
	}

	public BankAccount(String customerName, int accountNumber, double balance) {
		this.customerName = customerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
}
