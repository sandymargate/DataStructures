package com.selenium.arrays;

import java.util.ArrayList;

public class ArraySumCombinations {

	public static void main(String[] args) {
		int[] a = { 0, 1, 4, 3, 6, 7, 2, 9, 11, 13, 9, 15, 5 };
		System.out.println("The sum combinations for the given number are:");
		sumCombinations(a, 15);
	}

	//Time complexity: O(n2)
	//Space complexity: O(n)
	private static void sumCombinations(int[] a, int sum) {

		int[] temp = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= sum) {
				temp[j] = a[i];
				j++;
			}
		}
		for (int i = 0; i < temp.length - 1; i++) {
			int minSum = 0;
			j = 0;
			ArrayList<Integer> temp1 = new ArrayList<Integer>();
			for (int k = i; k < temp.length; k++) {
				if (minSum > sum)
					break;
				else if (minSum == sum) {
					printSequence(temp1);
					break;
				} else {
					minSum = minSum + temp[k];
					temp1.add(temp[k]);
					j++;
				}
			}
		}

	}

	private static void printSequence(ArrayList<Integer> temp1) {

		for (int i = 0; i < temp1.size(); i++)
			System.out.print(temp1.get(i) + ",");
		System.out.println();
	}

}
