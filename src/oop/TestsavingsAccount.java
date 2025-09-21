package oop;

public class TestsavingsAccount {

	public static void main(String[] args) {
		savingsAccount s = new savingsAccount(1, "James", 10000);
		savingsAccount s2 = new savingsAccount(2, "Andy");

		s.deposit(5000);
		s.withdraw(2000);
		
		
		System.out.println(s.getBalance());
		
		s2.print();
		

		System.out.println(savingsAccount.getMinBalance());
	
	}

}