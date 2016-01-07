package com.selenium.sorting;

public class SelectionSort {

	public static void main(String[] args)
	{
		int [] a = {1000, -40000, -600000, 0, -10000};
		
		for(int i= 0; i< a.length-1; i++)
		{
			int min = a[i];
			int row = i;
			
			for(int j=i+1; j<a.length; j++)
			{
				if(a[j]<min)
				{
					min = a[j];
				   row = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[row];
			a[row]= temp;
		}
		
		for(int i=0; i< a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
	
}
