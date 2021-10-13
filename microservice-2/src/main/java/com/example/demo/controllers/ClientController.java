package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {
	
	@Autowired
	private RestTemplate template;
	
	@GetMapping(path="/client")
	public String getBooks() {
		//Not using the host and port number rather calling with service ID
		//that is instead of calling http://localhost:7070/books
		//so we are calling http://BOOK-SERVICE/books
		return this.template.getForObject("http://BOOK-SERVICE/books",String.class);
	}
	

}
