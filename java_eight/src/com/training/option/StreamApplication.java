package com.training.option;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentService service=new StudentService();
		List<Student> markSeventyAbove=service.useFilter();
//		
//		System.out.println("Seventy above");
//		markSeventyAbove.forEach(System.out::println);
//		
//		Predicate<Student> lessThanSeventy=(e) -> e.getMarkscored()<70;
//		Predicate<Student> greaterThanNinety=(e) -> e.getMarkscored()>90;
//		
//		System.out.println("less than seventy");
//		
//		service.useFilter(lessThanSeventy).forEach(System.out::println);
//		
//		System.out.println("Greater than 90");
		
//		service.useFilter(greaterThanNinety).forEach(System.out::println);
//		
//		service.getStudentNames().forEach(System.out::println);
//		service.transformToMap().forEach((key,value)-> System.out.println(key+ ":" +value));
		
		service.sortedByname().forEach( System.out::println);

	}

}
