package com.selenium.arrays;

public class ArrayMaximumDifference {
	
	public static void main(String[] s)
	{
		int[] a = {2,1,4,0,6,5,3,10};
		System.out.println("The maximum difference in the array with condition j>i is:");
		maximumDifference(a);
	}

	//Time complexity: O(n)
	//Space complexity: O(1)
	private static void maximumDifference(int[] a) {
		
		int min = a[0];
		int diff = 0;
		int max_diff = 0, num1 = -1, num = -1;
		for(int i=1; i< a.length; i++)
		{
			if(a[i]<min)
				min = a[i];
			else
			{
				diff = a[i]- min;
				if(diff>max_diff)
				{
					max_diff = diff;
					num1 = min;
					num = a[i];
				}
			}
		}
		
		System.out.print(num1+ " , "+ num);
		
		
	}

}
