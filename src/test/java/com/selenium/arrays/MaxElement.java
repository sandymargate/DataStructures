package com.selenium.arrays;

public class MaxElement {
	
	public static void main(String[] args)
	{
		int[] a = {10, 0, -10, -3, 0, -80, -20, 10, 4000, 2000};
		int min = a[0];
		int max = a[a.length-1];
		
		if(min>max)
		{
			max = a[0];
			min = a[a.length-1];
		}
		
		int left =1;
		int right = a.length-2;
		while(left<=right)
		{
			if(a[left]>max && a[left]>a[right])
			{
				max=a[left];
			}
			else if(a[right]>max)
			{
				max=a[right];
			}
			
			if(a[left]<min)
			{
				min = a[left];
			}
			else if(a[right]<min)
			{
				min=a[right];
			}
			
			left++;
			right--;
		}
		
		 System.out.println("The smallest value in the array is "+ min);
		 System.out.println("The second smallest value in the array is "+ max);
		 System.out.println("The maximum difference between two values "+ (max - min));
	}

}
