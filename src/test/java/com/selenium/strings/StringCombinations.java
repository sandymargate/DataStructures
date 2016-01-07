package com.selenium.strings;

public class StringCombinations {
	public static void main(String[] args)
	{
		String s = "Hello";
		System.out.println("The String combinations are:");
		combinations(s);
	}

	private static void combinations(String s) {
		
		for(int i=0; i<s.length(); i++)
		{
			for(int j=i; j<=s.length(); j++)
			{
				permutations("", s.substring(i, j));
			}
		}
		
	}

	private static void permutations(String target, String s) {
		
		if(s.length()<=1)
			System.out.println(target+s);
		else
		{
			for(int i=0; i<s.length();i++)
			{
				String newString = s.substring(0, i)+s.substring(i+1);
				permutations(target+s.charAt(i), newString);
			}
		}
		
	}
}
