package com.lab;

import java.util.ArrayList;

public class Application5 {
	public static void print(ArrayList<Product> list) {
		for(Product item:list) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService service = new ProductService();
		FoodItem item1 = new FoodItem(1, "milk", 5, 100,"Food", true);
		FoodItem item2 = new FoodItem(1, "sugar", 4, 100,"Food", true);
		FoodItem item3 = new FoodItem(1, "rice", 3, 100,"Food", true);
		FoodItem item4 = new FoodItem(1,"water",10,100,"Food",true);
		FoodItem item5 = new FoodItem(1,"Tea",100,100,"Food",true);
		service.add(item1);
		service.add(item2);
		service.add(item3);
		service.add(item4);
		service.add(item5);
		print(service.topThreeItems("Food"));
		
		Product eitem1 = new Electronics(1, "mobile", 15, 100,"electronics",2);
		Product eitem2 = new Electronics(1, "laptop", 25, 100,"electronics",2);
		Product eitem3 = new Electronics(1, "printer", 1, 100,"electronics",2);
		service.add(eitem1);
		service.add(eitem2);
		service.add(eitem3);
		print(service.topThreeItems("electronics"));
		
		
		Product aitem1 = new Apparel(1, "shirt", 15, 100,2,"apparel","cotton");
		Product aitem2 = new Apparel(1, "t shirt", 25, 100,2,"apparel","silk");
		Product aitem3 = new Apparel(1, "pant", 1, 100,2,"apparel","lenin");
		service.add(aitem1);
		service.add(aitem2);
		service.add(aitem3);
		print(service.topThreeItems("apparel"));
		
		

	}

}
