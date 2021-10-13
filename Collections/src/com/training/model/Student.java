package com.training.model;

import java.util.Objects;

public class Student implements Comparable<Student> {
	private String name;
	private int rollno;
	private int markScored;
	private String email;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int rollno, int markScored, String email) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.markScored = markScored;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getMarkScored() {
		return markScored;
	}

	public void setMarkScored(int markScored) {
		this.markScored = markScored;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(email, markScored, name, rollno);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(email, other.email) && markScored == other.markScored && Objects.equals(name, other.name)
				&& rollno == other.rollno;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if (this.rollno > o.rollno) return 1;
		if (this.rollno < o.rollno) return -1;
		return 0;
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollno=" + rollno + ", markScored=" + markScored + ", email=" + email + "]";
	}
	


	

}
