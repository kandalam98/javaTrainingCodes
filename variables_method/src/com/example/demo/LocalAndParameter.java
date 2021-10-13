package com.example.demo;

public class LocalAndParameter {
	private int number;
	private static String name="ramesh";
	
	public void usingLocalVariable() {
		//int age; we have to assign the value so it shows error
		int age=11;
		System.out.println(age); //age is local variable
	}
	public void usingInstanceVariable() {
		System.out.println(number); //number is a instance
	}
	public CreditCard usingParamVar(CreditCard card) {
		/*
		 * instance method can access both static and as well as instance methods
		 */
		System.out.println(name);
		card.setCardHoldername("Mr" + card.getCardHoldername());
		return card;
	}
	public static void usingInstance() {
		/*
		 * static method can access only static variables
		 */
//		System.out.println(number);
	}

}
