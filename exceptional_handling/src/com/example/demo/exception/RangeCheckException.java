package com.example.demo.exception;

public class RangeCheckException extends Exception {
	private String message;

	public RangeCheckException(String message) {
		super(message);
		this.message=message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception :=" + message;
	}
	

}
