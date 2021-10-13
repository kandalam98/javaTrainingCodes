package com.example.demo;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccount account=new SavingsAccount(100,1000,"ram");
		account.deposit(1000);
		account.deposit(5000);
		System.out.println(account.getBalance());
		
		account.withdraw(2000);
		System.out.println(account.getBalance());
		
		System.out.println(account.showGreeting());
		
		BankAccount parent=new SavingsAccount(101,1000,"vicky");
		//System.out.println(parent.showGreeting());//parent class is pointing to savings account which it does know savngAcc methods so error
		System.out.println(((SavingsAccount)parent).showGreeting());
		//dynamic method dispatch

	}

}
