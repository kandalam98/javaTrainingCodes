package com.example.legacy.threads;

public class JoinApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Started");
		TaskForJoin task=new TaskForJoin();
		Thread t1=new Thread(task);
		t1.start();
		
		try {
			t1.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		 System.out.println("Main finished");

	}

}
