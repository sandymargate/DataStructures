package com.selenium.strings;

public class StringSequence {

	public static void main(String[] args) {
		String x = "1..9";
		System.out.println("The given string is:" + x);
		String y = stringSequence1(x);
		System.out.println("The given string is:" + y);

	}

	private static String stringSequence(String x) {

		char[] ch = x.toCharArray();
		char[] s = new char[ch[ch.length - 1] + 100];
		int i = 1, j = 2;
		s[0] = ch[0];
		s[1] = ',';
		while (i < ch.length) {
			if (ch[i] == '.') {
				i++;
				while (ch[i] == '.')
					i++;
				int num = (int) (ch[i] - '0');
				char inc = 0;
				while ((int) (inc - '0') != num) {
					s[j] = (char) (s[j - 2] + 1);
					inc = s[j];
					j++;
					s[j] = ',';
					j++;

				}
				i++;

			}

			else {
				s[j] = ch[i];
				i++;
				j++;
			}

		}

		return new String(s);
	}

	public static String stringSequence1(String st) {
       int i=0;
		while (i < st.length()-2) {
			if (st.substring(i, i + 2).compareTo("..") == 0) {
				String st1= st.substring(i+2);
				int start = (int) (st.charAt(i - 1) - '0');
				int end = (int) (st.charAt(i + 2) - '0');
				st = st.substring(0, i) + ",";
				while (start < end-1) {
					st = st + (start + 1) + ",";
					start++;
					i=i+2;
				}

				st = st + st1;
			}
			i++;

		}

		return st;
	}

}
