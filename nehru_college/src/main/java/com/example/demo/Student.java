package com.example.demo;

public class Student {
	
	private int classNumber;
	private String name;
	private int marks;
	@Override
	public String toString() {
		return "Student [classNumber=" + classNumber + ", name=" + name + ", marks=" + marks + "]";
	}
	public int getClassNumber() {
		return classNumber;
	}
	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int classNumber, String name, int marks) {
		super();
		this.classNumber = classNumber;
		this.name = name;
		this.marks = marks;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
