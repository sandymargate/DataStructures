package com.selenium.strings;

import java.util.HashMap;

public class StringAnagram {
	
	public static void main(String[] args)
	{
	    String t1 = "xyz";
	    String s1 = "aqwsreroieuoiezyxdskjsk";
	    String s2 = "asdfdfdfdflklxyjkjk";
	    String s3 = "xyasaksxzyljkjkl";

	    //Sring anagram Output
	    if(isAnagramPresent(t1,s1))
	    {
	    	System.out.println("The String "+ t1+ " is present in "+ s1);
	    }
	    else
	    {
	    	System.out.println("The String "+ t1+ " is not present in "+ s1);
	    }
	}

	private static boolean isAnagramPresent(String t1, String s1) {
		
		boolean isAnagramPre = false;
		char [] t = t1.toCharArray();
		char[] s  = s1.toCharArray();
		HashMap<Character, Integer> targetMap = new HashMap<Character, Integer>();
		for(int i=0; i< t1.length(); i++)
		{
			targetMap.put(t[i], 1);
		}
		
		int i=0, j=0;
		while(i< s1.length() && j< t1.length())
		{
			if(targetMap.containsKey(s[i]))
			{
				while(j<t1.length())
				{
					if(targetMap.containsKey(s[i]))
					{
						i++;
						j++;
					}
					else 
						break;
				}
			}
			else
			{
				i++;
			}
		}
		
		
		if(j==t1.length())
			isAnagramPre = true;
		
		return isAnagramPre;
	}

}
