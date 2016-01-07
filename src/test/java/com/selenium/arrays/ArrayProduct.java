package com.selenium.arrays;

public class ArrayProduct {
	
	public static void main(String[] args)
	{
		int [] a = {2,3,4,5,6};
		System.out.println("The division of product of numbers with the index number are: ");
		a = productMul(a);
		for(int i=0; i< a.length; i++)
			System.out.print(a[i]+ " ");
	}

	// Time complexity: O(n2)
	private static int[] productMul(int[] a) {

		int[] temp = new int[a.length];
		for(int i=0;i< a.length; i++)
		{
			int div = 1;
			for(int j=0; j<a.length; j++)
			{
				if(i!=j)
					div = div*a[j];
			}
			temp[i]= div; 
		}
		
		
		return temp;
	}
	
}
