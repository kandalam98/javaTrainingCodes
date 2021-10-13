package com.example.demo;
import java.util.Scanner;


public class ApplicationExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyExceptionHandling handling=new MyExceptionHandling();
////		handling.usingClassException();
//		handling.usingMultiCatch("66");
		try(Scanner sc=new Scanner(System.in);){
			
			int key=sc.nextInt();
			switch (key) {
			case 1:
				handling.usingClassException();
				break;
			case 2:
				handling.usingMultiCatch("233");
				break;
			case 3:
				handling.tryWithMultipleCatch();
				break;
			case 4:
				handling.usingFinallyBlock();
				break;
			default:
				break;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
