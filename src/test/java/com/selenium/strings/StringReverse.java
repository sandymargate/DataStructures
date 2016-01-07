package com.selenium.strings;

public class StringReverse {
	
	public static void main(String[] args)
	{
		String str = "Hello this is sandy";
		System.out.println("The given string is:"+ str);
		char[] str1 = str.toCharArray();
		System.out.println("The reverse string is:");
		for(int i=str1.length-1; i>=0; i--)
		{
			System.out.print(str1[i]);
		}
	}

}
