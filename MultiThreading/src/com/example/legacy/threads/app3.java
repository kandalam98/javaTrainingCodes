package com.example.legacy.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class app3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(2);
		Callable task=new MyCallable("ramesh");
		Future result=service.submit(task);
		try {
			System.out.println(result.isDone());
			System.out.println(result.get());
			System.out.println(result.isDone());
			
		}catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		

	}

}
