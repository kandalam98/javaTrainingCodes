package com.training;

public class VehicleInsurance extends Insurance {
	
	private String vehicleType;

	public VehicleInsurance() {
		super();
		System.out.println("inside sub class 0 param constructor");
		// TODO Auto-generated constructor stub
	}

	public VehicleInsurance(int policyNumber, String policyHolderName, double policyAmount, String vehicleType) {
		super(policyNumber, policyHolderName, policyAmount);
		System.out.println("inside sub class 4 param constructor");
		this.vehicleType = vehicleType;
	}

	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "VehicleInsurance [vehicleType=" + vehicleType + ", getVehicleType()=" + getVehicleType() + "]";
	}

	@Override
	public double calculatePremium() {
		// TODO Auto-generated method stub
		double premium=100.00;
		switch (vehicleType.toLowerCase()) {
		case "car" :
			if(getPolicyAmount()>50000) {
				premium=5000;
			}
			break;
		case "bike":
			if(getPolicyAmount()>50000) {
				premium=2000;
			}
		}
		return premium;
	}
	

	


}
