package com.selenium.strings;

public class StringExpand {

	public static void main(String[] args) {
		String A = "A3B2C10D11E7K";
		System.out.println("The expanded string is: ");
		expandString(A);
	}

	// Time complexity: O(n2)
	// Space complexity: O(n)
	private static void expandString(String A) {

		char[] ch = A.toCharArray();
		int i = 0;
		while (i < ch.length) {
			if (i < ch.length - 1 && Character.isDigit(ch[i])
					&& Character.isDigit(ch[i + 1])) {
				int digit = Integer.valueOf(A.substring(i, i + 2));
				while (digit != 1) {
					System.out.print(ch[i - 1]);
					digit--;
				}

				i = i + 2;

			} else if (Character.isDigit(ch[i])) {
				int digit = Integer.valueOf(A.substring(i, i + 1));
				while (digit != 1) {
					System.out.print(ch[i - 1]);
					digit--;
				}
				i++;
			} else {
				System.out.print(ch[i]);
				i++;
			}
		}

	}

}
