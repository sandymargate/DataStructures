package com.selenium.strings;

import java.util.HashMap;

public class StringDictionary {

	public static void main(String[] args)
	{
		String[] dictonary = {"this", "is", "sam", "sang", "samsung", "go", "mango", "man", "that"};
		String s1 = "This is sam and man is mango";
		System.out.println("The words present in the dictonay are:");
		dictonaryOfWords(dictonary, s1);
	}

	private static void dictonaryOfWords(String[] dictonary, String s1) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i=0; i< dictonary.length; i++)
		{
			if (map.containsKey(dictonary[i])) {
				map.put(dictonary[i].toLowerCase(), map.get(dictonary[i]) + 1);
			} else {
				map.put(dictonary[i].toLowerCase(), 1);
			}
		}
		
		String[] words = s1.split("\\s");
		for(int i=0; i< words.length; i++)
		{
			if(map.containsKey(words[i].toLowerCase()))
				System.out.println(words[i]);
		}
		
	}
}
