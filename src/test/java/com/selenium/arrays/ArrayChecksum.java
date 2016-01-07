package com.selenium.arrays;

public class ArrayChecksum {

	public static void main(String[] args) {
		String num = "12340";

		if (isCheckSum(num))
			System.out.println("The num is valid checksum");
		else
			System.out.println("The num is not valid checksum");
	}

	private static boolean isCheckSum(String num) {

		char[] n1 = num.toCharArray();
		int sum = 0, i = 0;
		while (i <= n1.length - 2) {
			int num2 = Integer.valueOf(n1[i] - '0');
			sum = (int) (sum + (num2 *num2));
			i++;
		}
		
		if (sum % 10 == Integer.valueOf(n1[n1.length - 1]-'0'))
			return true;

		else
			return false;
	}

}
