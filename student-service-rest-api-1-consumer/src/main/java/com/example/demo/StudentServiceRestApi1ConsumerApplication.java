package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.neo4j.ConfigBuilderCustomizer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class StudentServiceRestApi1ConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= SpringApplication.run(StudentServiceRestApi1ConsumerApplication.class, args);
		WebClient client=ctx.getBean(WebClient.class);
		Flux<String> resp=client.get().uri("https://localhost:5050/api/v1/students").retrieve().bodyToFlux(String.class) ;
		System.out.println(resp);
	
	}
	@Bean
	WebClient.Builder builder(){
		return WebClient.builder();
		
	}
	@Bean
	WebClient client(WebClient.Builder builderRef) {
		return builderRef.build();
	}

}
