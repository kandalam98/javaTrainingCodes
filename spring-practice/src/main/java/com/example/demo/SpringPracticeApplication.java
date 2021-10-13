package com.example.demo;

import java.util.List;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.entity.Student;
import com.example.demo.entity.StudentList;

@SpringBootApplication
public class SpringPracticeApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringPracticeApplication.class, args);
		System.out.println(ctx.getClass().getName());
		StudentList order=ctx.getBean(StudentList.class);
		List<Student> list=order.getInvList();
		list.forEach(System.out::println);
		
		System.out.println("Singleton  :" + ctx.isSingleton("studentList"));
		System.out.println("Prototype  :" + ctx.isPrototype("studentList"));

	}

}
