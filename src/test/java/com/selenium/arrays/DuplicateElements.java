package com.selenium.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DuplicateElements {

	// Time complexity: O(n)
	// Space complexity: O(n)

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 10 };
		duplicateEle(a);
	}

	private static void duplicateEle(int[] a) {

		boolean isFound = false;
		HashMap<Integer, Integer> majorityEle = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (majorityEle.containsKey(a[i])) {
				int count = majorityEle.get(a[i]) + 1;
				majorityEle.put(a[i], count);
			} else {
				majorityEle.put(a[i], 1);
			}
		}

		Iterator itr = majorityEle.entrySet().iterator();
		while (itr.hasNext()) {
			Entry thisEntry = (Entry) itr.next();
			int key = (Integer) thisEntry.getKey();
			int value = (Integer) thisEntry.getValue();
			if (value > 1) {
				isFound = true;
				System.out.println("The duplicate elements are " + key);
			}
		}

		if (!isFound) {
			System.out.println("There are no duplicate elements");
		}
	}
}
