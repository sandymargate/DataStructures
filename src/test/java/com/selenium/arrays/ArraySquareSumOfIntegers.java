package com.selenium.arrays;

import java.util.HashMap;

public class ArraySquareSumOfIntegers {

	public static void main(String[] args)
	{
		int[] a = { 3,4,1,5,7,2,14,12,10,13};
		System.out.println("The perfect square indexes are:");
		squareSumOfIntegers(a);
	}

	private static void squareSumOfIntegers(int[] a) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		{
		    map.put(a[i]*a[i],a[i]);
			a[i]= a[i]*a[i];
		}
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(map.containsKey(a[i]+a[j]))
				{
					System.out.println(map.get(a[i])+","+map.get(a[j])+","+map.get(a[i]+a[j]));
				}
			}
		}
		
		
		
	}
}
