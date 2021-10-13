package com.lab;

public class Electronics extends Product {
	private int warrantyMonths;
	

	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Electronics(int itemCode, String itemName, double quantity, double unitPrice,String itemType,int warrantyMonths) {
		super(itemCode, itemName, quantity, unitPrice,itemType);
		this.warrantyMonths=warrantyMonths;
		// TODO Auto-generated constructor stub
	}

}
