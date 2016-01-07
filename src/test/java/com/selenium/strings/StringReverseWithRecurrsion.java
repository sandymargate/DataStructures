package com.selenium.strings;

public class StringReverseWithRecurrsion {
	
	public static void main(String[] args)
	{
		String s = "This is good for recurssion";
		System.out.println("The string reverse is: ");
		reverseString(s.split("\\s"),s.split("\\s").length-1);
		System.out.println("The string reverse is: ");
		reverseString1(s,s.length()-1);
	}

	private static void reverseString(String[] s, int length) {
		
		if(length<0)
			return;
		else
		{
			System.out.print(s[length]+ " ");
			reverseString(s, length-1);
		}
		
	}
	
	private static void reverseString1(String s, int length){
		
		if(length<0)
			return;
		else
		{
			System.out.print(s.charAt(length));
			reverseString1(s, length-1);
		}
	}

}
