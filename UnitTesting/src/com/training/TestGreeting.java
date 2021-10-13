package com.training;

import static org.junit.Assert.assertThrows;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.time.DayOfWeek;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class TestGreeting {
	Greeting grtObj;
	@BeforeEach
	public void setup() {
		System.out.println("Before setting up");
		grtObj=new Greeting();
	}
	@Test
	@DisplayName(value = "To Test the method for returning lengths ")
	void testForGetMessage() {
//		Greeting grtobj=new Greeting();
		int actual=grtObj.getMessage().length();
		int expected=10;
		assertEquals(expected,actual);
	}
	@ParameterizedTest
	@ValueSource(ints = {0,1,3})
	void testGetBestBook(int idxPos) {
		LocalDate currentdate=LocalDate.now();
		assumeTrue(currentdate.getDayOfWeek().equals(DayOfWeek.TUESDAY));
		
		assertNotNull(grtObj.getBestBook(idxPos));
	}
	@Test
	void testAssignGrade() {
		String actual=grtObj.assignGrade(40.00);
		String expected="b";
		assertEquals(expected,actual);
	}
	@Test
	void testParseMethod() {
		assertThrows(NumberFormatException.class,()-> grtObj.parse("fifty"));
	}
	@AfterEach
	void tearDown() {
		System.out.println("After each called");
	}
	@AfterAll
	public static void destroy() {
		System.out.println("After all called");
	}

}
