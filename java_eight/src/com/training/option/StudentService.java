package com.training.option;

import java.time.LocalDate;



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StudentService {
	
	private List<Student> studentList;
	 public StudentService(){
		super();
		this.studentList=new ArrayList<>();
		this.studentList.add(new Student(201,"a",LocalDate.of(1999, 2, 11),99));
		this.studentList.add(new Student(201,"b",LocalDate.of(1999, 2, 8),69));
		this.studentList.add(new Student(201,"c",LocalDate.of(1999, 1, 11),79));
		this.studentList.add(new Student(201,"d",LocalDate.of(1999, 3, 1),82));
	}
	public List<Student> useFilter(){
		return this.studentList.stream().filter(e -> e.getMarkscored()>70).collect(Collectors.toList());
	}
	
	
	public List<Student> useFilter(Predicate<Student> predicate){
		return this.studentList.stream().filter(predicate).collect(Collectors.toList());
	}
	
	
	public Map<String,Integer> transformToMap(){
		return this.studentList.stream().filter(e -> e.getMarkscored()>70).collect(Collectors.toMap(Student::getStudentname,Student::getMarkscored));
	}
	
	
	public List<String> getStudentNames(){
		return this.studentList.stream().filter(e -> e.getMarkscored()>70).map(e -> e.getStudentname()).collect(Collectors.toList());
	}
	
	
	public Set<Student> sortedByname(){
		TreeSet<Student> list=this.studentList.stream().sorted().collect(Collectors.toCollection(TreeSet::new));
//		List<Student> list2= this.studentList.stream().sorted(Comparator.comparing(Student ::getMarkscored)).collect(Collectors.toList());
//		list2.forEach(e -> System.out.println(e.getStudentname()));  this prints only name
		return list;
		
//
//	
	}
	public double highestMark() {
		
//		Optional<Student> value=this.studentList.stream().map(e -> e.getMarkscored())
//				.max(Comparator.comparing(Student::getStudentname));
		
		Optional<Student> value=this.studentList.stream()
				.max(Comparator.comparing(Student::getStudentname));
				
		double max=0;
		if(value.isPresent()) {
			max=value.get().getMarkscored();
		}
		return max;
	}

}
