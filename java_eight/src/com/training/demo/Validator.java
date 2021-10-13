package com.training.demo;

public interface Validator {
	public boolean validate();
	
    default String show() {
		return "From Validator";
	}

}
