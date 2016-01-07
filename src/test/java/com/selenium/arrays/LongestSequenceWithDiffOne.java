package com.selenium.arrays;

import java.util.HashMap;

public class LongestSequenceWithDiffOne {

	public static void main(String[] args) {
		int[] a = { 6, 10, 6, 7, 8, 9, 0, 7,8,10 };
		System.out.println("The longest sequence here with difference 1 is:");
		longestSequenceWithDiff(a);
	}

	private static void longestSequenceWithDiff(int[] a) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i]))
				map.put(a[i], map.get(a[i]) + 1);
			else
				map.put(a[i], 1);

		}

		for (int i = 0; i < a.length - 1; i++) {
			if (map.containsKey(a[i]) &&map.get(a[i]) > 1) {
				if (map.containsKey(a[i] + 1)) {
					System.out.println(a[i] + "," + a[i] + "," + (a[i] + 1));
					map.remove(a[i]);
				}
			}

		}
	}

}
