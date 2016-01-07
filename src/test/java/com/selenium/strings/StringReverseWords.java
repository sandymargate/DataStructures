package com.selenium.strings;

public class StringReverseWords {
	
	public static void main(String[] args)
	{
		String sr = "This is Sandhya and she is good girl";
		String reverseStr = stringReverseWords(sr);
		System.out.println("the reverse string is: "+ reverseStr);
	}

	private static String stringReverseWords(String sr) {
		
		String[] str = sr.split("\\s");
		char[] reverseStr = new char[sr.length()+1];
		int i=0, j=0,k=0;
		while(i<str.length)
		{
			char[] wordSplit = str[i].toCharArray();
			j= wordSplit.length-1;
			while(j>=0)
			{
				reverseStr[k]= wordSplit[j];
				k++;
				j--;
			}
			
			reverseStr[k]=' ';
			k++;
			i++;
		}
		
		String strRev = new String(reverseStr);
		return strRev;
	}

}
