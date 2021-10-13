package com.example.demo;

public class MyExceptionHandling {
	//Ex for unchecked exception => Run time
	//All classes which extends RunTime exception are unchecked
	public void usingClassException() {
		Object ageObj=Integer.valueOf(20);
		try {
			Integer age=(Integer)ageObj;
			System.out.println(age);
		}catch(Exception e) {
			System.err.println("Age should be between 0 -9");
			e.printStackTrace();
		}	
	}
	public void usingMultiCatch(String strNumber) {
		
		String[] value= {"hello","Welcome"};
		String temp=null;
		try {
			int num=Integer.parseInt(strNumber);
			System.out.println(temp.length());
			System.out.println(value[2]);
			System.out.println(num);
		}
		catch (NumberFormatException e) {
			System.err.println("Argument shud be 0-9");
			e.printStackTrace();
		}catch(NullPointerException e) {
			System.err.println("Argument shud not be NULL");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void tryWithMultipleCatch() {
		
		try {
			int num=20;
			int[] deno= {10,0};
			System.out.println(num/deno[1]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	public void usingFinallyBlock() {
		try {
			int num=20;
			int[] deno= {10,0};
			System.out.println(num/deno[1]);
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("inside finally block");
		}
		
	}
	public void usingTryWithResource() {
		
	}
	

}
