package com.selenium.arrays;

public class ArrayMin {

	public static void main(String[] args) {
		int[] a = { 2, 1, 5, 8, 7, 3, 0, -3, 9, 7 };
		System.out.println("The minimum value in the array is: " + minArray(a));
	}

	// Time complexity:O(logn)
	// Space complexity: O(1)
	private static int minArray(int[] a) {

		int i = 1, j = a.length - 1, min = a[0], mid = (a.length) / 2;

		while (i < mid && mid < j) {
			if (a[i] < a[j]) {
				if (a[i] < min)
					min = a[i];
			} else {
				if (a[j] < min)
					min = a[j];
			}
			i++;
			j--;
		}

		return min;
	}

}
