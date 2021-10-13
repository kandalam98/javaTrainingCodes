package com.example.legacy.threads;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
	private String message;

	public MyCallable(String message) {
		super();
		this.message=message;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "hello" + message;
	}

//	public MyCallable message(String message) {
//		super();
//		// TODO Auto-generated constructor stub
//	}

}
