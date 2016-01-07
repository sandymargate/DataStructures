package com.selenium.strings;

public class StringConsecutiveRepetitionLetters {
	
	public static void main(String[] rags)
	{
		String[] s = {"Good", "bad", "boss", "baby", "bals", "cool","foo"};
		System.out.println("The consecutive letters repeated in the array are:");
		consectiveRepititionLetters(s);
	}

	//Time complexity: O(n2)
	//Space complexity: O(n)
	private static void consectiveRepititionLetters(String[] s) {
		
		for(int i=0; i<s.length; i++)
		{
			char[] ch = s[i].toCharArray();
			for(int j=0; j<ch.length-1; j++){
				if(ch[j]==ch[j+1])
				{
					System.out.print(s[i]+ " ");
					break;
				}
			}
		}
		
	}

}
