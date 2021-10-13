package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Insurance lifeInsurance=new Insurance(100,"ramesh",200000.00);
//		System.out.println(lifeInsurance.calculatePremium());
		VehicleInsurance vehInsu=new VehicleInsurance(101,"Nishal",120000,"car");
		System.out.println(vehInsu.calculatePremium());
		

	}

}
