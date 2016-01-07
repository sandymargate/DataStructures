package com.selenium.arrays;

import java.util.HashMap;

public class ArrayIndiceCombinations {

	public static void main(String[] args)
	{
	   int [] a = {1,7,3,4,5,6,2,1};	
	   System.out.println("The indexes satisfied with the targer sum:");
	   arrayIndiceCombinations(a,7);
	}

	private static void arrayIndiceCombinations(int[] a, int sum) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		  map.put(a[i], i);
		
		for(int i=0; i<a.length; i++)
		{
			if(map.containsKey(sum-a[i]))
			{
					System.out.println(i+","+map.get(sum-a[i]));
					map.remove(sum-a[i]);
					map.remove(a[i]);
			}
			if(sum==a[i])
				System.out.println(i+","+map.get(a[i]));
		}
		
	}
}
