package com.training.ifaces;


public class PrintService {
//	public void print(Student obj) {
//		System.out.println(obj.test());
//	}  same overload method for professor
//	now we create print for condition
//	which works for both student and professor
	public static void print(Condition obj) {
		System.out.println(obj.test());
	}
	public static void print(Condition[] obj) {
		for(Condition each:obj) {
			System.out.println(each.test());
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(88);
		Professor shyam=new Professor("phd");
		
		print(s1);
		print(shyam);
		Condition[] list= {s1,shyam};
		print(list);
	}

}
