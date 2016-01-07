package com.selenium.strings;

public class StringReverseOrder {
	
	public static void main(String[] args)
	{
	String[] words = {"AAA", "AAB", "AAC", "BBA", "BBB","CCC","BBC"};
	System.out.println("The sorted reverse order: ");
	reverseOrder(words);
	}

	// Time complexity: O(n2)
	// Space complexity: O(n)
	private static void reverseOrder(String[] words) {
		
		String[] wordsRev = new String[words.length];
		for(int i=0; i< words.length; i++)
		{
			wordsRev[i]= reverseString(words[i]);
		}
		
		for(int i=0; i< wordsRev.length; i++)
		{
			for(int j=0; j< wordsRev.length-1; j++)
			{
				if(wordsRev[j].compareTo(wordsRev[j+1])<0)
				{
					String temp = wordsRev[j];
					wordsRev[j] = wordsRev[j+1];
					wordsRev[j+1] = temp;
				}
			}
		}
		
		for(int i=0; i< wordsRev.length; i++)
		{
			wordsRev[i]= reverseString(wordsRev[i]);
			System.out.print(wordsRev[i]+ " ");
		}
		
	}

	private static String reverseString(String word) {
		
		char[] w1 = word.toCharArray();
		char[] words = new char[w1.length];
		int j=0;
		for(int i= word.length()-1; i>=0; i--)
		{
			words[j]= w1[i];
			j++;
		}
		return new String(words);
	}

}
