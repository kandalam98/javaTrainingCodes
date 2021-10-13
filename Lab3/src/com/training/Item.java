package com.training;

public class Item {
	 private int itemId;
	 private String ItemName;
	 int ratePerUnit;
	 String category;
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int itemId, String itemName, int ratePerUnit, String category) {
		super();
		this.itemId = itemId;
		this.ItemName = itemName;
		this.ratePerUnit = ratePerUnit;
		this.category = category;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public int getRatePerUnit() {
		return ratePerUnit;
	}

	public void setRatePerUnit(int ratePerUnit) {
		this.ratePerUnit = ratePerUnit;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	

}
