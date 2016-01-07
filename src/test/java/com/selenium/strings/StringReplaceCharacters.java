package com.selenium.strings;

public class StringReplaceCharacters {

	public static void main(String[] args) {
		String s = "reactableabcac";
		System.out.println("The modified / replaces string is: "
				+ replaceCharacters(s));

	}

	private static String replaceCharacters(String s) {
		int j = 1;
		while (j < s.length()) {
			if (s.charAt(j) == 'b') {
				s = s.substring(0, j)+s.substring(j+1);
				j--;
			}
			else if(s.charAt(j) == 'c' && s.charAt(j - 1) == 'a')
			{
				s = s.substring(0, j-1)+s.substring(j+1);
				j=j-2;
			}
			
			j++;
		}

		return s;
	}

}
