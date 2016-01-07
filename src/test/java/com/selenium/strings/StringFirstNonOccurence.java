package com.selenium.strings;

import java.util.HashMap;

public class StringFirstNonOccurence {

	public static void main(String[] args) {
		String s = "sandysans";
		System.out.println("The first non occurence character is: "
				+ firstNonOccurence(s));
	}

	private static char firstNonOccurence(String s) {
		char ch = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] s1 = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s1[i]))
				map.put(s1[i], map.get(s1[i]) + 1);
			else
				map.put(s1[i], 1);
		}

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s1[i]) == 1) {
				ch = s1[i];
				break;
			}
		}

		return ch;
	}

}
