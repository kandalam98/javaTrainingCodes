package com.example.demo;
@FunctionalInterface
public interface Condition {
	String NAME="Polymorphism";
	public boolean test();
	
	default String show() {
		return "Hello i'm default !";
	}

}
