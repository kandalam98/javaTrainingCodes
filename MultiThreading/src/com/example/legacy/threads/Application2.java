package com.example.legacy.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Application2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable task1 = new UseStringTask("Idly","Sambhar");
		Runnable task2 = new UseStringTask("Pizza","Burger");
		Runnable task3 = new UseStringTask("Tea","Biscuit");
		Runnable[] taskList= {task1,task2,task3};
		ExecutorService service=Executors.newFixedThreadPool(2);
		for(Runnable eachTask : taskList) {
			service.submit(eachTask);		
		}
		service.shutdown();

	}

}
