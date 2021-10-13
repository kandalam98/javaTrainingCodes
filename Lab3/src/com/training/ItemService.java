package com.training;

public class ItemService {
	
	public double findDiscount(Item item) {
		double discount=item.getRatePerUnit()*0.05;
		return discount;
	}
	public double findDiscount(Item item,Customer customer) 
	{
		if(customer.getCategory().toLowerCase().equals("retail")) {
			double discount1=item.getRatePerUnit()*0.10;
			return discount1;
		}
		else if(customer.getCategory().toLowerCase().equals("Corporate")){
			double discount2=item.getRatePerUnit()*0.15;
			return discount2;
			
		}
		else {
			double d0=0.00;
			return d0;
		}
	}

}
