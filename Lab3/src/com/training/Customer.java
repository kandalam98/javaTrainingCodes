package com.training;

public class Customer {
	private int id;
	private String name;
	private String category;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id,String name, String category) {
		super();
		this.id = id;
		this.category = category;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
