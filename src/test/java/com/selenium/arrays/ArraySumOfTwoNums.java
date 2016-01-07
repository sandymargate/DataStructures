package com.selenium.arrays;

public class ArraySumOfTwoNums {
	
	public static void main(String[] args)
	{
		int [] a = {2,1,4,5,3,7,0, -1, -5};
		ArraySum(a,4);
	}

	private static void ArraySum(int[] a, int indexSum) {
	
		for(int i =0; i< a.length -1; i++)
		{
			for(int j=i+1; j< a.length; j++)
			{
				if(a[i]+ a[j]==indexSum)
				{
					System.out.println("The pair for having total sum "+ a[j]+ " "+ a[i]);
				}
			}
		}
		
	}

}
