package com.example.demo;

public class App {
	public static void print(CreditCard card) {
		System.out.println(card.getCardHoldername());
		System.out.println(card.getCardNumber());
		System.out.println(CreditCard.getCardProvider());
		
		/*
		 * static method should be accessed with Class name => Classname.method()
		 * static method should not accessed with obj.method , if its done a warning is given
		 */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreditCard card=new CreditCard(100,"srikar");
		print(card);
		/*
		 * Since print is a static method of the same class it can be invoked
		 * even without using ClassName but it could be called with ClassName also
		 */
		LocalAndParameter temp=new LocalAndParameter();
		temp.usingLocalVariable();
		temp.usingInstanceVariable();
		System.out.println(card.getCardHoldername());
		/*
		 * when you are passign bjects its copy of reference is passed 
		 * so changes made to the objects inside the method will get affected
		 */
	

	}

}
