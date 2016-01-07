package com.selenium.arrays;

public class ArrayMaxProductof3Num {

	public static void main(String[] args) {
		int a[] = { 3, 1, 4, 2, 5, 8, 2, 7, 1 };
		System.out.println("The maximum product of 3 elements are:"
				+ maxProductof3Num(a));
	}

	private static long maxProductof3Num(int[] a) {

		long product = 1;
		int count = 3;
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		int k = 1;
		while (count>0) {
			product = product * a[a.length - k];
			count--;
			k++;
		}

		return product;

	}
}