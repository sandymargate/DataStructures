package com.selenium.arrays;

public class ArrayContinuousPositiveSet {

	public static void main(String[] args) {
		int[] a = { 1, 2, 5, -7, 2, 5, 9 };
		System.out
				.println("The continuous subset of string with highest sum is:");
		continousPositiveSet(a);
	}

	private static void continousPositiveSet(int[] a) {

		int sum = 0, max = 0, end = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] - 0 >= 0) {
				sum = sum + a[i];
			}
			if (sum > max) {
				max = sum;
				end = i;
			}
			if(a[i]-0<0)
			{
				sum = 0;
			}
		}

		int start = end;
		while (max > 0) {
			max = max - a[start];
			start--;
		}

		for (int i = start + 1; i <=end; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
