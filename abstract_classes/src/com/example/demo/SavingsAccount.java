package com.example.demo;

public class SavingsAccount extends BankAccount {
	
	private String nominee;
	public SavingsAccount(long accountNumber, double balance, String nominee) {
		super(accountNumber, balance);
		this.nominee = nominee;
	}

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		double currBalance=getBalance();
		double updatedBalance=currBalance +amount;
		setBalance(updatedBalance);
		return updatedBalance;
	}
	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		double currBalance=getBalance();
		if(currBalance - amount >1000) {
			double updatedBalance=currBalance-amount;
			setBalance(updatedBalance);
		}else {
			System.out.println("Minimum Blance should be maintained");
		}
		return getBalance();
	}
	public String showGreeting() {
		return "Welcome";
	}

	

}
