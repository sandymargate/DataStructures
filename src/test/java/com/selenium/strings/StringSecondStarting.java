package com.selenium.strings;

public class StringSecondStarting {

	public static void main(String[] args) {
		String s1 = "abcdefgh";
		String s2 = "cdef";

		System.out.println("The index starting with the second string is: "
				+ secondStarting(s1, s2));
	}

	private static int secondStarting(String s1, String s2) {

		int index = -1, i = 0, j = 0;
		while (i < s1.length()) {
			if (s1.charAt(i) != s2.charAt(j))
				i++;
			else {
				index = i;
				while (i < s1.length() && j < s2.length()
						&& s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
				}
				
				if(j==s2.length())
					break;
			}

		}

		return index;
	}

}
