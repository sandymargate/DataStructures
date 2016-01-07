package com.selenium.arrays;

public class ArrayOddRepeatedTimesReplacement {

	public static void main(String[] args) {
		int[] a = { 1, 4, 2, 4, 3, 2, 4, 2, 1 };
		oddRepitionReplacement(a);
	}

	// TIme complexity: O(n2)
	// Space complexity: O(1)
	private static void oddRepitionReplacement(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] != -1 && a[j] != -1 && a[i] == a[j]) {
					count++;
					if (count % 2 == 0)
						a[j] = -1;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] == -1)
				System.out.print("No beep,");
			else
				System.out.print("beep,");
		}

	}

}
