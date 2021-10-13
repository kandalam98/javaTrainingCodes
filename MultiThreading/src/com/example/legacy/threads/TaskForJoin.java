package com.example.legacy.threads;

public class TaskForJoin implements Runnable {

	@Override
	public void run() {
		System.out.println("Started Reading");
		// TODO Auto-generated method stub
		try {
			System.in.read();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Finished Reading");

	}

}
