package com.selenium.arrays;

public class ArrayPermutations {

	public static void main(String[] args) {
		int n = 5, i = 0;
		int[] temp = new int[n];
		while (i < n)
		{
			temp[i] = i;
			i++;
		}
		
		String temp1 = "12345";

		System.out.println("The permutations are:");
		permutations("", temp1);
	}

	private static void permutations(String t, String st) {

		if (st.length() <= 1)
			System.out.println(t + st);
		else {
			for (int i = 0; i < st.length(); i++) {
				String newOne = st.substring(0, i) + st.substring(i + 1);
				permutations(t + st.charAt(i), newOne);
			}

		}

	}
}
