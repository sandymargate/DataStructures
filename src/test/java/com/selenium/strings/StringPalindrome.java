package com.selenium.strings;

public class StringPalindrome {

	public static void main(String[] args) {
		String str = "Sore was I ere I saw Eros";
		boolean isPalindrome = stringPalindrome(str);
		if (isPalindrome) {
			System.out.println("The given string is palindrome");
		} else {
			System.out.println("The given string is not palindrome");
		}
	}

	private static boolean stringPalindrome(String str) {

		boolean isPalindrome = false;
		int mid = (str.length()) / 2;
		char[] ch = str.toLowerCase().toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < mid && j > mid) {
			if (ch[i] != ch[j]) {
				isPalindrome = false;
				break;
			} else
				isPalindrome = true;
			i++;
			j--;
		}

		return isPalindrome;
	}

}
