package com.selenium.strings;

public class StringCharacterCompare {

	public static void main(String[] args) {
		String[] dict = { "baak", "bork", "bad", "bakku" };
		String pattern = "book";
		String patternMatched = characterCompare(dict, pattern);
		System.out.println("The matched pattern for " + pattern + " is "
				+ patternMatched);

	}

	private static String characterCompare(String[] dict2, String pattern2) {
		int num = 0, i = 0, j = 0;
		char[] pt1 = pattern2.toCharArray();
		String str = null;

		while (i < dict2.length) {
			char[] ch = dict2[i].toCharArray();
			if (ch.length == pt1.length) {
				while (j < pt1.length) {
					if (ch[j] != pt1[j]) {
						num++;
					}
					j++;
					if (num > 1)
						break;
				}
				if (num == 1) {
					str = dict2[i];
				}
				j = 0;
				num = 0;
			}
			i++;

		}

		return str;
	}

}
