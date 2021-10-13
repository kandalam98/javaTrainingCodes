package com.training.demo;

import java.util.Optional;

public class UnderStandingOptional {
	
	public static String getMessage(int key) {
		switch(key) {
		case 1:
			return "Happy Birthday";
		case 2:
			return "Happy Diwali";
		case 3:
			return "Happy pongal";
		default:
			return null;
		}
	}
	public static void main(String[] args) {
//		System.out.println(getMessage(4).toUpperCase());
		Optional<String> resp=Optional.ofNullable(getMessage(2));
//		if(resp.isPresent()) {
//			System.out.println(resp.get().toUpperCase());
//		}else {
//			System.out.println("Invalid choice");
//		}
//		resp.orElseThrow(RuntimeException::new);

		
		System.out.println(resp.orElseGet(() -> getMessage(2)));
		
		
	}


}
