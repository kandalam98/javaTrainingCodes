package com.example.demo;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactor.core.publisher.*;
import reactor.core.*;
@SpringBootApplication

public class StudentServiceRestApiReactiveSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentServiceRestApiReactiveSpringApplication.class, args);
		Flux<String> namePublisher= Flux.just("Yuvan","Nikhil","jaideep","chennai");
		namePublisher.subscribe(System.out::println);
		namePublisher.subscribe(new Subscriber() {

			@Override
			public void onSubscribe(Subscription s) {
				// TODO Auto-generated method stub
				s.request(4);
				System.out.println("One subscriber called" );
				
			}

			@Override
			public void onNext(Object t) {
				// TODO Auto-generated method stub
				System.out.println("From On next : =" + t.toString());
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				System.out.println(t.getMessage());
				
			}

			@Override
			public void onComplete() 
			{
				// TODO Auto-generated method stub
				System.out.println("Completed");
				
			}
		}
		);
	}

}
