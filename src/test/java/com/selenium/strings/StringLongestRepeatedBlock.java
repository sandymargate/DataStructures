package com.selenium.strings;

public class StringLongestRepeatedBlock {

	public static void main(String[] args) {
		String s = "aabbbcccccddddddddddddddddffffffffffffffffffffffffffffffffffffffffffggggghhhhhhhhhhhhhhhhhhhhhhh";
		System.out.println("The longest repeated block is:"
				+ longestRepeatedBlock(s));
	}

	private static String longestRepeatedBlock(String s) {
		char[] ch = s.toCharArray();
		int max = 1, i = 0, j = 1, start = 0, end = 0, maxMax = 0;

		while (i < s.length() - 1 && j < s.length()) {
			System.out.println(s.length());
			while (i < s.length() - 1 && j < s.length() && ch[i] == ch[j]) {
				max++;
				i++;
				j++;

			}

			if (maxMax < max) {
				maxMax = max;
				max = 1;
				end = j;
				start = j - maxMax;
			}

			i++;
			j++;

		}

		return s.substring(start, end);
	}

}
