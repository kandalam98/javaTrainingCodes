package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CurrencyConverter inrToUsd=new CurrencyConverter();
		System.out.println(inrToUsd.apply(100));
		TempConverter farToCe1=new TempConverter();
		System.out.println(farToCe1.apply(100));
		
		

	}

}
