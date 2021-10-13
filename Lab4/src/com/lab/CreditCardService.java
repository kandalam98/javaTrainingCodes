package com.lab;

public class CreditCardService {
	private CreditCard[] cardlist;
	private static int maxSize=3;
	private static int count=0;
	public CreditCardService() {
		super();
		this.cardlist=new CreditCard[maxSize];
		// TODO Auto-generated constructor stub
	}
	public CreditCard[] getcardlist() {
		return this.cardlist;
	}
	public boolean addCard(CreditCard card) {
		if(count>maxSize) {
			return false;
		}else{
		this.cardlist[count]=card;
		count++;
		return true;
		}
	}
	

}
