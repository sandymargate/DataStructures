package com.selenium.arrays;

public class ArrayElementSearchRotatedList {

	public static void main(String[] args) {
		int[] a = { 3, 4, 5, 6, 7, 1, 2 };
		if (isElementFound(a, 7))
			System.out.println("The element is found");
		else
			System.out.println("The element is not found");
	}

	private static boolean isElementFound(int[] a, int num) {

		boolean isfound = false;
		int i = 0, j = a.length - 1;
		while (a[i] > a[j]) {
			if (a[i] == num || a[j] == num) {
				isfound = true;
				break;
			}
			j--;
		}

		if (!isfound) {
			if (a[i] == num || a[j] == num) {
				isfound = true;
			} else

			{
				int mid = (i + j) / 2;

				while (mid > 0 && mid < a.length) {
					mid = (i + j) / 2;

					if (a[mid] == num) {
						isfound = true;
						break;
					} else if (a[mid] > num)
						j = mid;
					else
						i = mid;
				}
			}
		}

		return isfound;
	}
}