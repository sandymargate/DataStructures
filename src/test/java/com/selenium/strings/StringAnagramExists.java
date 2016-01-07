package com.selenium.strings;

import java.util.HashMap;

public class StringAnagramExists {

	public static void main(String[] args) {
		String s1 = "Tom Marvolo Riddle";
		String s2 = "I am Lord Voldemort";

		if (isAnagramExists(s1, s2)) {
			System.out.println("The two strings are anagram each other");
		} else {
			System.out.println("The two strings are not anagram each other");
		}

	}

	// Time complexity: O(n)
	// Space complexity: O(n)
	private static boolean isAnagramExists(String s1, String s2) {

		boolean isAnagram = true;
		char[] st1 = s1.toLowerCase().toCharArray();
		char[] st2 = s2.toLowerCase().toCharArray();

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();

		for (int i = 0; i < st1.length; i++) {
			if (st1[i] != ' ') {
				if (map1.containsKey(st1[i])) {
					map1.put(st1[i], map1.get(st1[i]) + 1);
				} else {
					map1.put(st1[i], 1);
				}
			}

		}

		for (int i = 0; i < st2.length; i++) {
			if (st2[i] != ' ') {
				if (map1.containsKey(st2[i])) {
					map1.put(st2[i], map1.get(st2[i]) - 1);
				} else {
					isAnagram = false;
					break;
				}
			}
		}

		if (isAnagram) {
			for (Character key : map1.keySet()) {
				if (map1.get(key) != 0) {
					isAnagram = false;
					break;
				}
			}
		}

		return isAnagram;
	}

}
