package com.selenium.strings;

public class StringPath {

	public static void main(String[] args) {
		String start = "cog";
		String end = "bad";
		String[] set = { "bag", "cag", "cat", "fag", "con", "rat", "sat", "fog" };
		stringPath(start, end, set);
	}

	private static void stringPath(String start, String end, String[] set) {

		char[] s1 = start.toCharArray();
		char[] e1 = end.toCharArray();
		int i = 0, j = 0, num = 0;
		while (i < set.length) {
			char[] wordsplit = set[i].toCharArray();
			j=0;
			num=0;
			while (j < wordsplit.length) {
				if (s1[j] != wordsplit[j]) {
					num++;
				}	
				j++;
			}
			if (num == 1) {
				System.out.println(set[i]);
				s1 = wordsplit;
				set[i]=null;
			}

			i++;
		}

	}

}
