package com.example.demo.configuration;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

//import com.example.demo.entity.Product;
import com.example.demo.entity.Student;

@Configuration
public class AppConfig {
	/*
	 * factory method
	 * Spring IoC will always call default method
	 * "register bean with id ram
	 * 'ram' being the method name
	 */

	@Bean
	@Profile(value="dev")
	public Student ram() {
		return new Student(101,"ram",993444333L);
		
	}
	@Bean
	@Primary
	@Profile(value="prod")
	public Student shyam() {
		return new Student(201,"shyam",3333444333L);
		
	}
	@Bean
	@Profile(value="dev")
	public Student ramesh() {
		return new Student(202,"ramesh",3444333L);
		
	}
	@Bean
	@Profile(value="prod")
	public Student nishal() {
		return new Student(202,"nishalAndagadu",3444333L);
		
	}
	@Bean
	public Student akKING() {
		return new Student(202,"rafehero",3444333L);
		
	}


}
