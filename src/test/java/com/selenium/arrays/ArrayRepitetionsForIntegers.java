package com.selenium.arrays;

public class ArrayRepitetionsForIntegers {

	public static void main(String[] args) {
		int[] a = { 1, 3, 1, 4, 5, 6, 7, 9, 7, 8 };
		System.out.println("The missed number and repition numbers");
		repetitionNumbers(a, a.length);
	}

	static void repetitionNumbers(int A[], int n) {
		int i = 0;
		for (i = 0; i < n; i++)
		{
			int a = A[i]%n;
			A[A[i] % n] += n;
		}
		for (i = 0; i < n; i++) {
			int frequency = A[i] / n;
			int element = i;
			System.out.println("Element= %d , frequency = %d"+element+","+frequency);
		}
	}
}
