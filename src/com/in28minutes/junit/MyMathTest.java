package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {
	
	private MyMath mymath = new MyMath();

	
	@Test
	void test() {
//		Absence of failure is success
//		Test Condition or Assert
		int[] arr = {};
		int result = mymath.calculateSum(arr);
		int expected = 0;
		assertEquals(expected, result);
		
	}

	
	@Test
	void test1() {
//		Absence of failure is success
//		Test Condition or Assert
		int[] arr = {1,2,3};
		int result = mymath.calculateSum(arr);
		int expected = 6;
		assertEquals(expected, result);
		
	}

}
