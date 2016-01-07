package com.selenium.strings;

public class StringReplace {
	
	public static void main(String[] args)
	{
		String str = "Hello this is sandy";
		System.out.println("The given string is:"+ str);
		
		StringBuilder str2= new StringBuilder();
		String[] str1 = str.split("\\s");
		for(int i=0; i<str1.length; i++)
		{
			str2.append(str1[i]);
			str2.append("ABC");
		}
	}

}
