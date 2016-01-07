package com.selenium.sorting;

public class QuickSort {
	
	public static void main(String[] args)
	{
	  
		int a[] = {1, -1, 0, -2, 3, 6, 2, -8, 0, -9, 9, 5};
		aQuickSort(a, 0, a.length-1);
		
		for(int i=0; i< a.length; i++)
		{
			System.out.println(a[i]);
		}
		
	}

	private static void aQuickSort(int[] a, int left, int right) {
		
		int pivot = a[left+ (right-left)/2];
		int i = left;
		int j = right;
		
		while(i<=j)
		{
		   while(a[i]< pivot)
		   {
			   i++;
		   }
		   
		   while(a[j]> pivot)
		   {
			   j--;
		   }
		   
		   if(i<=j)
		   {
			   int temp = a[i];
			   a[i] = a[j];
			   a[j] = temp;
			   i++;
			   j--;
		   }
		}
		
		if(j> left)
		{
			aQuickSort(a, left, j);
		}
		
		if(i< right)
		{
			aQuickSort(a, i, right);
		}
		
	}
}