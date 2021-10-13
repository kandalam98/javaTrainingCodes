package com.training;

public class Insurance {
	private int policyNumber;
	private String policyHolderName;
	private double policyAmount;
	public Insurance(int policyNumber, String policyHolderName, double policyAmount) {
		super();
		this.policyNumber = policyNumber;
		this.policyHolderName = policyHolderName;
		this.policyAmount = policyAmount;
		System.out.println("inside super class 3 param constructor");
	}
	public Insurance() {
		super();
		System.out.println("inside super class 0 param constructor");
		// TODO Auto-generated constructor stub
	}
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getPolicyHolderName() {
		return policyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}
	public double getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(double policyAmount) {
		this.policyAmount = policyAmount;
	}

	public double calculatePremium() {
		
		double premium=5000.00;
		if(this.policyAmount>100000) {
			premium=1000;
		}
		return premium;
	}
	
	

}
