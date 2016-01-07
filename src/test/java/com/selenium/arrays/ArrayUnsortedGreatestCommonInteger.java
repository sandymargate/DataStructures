package com.selenium.arrays;

import java.util.HashMap;

public class ArrayUnsortedGreatestCommonInteger {
	
	public static void main(String[] args)
	{
		int[] a = {3,1,45,7,60,22,13,8};
		int [] b = {4,3,1,6,5,5,30,10,22,60};
		
		System.out.println("The greatest common integer from two unsorted arrays is:"+ greatestCommonInteger(a,b));
	}

	//Time complexity: O(n)
	//Space complexity:O(n)
	private static int greatestCommonInteger(int[] a, int[] b) {
		
		int max = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
				for(int i=0; i<a.length;i++)
					map.put(a[i], 1);
		 
			for(int i=0; i<b.length;i++)
			{
				if(map.containsKey(b[i]))
				{
					if(b[i]>max)
						max = b[i];
				}
			}
		
		return max;
	}

}
