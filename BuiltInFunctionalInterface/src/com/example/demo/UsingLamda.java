package com.example.demo;

import java.util.function.Predicate;

class Example implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello"); //just for example
		
	}
	
}
public class UsingLamda {
	public static void main(String[] args) {
		Runnable task= () -> {
			for(int i=1 ;i <=3 ;i++) {
				System.out.println(i);
			}
		};
		Thread t=new Thread(task);
		t.start();
		Condition passMark= () -> "ramesh".length()>10;
		System.out.println(passMark.test());
		System.out.println(passMark.show());
//		Predicate<Integer> IsPass= (mark)-> mark>70;
//		System.out.println("Status" + ":"+IsPass.test(88));
	}
	
		
	}
