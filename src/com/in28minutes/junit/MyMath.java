package com.in28minutes.junit;

public class MyMath {
	public int calculateSum(int[] nums) {
		
		int sum = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum+=nums[i];
		}
		
		return sum;
			
	}
}
