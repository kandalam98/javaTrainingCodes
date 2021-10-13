package com.training.entity;

import java.time.LocalDate;

public class Student {
	private int rollNumber;
	private String studentname;
	private LocalDate dateofbirth;
	private int markscored;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentname, LocalDate dateofbirth, int markscored) {
		super();
		this.rollNumber = rollNumber;
		this.studentname = studentname;
		this.dateofbirth = dateofbirth;
		this.markscored = markscored;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentname=" + studentname + ", dateofbirth=" + dateofbirth
				+ ", markscored=" + markscored + "]";
	}
	public int getMarkscored() {
		return markscored;
	}
	public void setMarkscored(int markscored) {
		this.markscored = markscored;
	}
	
	
	

}
