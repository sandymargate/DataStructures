package com.selenium.arrays;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayExpressionABCD {

	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 5, 4, 9, 7, 8 };
		System.out.println("The elements which satisfied A+B+C = D are:");
		arrayExpressionABCD(a);
	}

	private static void arrayExpressionABCD(int[] a) {

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>();
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (map.containsKey(sum)) {
					map.get(sum).add(a[i]);
					map.get(sum).add(a[j]);
				} else {
					ArrayList<Integer> value = new ArrayList<Integer>();
					value.add(a[i]); value.add(a[j]);
					map.put(sum, value);
				}
			}

		}

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				int diff = Math.abs(a[i] - a[j]);
				if (map.containsKey(diff)) {
					for (int k = 0; k < map.get(diff).size()-1; k++) {
						System.out.print("(" + a[i] + "," + a[j] + ","
								+ map.get(diff).get(k) + ","
								+ map.get(diff).get(k + 1) + ")");
						k++;
					}
				}
			}
		}

	}
}
