package com.selenium.arrays;

public class ArraySumContinuousSequence {

	public static void main(String[] args) {
		int[] a = { -2, 11, -4, 13, -5, -2 };
		System.out.println("The maximum subsequence in the array is: ");
		sumContinuousSequence(a);
	}

	private static void sumContinuousSequence(int[] a) {

		// Kadane Algorithm
		int max = a[0], max_current = a[0], start= 0,end = 0;
		for (int i = 1; i < a.length; i++) {
			if (max_current < 0) {
				max_current = a[i];
				start = i;
				end = i;
			} else {
				max_current = max_current + a[i];
				end = i;
			}
			if (max < max_current)
				max = max_current;
		}
		
		for(int i=start; i<end; i++)
			System.out.print(a[i]+ ",");

	}
}
