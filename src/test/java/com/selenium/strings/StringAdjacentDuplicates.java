package com.selenium.strings;

public class StringAdjacentDuplicates {

	public static void main(String[] args) {

		String s1 = "Hello Everyone";
		String s2 = "Hello Everyone is good";
		System.out.println("The concatenated string removing duplicates: "
				+ adjacentDuplicates(s1, s2));
	}

	//Time complexity: O(n2)
	//Space complexity: O(n)
	private static String adjacentDuplicates(String s1, String s2) {

		char[] t1 = s1.toCharArray();
		char[] t2 = s2.toCharArray();
		char[] t3 = new char[t1.length + t2.length];
		int i = t1.length - 1, j = 0, k = 0;
		while (i >= 0) {
			while (t1[i] != t2[j])
				i--;

			while (i<t1.length-1 && t1[i] == t2[j]) {
				i++;
				j++;
			}

			break;
		}

		i = 0;j = j+1;
		while (i < t1.length) {
			t3[k] = t1[i];
			k++;
			i++;
		}
		while (j < t2.length) {
			t3[k] = t2[j];
			k++;
			j++;
		}

		return new String(t3);
	}
}
