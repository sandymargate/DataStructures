package com.selenium.sorting;

public class MergeSort {

	public static void main(String[] args) {
		int a[] = { 0, -1, 4, -6, 8, 1, 4, 2, -5, 8 };
		doMerge(a, 0, a.length - 1);
		
		for(int i=0; i< a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

	private static void doMerge(int[] a, int left, int right)
	{
        int mid;	
		if (right > left) {		
			mid = (left+right)/2;
			doMerge(a, left, mid);
			doMerge(a, mid+1, right);
			sort(a, left, mid+1, right);
		}

	}

	private static void sort(int[] a, int left, int mid, int right) {
		
		int left_end = mid-1;
		int temp_pos = left;
		int size =  right - left + 1;
		int temp[] = new int[a.length];
		
		while(left<=left_end && mid<=right)
		{
			if(a[left]<=a[mid])
			{
				temp[temp_pos]= a[left];
				left++;
				temp_pos++;
			}
			
			else
			{
				temp[temp_pos]= a[mid];
				mid++;
				temp_pos++;
			}
		}
		
		while(left<=left_end)
		{
			temp[temp_pos]= a[left];
			left++;
			temp_pos++;
		}
		
		while(mid<=right)
		{
			temp[temp_pos]= a[mid];
			mid++;
			temp_pos++;
		}
		
		for(int i =0; i<size; i++)
		{
			a[right] = temp[right];
			right--;
		}
		
	}
}