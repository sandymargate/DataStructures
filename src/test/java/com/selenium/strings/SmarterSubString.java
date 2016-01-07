package com.selenium.strings;

public class SmarterSubString {
	
	public static void main(String[] args)
	{
		String str = "This is sandhya with too many characters";
		String smarterString = smarterString(str);
		System.out.println(smarterString);
	}

	private static String smarterString(String str) {
		
		String [] words = str.split("\\s");
		int i=0, j=0, num=0;
		char[] ch = new char[30];
		while(i<words.length && num<30)
		{
			char [] word = words[i].toCharArray();
			if((30-num)>word.length)
			{
				j=0;
				while(j<word.length)
				{
					ch[num] = word[j];
					j++;
					num++;
				}
				
				ch[num]=' ';
				num++;
				i++;
				
			}
			else
				break;
		}
		
		String str1 = new String(ch); 
		
		return str1;
	}
	

}
