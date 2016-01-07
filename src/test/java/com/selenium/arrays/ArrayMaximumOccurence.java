package com.selenium.arrays;

import java.util.HashMap;

public class ArrayMaximumOccurence {
	
	public static void main(String[] args)
	{
		int[] a = {1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,4,4,4,4,4,4,4,4,4,4,4,4,4,6,6,6,7,8,9,9};
		System.out.println("The maximum occurence of the element is: "+ maxOccurence(a));
	}

	
	//Time complexity: O(n)
	//Space complexity: O(n)
	private static int maxOccurence(int[] a) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max = 0, maxEle = a[0];
		for(int i=0; i< a.length-1; i++)
		{
			if(map.containsKey(a[i]))
				map.put(a[i], map.get(a[i])+1);
			else
				map.put(a[i], 1);
			if(a[i]!=a[i+1])
			{
				if(max<map.get(a[i]))
				{
					max = map.get(a[i]);
					maxEle = a[i];
				}
				
			}
		}
			
			
		return maxEle;
	}

}
