package com.training;

import java.util.HashMap;

import com.training.model.Student;

public class AppForMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student niresh = new Student("niresh",1045,399,"bssd@d.com");
		Student ram = new Student("ramesh",103,299,"bd@d.com");
		Student shyam = new Student("ramesh",101,99,"bhh@d.com");
		HashMap<Integer,Student> list=new HashMap<>();
		list.put(100, shyam);
		list.put(201, ram);
		Object obj=list.put(201,niresh);
		System.out.println(obj); 
		System.out.println(list.get(201));
	}

}
