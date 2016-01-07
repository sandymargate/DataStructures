package com.selenium.arrays;

import java.util.HashMap;

public class ArrayUnsortedIntersection {
	
	public static void main(String[] args)
	{
		int[] a = {1,4,2,7,6};
		int[] b = {3,1,5,6};
		
		System.out.println("The intersection elements are:");
		unSortedIntersectionElements(a,b);
	}

	//Time complexity: O(n)
	//Space complexity: O(n)
	private static void unSortedIntersectionElements(int[] a, int[] b) {
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
			map.put(a[i], 1);
		for(int i=0; i<b.length;i++)
		{
			if(map.containsKey(b[i]))
				System.out.print(b[i]+",");
		}
		
	}

}
