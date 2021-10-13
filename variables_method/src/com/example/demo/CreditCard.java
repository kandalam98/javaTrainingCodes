package com.example.demo;
/**
 *  
 * @author Admin
 * @version 1.0
 * Examples to understand Instacne , class variables and methods
 * 
 *
 */


public class CreditCard {
	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}
	private long cardNumber; //instance variable
	private String cardHoldername; //instance variable
	private static String cardProvider="visa"; //class variable
	
	public CreditCard(long cardNumber, String cardHoldername) {
		super();
		this.cardNumber = cardNumber;
		this.cardHoldername = cardHoldername;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardHoldername() {
		return cardHoldername;
	}

	public void setCardHoldername(String cardHoldername) {
		this.cardHoldername = cardHoldername;
	}

	public static String getCardProvider() {
		return cardProvider;
	}

	public static void setCardProvider(String cardProvider) {
		CreditCard.cardProvider = cardProvider;
	}

}
