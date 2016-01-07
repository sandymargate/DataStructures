package com.selenium.strings;

public class StirngLexicoSorted {

	public static void main(String[] args) {
		String s = "ABAAMA????MAZON????????";
		String p = "AMAZON";
		System.out.println("The pattern string specified is: "
				+ lexicoSorted(s, p));
	}

	private static String lexicoSorted(String s, String p) {

		char[] s1 = s.toCharArray();
		char[] p1 = p.toCharArray();

		int i = 0, j = 0, count = 0;
		while (i < s1.length) {
			if (s1[i] == '?') {
				while (i < s1.length && s1[i] == '?') {
					count++;
					i++;
				}

				if (count > 0) {
					int startIndex = i - count;

					while (count - p.length() >= 0) {
						s1[startIndex] = p1[0];
						count--;
						startIndex++;
					}
					j = p.length() -count;
					while (count > 0 && count<p.length()) {
						s1[startIndex] = p1[j];
						j++;
						count--;
						startIndex++;
					}
				}
			}
			i++;
		}
		return new String(s1);
	}
}
