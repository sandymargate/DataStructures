package com.selenium.arrays;

public class ArrayRunningAverage {
	
	public static void main(String[] args)
	{
		int [] a = {2,4,6,8,10,12};
		System.out.println("The average of the elements in the array are:");
		a = runningAverage(a);
		for(int i=0; i<a.length; i++)
	         System.out.print(a[i]+ " ");
	}

	private static int[] runningAverage(int[] a) {
		
		int temp[] = new int[a.length];
		temp[0]= a[0];
		int sum = a[0];
		
		for(int i=1; i<a.length;i++)
		{
			sum = sum+a[i];
			temp[i]= sum/(i+1);
		}
		
		return temp;
	}

}
