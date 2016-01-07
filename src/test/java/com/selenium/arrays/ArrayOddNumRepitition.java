package com.selenium.arrays;

import java.util.HashMap;

public class ArrayOddNumRepitition {
	
	public static void main(String[] args)
	{
		int [] a = {11,4,3,2,11,9,11,9,2,9,11};
		System.out.println("The repetited oddnum times elements are:");
		oddNumRepeatedElements(a);
	}

	private static void oddNumRepeatedElements(int[] a) {
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<a.length; i++)
		{
			if(map.containsKey(a[i]))
			{
				if(map.get(a[i])%2==0 && map.get(a[i])>1){
					
					System.out.print(a[i]+ " ");
					map.put(a[i],map.get(a[i])+1);
				}
				else
					map.put(a[i],map.get(a[i])+1);
			}
			else
			{
				map.put(a[i],1);
			}
			
		}
		
	}

}
