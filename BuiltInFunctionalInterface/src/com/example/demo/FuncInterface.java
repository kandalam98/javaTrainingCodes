package com.example.demo;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import com.training.entity.Student;

public class FuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> names=Arrays.asList("Ramesh","Suresh");
		List<String> city=Arrays.asList("hyderabad","guntur");
		
		for(String each: names) {
			System.out.println(each);
		}
		
		names.forEach(e -> System.out.println(e));
//		Consumer<String> print=(e) -> System.out.println(e);
        //1		 
		Consumer<String> print=System.out::println;
		
		names.forEach(print);
		city.forEach(print);
		Student ram=new Student(101,"ram",LocalDate.now(),90);
		//2
		Predicate<Student> result=(obj) -> obj.getMarkscored()>90;
		System.out.println(result.test(ram));
 		
		//3
		Supplier<String> message = () -> "Happy Diwali";
		System.out.println("Geeting" + message.get());
		
		//4
		Function<String,Integer> func=(arg) -> arg.length();
		System.out.println(func.apply(message.get()));
		
		
	}

}
