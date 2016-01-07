package com.selenium.strings;

public class StringMultiple {
	
	public static void main(String[] args)
	{
		String s = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("The string with multiples of 3 are:"+ multipleString(s,3));
	}

	private static String multipleString(String s, int mul) {
       
		char[] ch = s.toCharArray();
		char[] p = new char[ch.length];
		int i=1,j=0;
		while(i< ch.length)
		{
			if(i%mul==0)
			{
				p[j]=ch[i];
				j++;
			}
			
			i= i+1;
		}
		
		return new String(p);
	}

}
