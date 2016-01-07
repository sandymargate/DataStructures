package com.selenium.strings;

public class StringIndex {

	public static void main(String[] args) {
		String str = "12345678910111213141516171819202122232342526272829230";
		System.out.println("The string at index 11 is:" + stringIndex(11, str));
	}

	private static int stringIndex(int index, String s) {

		int i = 0;
		if (index < 10)
			i = index - 1;
		else if (index < 100)
			i = (index - 10) * 2 + 9;
		else if (index < 1000)
			i = (index - 1000) * 3 + 90 * 2 + 9;
		else if (index < 10000)
			i = (index - 10000) * 4 + 900 * 3 + 90 * 2 + 9;

		return s.indexOf(11);
	}

}
