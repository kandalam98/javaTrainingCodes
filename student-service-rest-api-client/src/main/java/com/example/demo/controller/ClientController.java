package com.example.demo.controller;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.training.demo.dto.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path="/client/student/")
public class ClientController {
	private WebClient client;
	private static String uri="http://localhost:8100/api/v1/student/";
	
	public void setClient(WebClient client) {
		this.client=client;
	}
	@GetMapping
	public Flux<String> getAllStudents(){
		return client.get().uri(uri)
				.headers(header -> header.setBasicAuth("kakai","kakai"))
				.retrieve().bodyToFlux(String.class);
	}
	@GetMapping(path = "/{rollnumber}")
	public Mono<String> findById(@PathVariable("rollnumber") int rollNumber){
		return client.get().uri(uri+"{rollnumber}",rollNumber).retrieve().bodyToMono(String.class);
	}
    @PostMapping
    public Mono<String> add(@RequestBody Student entity) {
    	
    	return client.post().uri(uri)
    			.body(Mono.just(entity),Student.class)
    			
    			 .retrieve()
    			  .bodyToMono(String.class);
//    	Student addedEntity=this.client.addStudent(entity);
//    	return ResponseEntity.status(HttpStatus.CREATED).bodyToMono(String.class);
    }
//    @DeleteMapping(path="/{rollnumber}")
//    public Mono<String> removeStudent(@PathVariable("rollnumber") int rollNumber)
//    {
//    	return client.delete()
//    			.uri(uri+"{rollnumber}",rollNumber)
//    			.retrieve().bodyToMono(String.class);
//    }
    @PutMapping(path = "/{rollnumber}/{markToUpdate}")
 	public Mono<String>  updateMark(@PathVariable("rollnumber") int rollNumber ,@PathVariable("markToUpdate") double markToUpdate  ){
    	return client.put().uri(uri +"{rollnumber}/{markToUpdate}",rollNumber,markToUpdate).retrieve().bodyToMono(String.class);
 	}

}
