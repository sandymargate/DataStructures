package com.selenium.strings;

public class StringRemoveSpaces {

	public static void main(String[] s) {
		String str = "This is sandhya and I hate you";
		System.out.println("The string with no spaces:"
				+ removeSpacesString(str));
		System.out.println("The string with no spaces:"
				+ removeSpacesString1(str));

	}

	private static String removeSpacesString(String s) {

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				s = s.substring(0, i) + s.substring(i + 1);
			}
		}

		return s;
	}

	private static String removeSpacesString1(String s) {
		String[] words = s.split("\\s");
		String word = null;
		for (int i = 0; i < words.length; i++)
			if (word == null) {
				word = words[i];
			} else
				word = word + words[i];
		return word;
	}

}
