package com.lab;

public class FoodItem extends Product {

	private boolean isVegetarian;
	

	@Override
	public int compareTo(Product o) {
		// TODO Auto-generated method stub
		return 0;
	}


	public FoodItem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public FoodItem(int itemCode, String itemName, double quantity, double unitPrice,String itemType, boolean isVegetarian) {
		super(itemCode, itemName, quantity, unitPrice,itemType);
		this.isVegetarian=isVegetarian;
		// TODO Auto-generated constructor stub
	}

}
