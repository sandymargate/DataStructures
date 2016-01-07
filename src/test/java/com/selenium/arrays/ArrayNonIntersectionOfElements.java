package com.selenium.arrays;

import java.util.HashMap;
import java.util.Set;

public class ArrayNonIntersectionOfElements {
	
	public static void main(String[] args)
	{
		int [] a = {2,7,4,8};
		int[] b = {4,9,1};
		System.out.println("The non intersection elements are:");
		nonIntersectionElements(a,b);
	}

	//Time complexity: O(n)
	//Space complexity: O(n)
	private static void nonIntersectionElements(int[] a, int[] b) {
		
     HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
     for(int i=0; i<a.length; i++)
    	 map.put(a[i], 1);
	
     for(int i=0; i<b.length;i++)
     {
    	 if(map.containsKey(b[i]))
    		 map.remove(b[i]);
     }
     
     Set<Integer> set = map.keySet();
     for(Integer num: set)
    	 System.out.print(num+ " ");
     
	}

}
