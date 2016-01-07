package com.selenium.arrays;

import java.util.ArrayList;

public class ArraySortedPermutations {

	public static void main(String[] args) {
		int[] a = { 12, 4, 77 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			do {
				list.add(a[i] % 10);
				a[i] = a[i] / 10;
			} while (a[i] != 0);
		}

		int b[] = new int[list.size()];
		for (int i = 0; i < b.length; i++)
			b[i] = list.get(i);

		for (int i = 0; i < b.length - 1; i++) {
			for (int j = i; j < b.length; j++) {
				if (b[i] < b[j]) {
					int temp = b[j];
					b[j] = b[i];
					b[i] = temp;

				}
			}
		}

		StringBuilder num = new StringBuilder();
		for (int i = 0; i < b.length; i++)
			num.append(b[i]);
		permutations("", num.toString());

	}

	private static void permutations(String t, String num) {
		if (num.length() <= 1)
			System.out.println(t + num);
		else {
			for (int i = 0; i < num.length(); i++) {
				String newString = num.substring(0, i) + num.substring(i + 1);
				permutations(t + num.charAt(i), newString);
			}
		}
	}

}
