package com.selenium.arrays;

public class ArrayRotation {
	
	//Time complexity: O(n)
	//Space complexity: O(n) - Worst case
	
	public static void main(String[] args)
	{
		int a[] = {1,2,3,4,5,6,7,8,9};
		a = rotateArray(a,5);
		
		for(int i=0; i< a.length; i++)
		{
			System.out.println(a[i]);
		}
	}

	private static int[] rotateArray(int[] a, int rotate) {
     
		int[] temp = new int[rotate];
		for(int i=0; i<temp.length; i++)
		{
			temp[i] = a[i];
		}
		
		int j=0,k=0;
		while(j< (a.length - temp.length))
		{
			a[k]=a[j+temp.length];
			k++;
			j++;
		}
		
		for(k=0;j<a.length; j++,k++)
		{
			a[j]= temp[k];
		}
		
		return a;
	}

}
