package com.selenium.arrays;

import java.util.HashMap;

public class ArrayPattern {

	public static void main(String[] args) {
		int[] a = { 1,2,3,4,3,2,1};
		System.out.println("The sum of the numbers with index are:");
		arrayPattern(a);
	}


	//Space complexity: O(n)
	//Time complexity: O(n2)
	private static void arrayPattern(int[] a) {

		HashMap<Integer, Integer[]> map = new HashMap<Integer, Integer[]>();

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i+1; j < a.length; j++) {
				int sum = a[i] + a[j];
				if (map.containsKey(sum)) {
					System.out.println("(" + map.get(sum)[0] + ","
							+ map.get(sum)[1] + "," + i + "," + j + ")"+" "+ sum+" ");
				} else {
					Integer[] num = { i, j };
					map.put(sum, num);
				}
			}
		}

	}

}
