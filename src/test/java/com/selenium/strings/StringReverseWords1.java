package com.selenium.strings;

public class StringReverseWords1 {

	public static void main(String[] args)
	{
		String s = "I hate you buddi";
		 System.out.println("The reverse string is:");
		 reverseString1(s);
	}

	private static void reverseString1(String s) {
		
		String[] words = s.split("\\s");
		for(int i=words.length-1; i>=0; i--)
		{
			System.out.print(words[i]+ " ");
		}
	}
}
