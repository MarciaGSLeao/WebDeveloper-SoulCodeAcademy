package topic01Introduction.application;

import topic01Introduction.entities.BankAccount;

public class Program {
	
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount("Jo�o Felipe", 1234, 0.0);
		
		System.out.println("SALDO = R$ " + account.getBalance());
		account.deposit(1500.55);
		System.out.println("SALDO ATUAL = R$ " + account.getBalance());
		account.withdraw(250.00);
		System.out.println("SALDO ATUAL= R$ " + account.getBalance());
	}

}

