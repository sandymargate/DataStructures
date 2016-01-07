package com.selenium.arrays;

public class ArrayCountZero {

	public static void main(String[] args) {
		int[] a = { 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
		System.out.println("The zero count in the array is: "
				+ zeroCountArray(a, 0, 0));
	}

	private static int zeroCountArray(int[] a, int n, int count) {
		if (a[n] == 1)
			return count;

		else {
			n = n + 1;
			count = count + 1;
			return zeroCountArray(a, n, count);
		}
	}

}
