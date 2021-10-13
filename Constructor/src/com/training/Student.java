package com.training;

//provider interface - get/set method
public class Student {
	private int roll;
	private String studentname;
	private double marks;
	private String email;
	
	public Student() {
		
	}
	public Student(int roll ,String studentname,double marks , String email)
	{
		super();
		this.roll=roll;
		this.studentname=studentname;
		this.marks=marks;
		this.email=email;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double markscored) {
		if(markscored >0 && markscored<=100) {
			this.marks=markscored;
		}else {
			System.out.println("Invalid");
		}

	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
