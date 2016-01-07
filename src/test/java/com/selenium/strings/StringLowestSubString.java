package com.selenium.strings;

import java.util.HashMap;

public class StringLowestSubString {

	public static void main(String[] args) {
		String st = "aanodeaminganiti";
		String lss = lowestSubString(st);
		System.out.println("The longest sub string is:" + lss);

	}

	//Time complexity: O(n2)
	//Space complexity: O(n)
	private static String lowestSubString(String st) {

		char[] ch = st.toCharArray();
		String lss = st.substring(0, 1);
		int i = 0, j = 0;
		for (i = 0; i < ch.length - 1; i++) {
			HashMap<Character, Integer> map = new HashMap<Character, Integer>();
			for (j = i; j < ch.length; j++) {
				if (!map.containsKey(ch[j])) {
					map.put(ch[j], 1);
				} else
					break;
			}

			if (st.substring(i, j).length() > lss.length()) {
				lss = st.substring(i, j);

			}
		}

		return lss;
	}
}
