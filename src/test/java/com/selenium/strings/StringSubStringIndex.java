package com.selenium.strings;

public class StringSubStringIndex {
	
	public static void main(String[] args)
	{
		String s = "acbnskjhigyujkonvbvgsjakugejkkjkoiyutrewq";
		String t = "konvbvg";
		System.out.println("The index where target string started: "+ subStringIndex(s,t));
	}

	private static int subStringIndex(String s, String t) {
       
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		
		int i=0, j=0;
		int index = -1;
		while(i< s1.length && j< t1.length)
		{
			if(s1[i]==t1[j])
			{
		     	i++;
				j++;
			}
			
			else
			{
				i++;
			}
		}
		
		if(j==t1.length)
			index= i-t1.length;
		
		return index;
	}

}
