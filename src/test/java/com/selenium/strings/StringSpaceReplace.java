package com.selenium.strings;

public class StringSpaceReplace {
	
	public static void main(String[] args)
	{
		String spaceReplacement = "ABC";
		String s1 = "This is Sanhdya";
		System.out.println("The space replaced string is:"+ spaceReplacement(s1,spaceReplacement));
	}

	// Time complexity: O(n) 
	private static String spaceReplacement(String s1, String spaceReplacement) {
		
		for(int i=0; i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				s1 = s1.substring(0, i)+ spaceReplacement+ s1.substring(i+1);
			}
		}
		
		return s1;
	}

}
