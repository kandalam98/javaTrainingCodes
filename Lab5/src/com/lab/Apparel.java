package com.lab;

public class Apparel extends Product {

private int size;
private String material;

public Apparel() {
	super();
	// TODO Auto-generated constructor stub
}


public Apparel(int itemCode, String itemName, double quantity, double unitPrice,int size,String itemType,String material) {
	super(itemCode, itemName, quantity, unitPrice,itemType);
	this.size = size;
	this.material = material;
	// TODO Auto-generated constructor stub
}



public int getSize() {
	return size;
}


public void setSize(int size) {
	this.size = size;
}


public String getMaterial() {
	return material;
}


public void setMaterial(String material) {
	this.material = material;
}



}
