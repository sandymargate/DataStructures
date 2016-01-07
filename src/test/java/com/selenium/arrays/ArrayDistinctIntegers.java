package com.selenium.arrays;

public class ArrayDistinctIntegers {

	public static void main(String[] args)
	{
		int[] a = {0,1,4,3,5,2,6,9,11,13,10};
		System.out.println("The Distinct elements in the integer: ");
		distinctIntegers(a);
	}

	private static void distinctIntegers(int[] a) {
		
		for(int i=0; i<a.length;i++)
		{
			if(a[i]==i)
				System.out.print(a[i]+ " ");
		}
		
	}
}
