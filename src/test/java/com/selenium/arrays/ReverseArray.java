package com.selenium.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] a = { 12, 11,10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
		a = reverseArray(a);

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

	}

	private static int[] reverseArray(int[] a) {

		int i = 0;
		int j = a.length - 1;
		while (i <= j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}

		return a;
	}
}
