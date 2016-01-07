package com.selenium.arrays;

public class ArrayPatternSwap {
	
	public static void main(String[] args)
	{
		int [] a = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("The pattern matched elements are:");
		//a= patternSwap(a);
		a = chunk3(a);
		for(int i=0; i<a.length; i++)
         System.out.print(a[i]+ " ");
	}

	private static int[] chunk3(int[] a) {
		int temp;
		for(int i=0; i<a.length-2; i++)
		{
		   temp = a[i];
			a[i] = a[i+2];
			a[i+2]= temp;
			i=i+2;
		}

		
		return a;
	}

	private static int[] patternSwap(int[] a) {
		
		int temp =0;
		for(int i=1; i<a.length-1; i++)
		{
			temp = a[i];
			a[i]= a[i+1];
			a[i+1] = temp;
			i++;
		}
		
		
		return a;
	}

}
