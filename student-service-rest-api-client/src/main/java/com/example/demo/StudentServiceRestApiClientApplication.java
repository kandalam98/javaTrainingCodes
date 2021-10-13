package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class StudentServiceRestApiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceRestApiClientApplication.class, args);
	}
	/*
	 * @SpringBootApplication has @Configuration annotation into it
	 * So we can declare factory methods with @BEan in this itself
	 * Instead of creating a separate class with @Configuration annotation
	 */
	@Bean
	WebClient.Builder builder(){
		return WebClient.builder();
	}
	@Bean
	WebClient client(WebClient.Builder builderRef) {
		return builderRef.build();
	}

}
