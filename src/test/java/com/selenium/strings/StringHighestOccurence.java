package com.selenium.strings;

import java.util.HashMap;

public class StringHighestOccurence {

	public static void main(String[] args) {
		String st = "ashasgahgtsaaakjkakljajjqohjjjjoououorryjjjjjfghfhgjj";
		char ch = highestOccurence(st);
		System.out.println("The highest occurence is: " + ch);
	}

	private static char highestOccurence(String st) {

		char[] ch = st.toCharArray();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i])) {
				map.put(ch[i], map.get(ch[i]) + 1);
			} else {
				map.put(ch[i], 1);
			}
		}

		int max = map.get(ch[0]);
		char c = ch[0];
		for (int i = 1; i < ch.length; i++) {
			if (map.get(ch[i]) > max) {
				max = map.get(ch[i]);
				c = ch[i];
			}

		}

		return c;
	}

}
