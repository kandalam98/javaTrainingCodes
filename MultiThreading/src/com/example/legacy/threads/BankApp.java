package com.example.legacy.threads;
 class DepositTask implements Runnable{
	 BankAccount account;
	 public DepositTask(BankAccount account) {
		 super();
		 this.account=account;
		 Thread t1=new Thread(this);
		 t1.start();
		 
	 }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(account.deposit(4000));
		
	}
	 
 }
 class WithdrawTask implements Runnable{
	 BankAccount account;
	 public WithdrawTask(BankAccount account1) {
		 super();
		 this.account=account;
		 Thread t1=new Thread(this);
		 t1.start();
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(account.withdraw(1500));
		
	}
	 
 }
public class BankApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount account1=new BankAccount();
		new WithdrawTask(account1);
		new DepositTask(account1);
		

		
	}
	

}
