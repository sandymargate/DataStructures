package com.selenium.strings;

public class StringPermutations {

	public static void main(String[] args) {
		String s = "abc";
		System.out.println("The permutations for a string are:");
		 permutations("", s);
		combinations(s, s.length());
	}

	private static void permutations(String b, String s) {

		if (s.length() <= 1)
			System.out.println(b + s);
		else
			for (int i = 0; i < s.length(); i++) {
				String newString = s.substring(0, i) + s.substring(i + 1);
				permutations(b + s.charAt(i), newString);
			}

	}

	private static void combinations(String s, int size) {
		for (int i = 0; i <= s.length()-1; i++) {
			for (int j = i; j <= s.length(); j++) {
				permutations("", s.substring(i, j));
			}
		}
	}

}
