package com.lab;

public class Application {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		CreditCard cc1=new CreditCard("ramesh reddy",1001,"master");
		CreditCard cc2=new CreditCard("suresh reddy",1002,"master");
		CreditCard cc3=new CreditCard("bramesh sharma",1003,"master");
		
		CreditCardService ccs=new CreditCardService();
		ccs.addCard(cc1);
		ccs.addCard(cc2);
		ccs.addCard(cc3);
		
		CreditCard[] arr=ccs.getcardlist();
		int reddyCount=0;
		int sharmaCount=0;
		for(CreditCard eachcard: arr) 
		{
			String temp=eachcard.getAccountName();
			if(temp.toLowerCase().contains("sharma")) {
				sharmaCount++;
			}
			else if(temp.toLowerCase().contains("reddy")) {
				reddyCount++;
			}
			System.out.println(eachcard);
		}
		System.out.println("Reddy count"+ reddyCount);
		System.out.println("sharma count"+sharmaCount);


	}

}
