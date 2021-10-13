package com.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.training.model.Student;


public class ApplicationForSet {
	
	public static void print(String message, Set<Student> list) {
		System.out.println(message);
		for(Student eachElement : list) {
			System.out.println(eachElement);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ram = new Student("ramesh",103,299,"bd@d.com");
		Student shyam = new Student("ramesh",101,99,"bhh@d.com");
		Student chotushyam = new Student("ramesh",101,99,"bhh@d.com");
		
		HashSet<Student> hasSet=new HashSet<>();
		hasSet.add(chotushyam);
		hasSet.add(shyam);
		hasSet.add(ram);
		
		print("Hash Set - No duplicates ", hasSet);
		
		TreeSet<Student> treeSet=new TreeSet<>();
		
		Student niresh = new Student("niresh",1045,399,"bssd@d.com");
		treeSet.add(niresh);
		treeSet.add(ram);
		treeSet.add(shyam);
		treeSet.add(chotushyam);
		print("Tree Set - No Duplicates only 2 emelents" , treeSet);
		
		
		


	}

}
