package com.training.ifaces;

import java.io.Serializable;

/*
 * serializable method doesnt have any method so we can imlement it anywhere
 * interface are used for polymorphism
 * conditional interface are interfaces where we give method and condition
 * 
 */

public class Professor extends Person implements Condition,Serializable {
	
	private String qualification;

	public Professor(String qualification) {
		super();
		this.qualification = qualification;
	}

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return this.qualification.toLowerCase().equals("phd");
	}

}
