package com.selenium.arrays;

import java.util.HashMap;


public class FrequencySort {

	public static void main(String[] args) {
		int[] a = { 1, 1, 2, 3, 4, 5, 5, 6, 7, 1, 0, 0, 0, 0, 0, 8, 6, 4 };
		a = frequenySort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	private static int[] frequenySort(int[] a) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if (map.containsKey(a[i])) {
				int count = map.get(a[i]) + 1;
				map.put(a[i], count);
			} else {
				map.put(a[i], 1);
			}
		}

		Object[] valuesList = map.values().toArray();

		for (int i = 1; i < valuesList.length ; i++) {
			int val = (Integer) valuesList[i];
			int j = i - 1;

			while (j >= 0 && (Integer)valuesList[j] > val) {
				valuesList[j + 1] = valuesList[j];
				j--;
			}

			valuesList[j + 1] = val;
		}

		int j = 0;
		for (int i = valuesList.length-1; i >0; i--) {
			int key = 0;
			for (int o : map.keySet()) {
				if (map.get(o).equals(valuesList[i])) {
					key = o;
					break;
				}
			}

			while ((Integer)valuesList[i] != 0) {
				a[j] = key;
				j++;
				valuesList[i] = (Integer)valuesList[i]-1;
			}
		}

		return a;
	}

}
