package com.example.demo;
import java.util.*;

public class StudentService {
	
	HashMap<String,List<Student>> details;
	
	public StudentService() {
		details=new HashMap<>();
		List<Student> mcalist=Arrays.asList(new Student(101,"Ezhil",90),new Student(102,"abraz",67));
		List<Student> belist=Arrays.asList(new Student(103,"carol",70),new Student(104,"danish",89));
		details.put("be",belist);
		details.put("mca",mcalist);
	}

	public List<Student> findByBranch(String branch) {
		return  details.get(branch);
	}
}
	
