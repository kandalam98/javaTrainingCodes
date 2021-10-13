package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram=new Student();
		ram.setRoll(11);
		ram.setEmail("jjsbcjks@.com");
		ram.setMarks(0);
		ram.setStudentname("Neha nishal King");
		System.out.println(ram.getMarks());
		
		Student shyam=new Student(203,"sfef",99,"ieofei");
		System.out.println(ram.getEmail());
		

	}

}
