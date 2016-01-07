package com.selenium.arrays;

public class IntersectionElements {

	//Time complexity: O(n)
	//Space complexity: O(1)
	
	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 7 };
		int b[] = { 1, 4, 9, 11 };
		intersectionElements(a, b);

	}

	private static void intersectionElements(int[] a, int[] b) {

		int i = 0;
		int j = 0;
		boolean isfound = false;

		while (i < a.length && j < b.length) {
			if (a[a.length - 1] < b[0])
				break;

			if (a[i] < b[j])
				i++;
			else if (a[i] > b[j])
				j++;
			else if (a[i] == b[j]) {
				isfound = true;
				System.out.println(a[i]);
				i++;
				j++;
			}
		}

		if (!isfound) {
			System.out.println("There are no intersection elements");
		}
	}
}
