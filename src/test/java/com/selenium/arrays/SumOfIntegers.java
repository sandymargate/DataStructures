package com.selenium.arrays;

public class SumOfIntegers {

	public static void main(String[] args)
	{
		long sum = 0;
		int a[] = {2,12,12};
		for(int i=1; i<=a[0]; i++)
		{
			sum = sum+ a[i];
		}
		
		System.out.println(sum);
	}
}
