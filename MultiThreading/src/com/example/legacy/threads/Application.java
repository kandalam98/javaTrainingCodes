package com.example.legacy.threads;

public class Application {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {
			Runnable counter=new CountNumbers(10);
			Thread t1=new Thread(counter,"ten");
			t1.start();
			Thread.sleep(4000);
			
			Runnable counter2=new CountNumbers(100);
			Thread t2=new Thread(counter2,"hundred counter");
			t2.start();
			Thread.sleep(400);
			
			Runnable counter3=new CountNumbers(1000);
			Thread t3=new Thread(counter3,"thousand counter");
			t3.start();
			Thread.sleep(400);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
