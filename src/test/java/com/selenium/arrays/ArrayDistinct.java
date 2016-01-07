package com.selenium.arrays;

import java.util.HashMap;

public class ArrayDistinct {
	
	public static void main(String[] args)
	{
		int [] a = {1,3,4,2,8,5};
		int[] b=   {1,4,0,2,7,8,5,3,10};
		System.out.println("The distinct elemnets are:");
		distinctElements(a,b);
	}

	//Time complexity: O(n)
	//Space complexity: O(n)
	private static void distinctElements(int[] a, int[] b) {
	
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0; i< a.length; i++)
		{
			map.put(a[i], 1);
		}
		
		for(int i=0; i<b.length; i++)
		{
			if(!map.containsKey(b[i]))
				System.out.print(b[i]+ " ");
		}
		
	}

}
