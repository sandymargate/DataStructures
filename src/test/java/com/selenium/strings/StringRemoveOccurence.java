package com.selenium.strings;

import java.util.HashMap;

public class StringRemoveOccurence {

	public static void main(String[] args) {
		String s = "bananas";
		System.out.println("The removed occurence of the string s is: "
				+ removeOccurence1(s));
		System.out.println("The removed occurence of the string s is: "
				+ removeOccurence(s));
	}

	private static String removeOccurence(String s) {
		char[] ch = s.toCharArray();
		char[] t = new char[s.length()];

		int i = 0, j = 0;
		while (i < ch.length) {
			if (ch[i] == 'a' || ch[i] == 'i')
				i++;
			else {
				t[j] = ch[i];
				i++;
				j++;
			}
		}

		return new String(t);
	}

	private static String removeOccurence1(String s) {

		char[] s1 = s.toCharArray();
		char[] t = new char[s.length()];
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s1[i]))
				map.put(s1[i], map.get(s1[i]) + 1);
			else
				map.put(s1[i], 1);
		}

		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (map.containsKey(s1[i])) {
				if (map.get(s1[i]) > 1) {
					t[j] = s1[i];
					j++;
					map.remove(s1[i]);
				} else {
					t[j] = s1[i];
					j++;
				}
			}
		}

		return new String(t);
	}

}
