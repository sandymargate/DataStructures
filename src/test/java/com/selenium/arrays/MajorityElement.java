package com.selenium.arrays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class MajorityElement {

	public static void main(String[] args) {
		int[] a = { 2, 1, 3, 1, 1, 1, 1 };
		aMajorityElement(a);
		aMajorityElement2(a);
	}

	private static void aMajorityElement2(int[] a) {

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
			if (value> a.length/2) {

				System.out.println("key " + key + " Value " + value);
			}
		}

	}

	private static void aMajorityElement(int[] a) {

		int count = 1;
		int num = 0;
		int prevCount = 1;
		for (int i = 0; i < a.length - 1; i++) {
			count = 1;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}

			}

			if (prevCount < count) {
				prevCount = count;
				num = a[i];

			}
		}

		if (prevCount > (a.length) / 2) {
			System.out.println("The element repeated for n/2 times are " + num);
		} else {
			System.out.println("None");
		}
	}

}
