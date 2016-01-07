package com.selenium.sorting;

public class InsertionSort 
{
	public static void main(String[] args)
	{
		int a[] = { 0, -1, 4, -6, 8, 1, 4, 2, -5, 8 };
		
		for(int i=1; i< a.length-1; i++)
		{
			int val = a[i];
			int j= i-1;
			
			while(j>=0 && a[j]>val)
			{
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = val;
		}
		
		for(int i=0; i< a.length; i++)
		{
			System.out.println(a[i]);
		}

		
	}
}