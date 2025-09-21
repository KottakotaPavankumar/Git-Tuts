package oop;

public class savingsAccount {
	// Instance variables
	private int acno;
	private String customer;
	private double balance;
	private double amount;

	// Static or class variable
	private static double minBalance = 5000;

	public savingsAccount(int acno, String customer, double balance) {
	}

	public savingsAccount(int acno, String customer) {
		// Call another constructor
		this(acno, customer, 0);
	}

	public void print() {

		System.out.println(this.acno);
		System.out.println(this.customer);
		System.out.println(this.balance);
	}

	public void deposit(double amount) {
		this.balance += amount;
	}

		
	

	public void withdraw(double amount) {
		if(amount >= this.balance - savingsAccount.minBalance)
			this.balance -= amount;
		
		
	}

	public double getBalance() {
		return balance;

	}
	
	

	public void deposit(int i) {
		balance += amount;

	}

	public static double getMinBalance() {
		return minBalance;
	}

	
}
