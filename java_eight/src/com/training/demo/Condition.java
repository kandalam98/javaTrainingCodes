package com.training.demo;
@FunctionalInterface
public interface Condition {
	String NAME="Polymorphism";
	public boolean test();
	public default String show() {
		return "Hello";
	};

}
