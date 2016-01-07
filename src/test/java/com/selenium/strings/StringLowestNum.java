package com.selenium.strings;

public class StringLowestNum {
	
	public static void main(String[] args)
	{
		String s = "123876";
		String lowNum = lowestNum(s,1);
		System.out.println("The lowest num is: "+lowNum);
	}

	// Time complexity: O(n2)
	// Space complexity: O(n)
	private static String lowestNum(String s, int digits) {
		
		char[] ch = s.toCharArray();
		String lowestNum = new String();
		for(int i = 0; i< ch.length; i++)
		{
			for(int j=0; j<ch.length-1; j++)
			{
				
				if(Integer.valueOf(ch[j]) >Integer.valueOf(ch[j+1]))
				{
					char temp = ch[j];
					ch[j] = ch[j+1];
					ch[j+1] = temp;
				}
			}
		}
		
		int i=0;
		while(digits>0)
		{
			lowestNum = lowestNum+ch[i];
			i++;
			digits--;
		}
		
		return lowestNum;
	}

}
