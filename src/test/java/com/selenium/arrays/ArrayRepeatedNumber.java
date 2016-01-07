package com.selenium.arrays;

public class ArrayRepeatedNumber {
	
	public static void main(String[] args)
	{
		int[] a = {2,1,5,6,3,6};
		repeatedAndMissingNumber(a);
	}

	private static void repeatedAndMissingNumber(int[] a) {
		
		int len = a.length;
		for(int i=0; i<a.length; i++)
		{
				int b = a[i]% 10;
				a[a[i] % len] += 10;
		}
			
		for(int i=0; i<a.length; i++)
		{
			if(a[i]/10==2)
				System.out.println("The repeated number is: "+ i);

				
		}
		
	}

}
