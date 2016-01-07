package com.selenium.strings;

public class StringPattern {

	public static void main(String[] args) {
		String text = "asjkhaaskjhjkASJAKJWOEIOWPUOIERURUWIONzbNBXBZBXZMXC";
		String pattern = "6 5 4";
		String patternTxt = getPattern(text, pattern);
		System.out.println("The pattern defined for the text is:" + patternTxt);
	}

	private static String getPattern(String text, String pattern) {

		String[] p1 = pattern.split("\\s");
		char[] t1 = text.toCharArray();
		char[] txtPattern = new char[t1.length + 20];

		int i = 0, j = 0, k = 0;
		while (i < t1.length) {
			j = 0;
			while (j < p1.length && i< t1.length) {
				int num = Integer.valueOf(p1[j].trim());
				while (num > 0 && i < t1.length) {
					txtPattern[k] = t1[i];
					k++;
					num--;
					i++;
				}
				if (num == 0) {
					txtPattern[k] = ';';
					k++;
					j++;
				}
			}
		}

		String str = new String(txtPattern);

		return str;
	}

}
