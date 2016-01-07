package com.selenium.strings;

public class StringRotation {

	public static void main(String[] args)
	{
		String str = "HelloWorld";
		System.out.println("The netered string is: "+ str);
		String rotatedString = stringRotation(str,1);
		System.out.println("The reverse string is:"+ rotatedString);

	}

	//Time complexity : O(n)
	//Space complexity : O(n)
	private static String stringRotation(String str, int rt) {
		
		char[] st1 = str.toCharArray();
		char[] rt1 = new char[st1.length];
		int j=0;
		for(int i=rt; i<st1.length; i++)
		{
			rt1[j]= st1[i];
			j++;
		}
		for(int i=0; i<rt; i++)
		{
			rt1[j]=st1[i];
			j++;
		}
		
		String rtString = new String(rt1);
		return rtString;
	}
}
