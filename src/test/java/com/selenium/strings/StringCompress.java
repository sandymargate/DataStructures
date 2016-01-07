package com.selenium.strings;

import java.util.HashMap;

public class StringCompress {

	public static void main(String[] args) {
		String s1 = "AAAAASSSGTHJJJJKKKKMMMMNNNNNOPQRRRR";
		System.out.println("The compressed String is: " + stringCompress(s1));
	}

	// Time complexity: O(n)
	private static String stringCompress(String s) {

		char[] s1 = s.toCharArray();
		char[] t1 = new char[s.length()];

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s1.length; i++) {
			if (map.containsKey(s1[i])) {
				map.put(s1[i], map.get(s1[i]) + 1);
			} else {
				map.put(s1[i], 1);
			}
		}
		int i = 0, j = 0;
		while (i < s.length()) {
			if (map.containsKey(s1[i])) {
				t1[j] = s1[i];
				j++;
				if (map.get(s1[i]) > 1) {
					t1[j] = Character.valueOf((char) map.get(s1[i]).toString()
							.charAt(0));
					map.remove(s1[i]);
					j++;
				}
			}

			i++;
		}

		return new String(t1);
	}

}
