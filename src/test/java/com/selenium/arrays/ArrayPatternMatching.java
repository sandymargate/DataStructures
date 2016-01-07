package com.selenium.arrays;

public class ArrayPatternMatching {
	
	public static void main(String[] args)
	{
		int [] a = {0,0,3,0,3,0,0,4,0,0,3};
		System.out.println("The re arranged array is:");
		a = rearrangedArray(a);
		for(int i=0; i<a.length; i++)
			System.out.print(a[i]);
	}

	private static int[] rearrangedArray(int[] a) {
		
		int k=0,i = 0;
		while(i<a.length-3)
		{
			if(a[i]==0 && a[i+1]==0 && a[i+2]==3)
			{
				a[k+2]=a[i+3];
				 i= i+1;
			}
			else
			{
				i++;
				k=i;
			}
		}
		return a;
	}

}
