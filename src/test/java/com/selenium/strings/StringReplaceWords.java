package com.selenium.strings;

public class StringReplaceWords {

	public static void main(String[] args) {
		String st = "www%20google%20com";
		String strRep = stringReplaceWords(st);
		System.out.println(strRep);
	}

	private static String stringReplaceWords(String st) {

		for (int i = 0; i < st.length() - 2; i++) {
			if (st.substring(i, i + 3).compareTo("%20") == 0) {
				st = st.substring(0, i)+"." +st.substring(i + 3);
			}

		}

		return st;

	}
}