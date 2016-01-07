package com.selenium.arrays;

public class ArrayRemoveDuplicates {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 2, 2, 3, 4, 5, 5, 6, 6 };
		System.out.println("The rearranged elements in the array are: ");
		a = removeDuplicates(a);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	private static int[] removeDuplicates(int[] a) {

		int j = 0;
		int temp[] = new int[a.length];
		for (int i = 0; i < a.length-1; i++) {
			if (a[i] != a[i + 1]) {
				temp[j] = a[i];
				j++;
			}

		}

		return temp;
	}

}
