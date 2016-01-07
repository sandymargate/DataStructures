package com.selenium.arrays;

public class ArrayRotationWithoutExtraArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		a = rotateArray(a, 3);
		System.out.println("The rotated array is: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	//Time complexity: O(n2)
	//Space complexity: O(1)
	private static int[] rotateArray(int[] a, int num) {

		int rot1 = 0;
		int i = 0, j = 0;
		while (i< num) {
			rot1 = a[0];
			j = 0;
			while (j < a.length - i-1) {
				a[j] = a[j + 1];
				j++;
			}
			i++;
			a[j] = rot1;
		}

		return a;
	}

}
