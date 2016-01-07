package com.selenium.arrays;

public class ArrayAverageIntegers {
	
	public static void main(String[] args)
	{
		int [] a = {1,0,5,45,0,0,0,80};
		System.out.print("The average sum of integers are: ");
		averageIntegers(a);
	}

	private static void averageIntegers(int[] a) {
		
		int sum = 0;
		for(int i=0; i<a.length; i++)
			sum = sum+a[i];
		sum = sum/2;
		
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]>sum)
				System.out.print(" "+a[i]+" ");
		}
		
	}

}
