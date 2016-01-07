package com.selenium.arrays;

public class ArrayMaxSumWithoutAdjacents {
	
	public static void main(String[] args)
	{
		int a[] = {10,3,2,5,11,22,45};
		System.out.println("The maximum sum of the elements in the array without adjacent are");
		maxSumwithoutAdjacents(a);
	}

	
	//TIme complexity: O(n2)
	//Space complexity: O(1)
	private static void maxSumwithoutAdjacents(int[] a) {
		int min=0,max=0, sum =0;
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+2; j<a.length;j++)
			{
				if(sum<(a[i]+a[j]))
				{
					sum = a[i]+a[j];
					min=i;
					max=j;
				}
			}
		}
		
		System.out.print("Sum ="+ sum+ " elements are: "+ a[min]+", "+a[max]);
		
	}

}
