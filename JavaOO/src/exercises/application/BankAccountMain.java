package exercises.application;

import exercises.entities.BankAccount;

public class BankAccountMain {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("João Felipe", 1234, 0.0);
		
		System.out.println("SALDO = R$ " + account.getBalance());
		account.deposit(1500.55);
		System.out.println("SALDO ATUAL = R$ " + account.getBalance());
		account.withdraw(250.00);
		System.out.println("SALDO ATUAL= R$ " + account.getBalance());
	}

}
