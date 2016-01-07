package com.selenium.strings;

public class EvenAndOddPositionSorting {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("The sorted array as per sorting is:");
		a = evenAndOddSorting(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
	}

	private static int[] evenAndOddSorting(int[] a) {

		a = doSorting(a, 0);
		a = doSorting(a, 1);

		return a;
	}

	private static int[] doSorting(int[] a, int i) {

		for (int j = i; j < a.length - 2; j++) {
			for (int k = i; k < a.length-2; k++) {
				if (i == 0) {
					if (a[k] > a[k + 2]) {
						int temp = a[k + 2];
						a[k + 2] = a[k];
						a[k] = temp;
					}

				}
				if (i == 1) {
					if (a[k] < a[k + 2]) {
						int temp = a[k + 2];
						a[k + 2] = a[k];
						a[k] = temp;
					}
				}

				k++;
			}
			j++;
		}

		return a;
	}
}
