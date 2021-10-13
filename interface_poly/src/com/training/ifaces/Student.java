package com.training.ifaces;
import java.io.Serializable;

public class Student extends Person implements Condition,Serializable {
	
	private int markScored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	


	public Student(int markScored) {
		super();
		this.markScored = markScored;
	}



	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		return markScored>80;
	}

}
