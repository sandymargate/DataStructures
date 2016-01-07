package com.selenium.arrays;

public class MergeArrays {
	
	public static void main(String[] args)
	{
		int a[] = {2,3,4};
		int b[] = new int[5];
		
		//Initializing values
		b[0]= 5;
		b[3]= 7;
		
		merge(a,b);
	}

	private static void merge(int[] a, int[] b) {
		
		int i=0;
		int j=0;
		while(i<a.length || j< b.length)
		{
			if(b[j]==0)
			{
				b[j]=a[i];
				i++;
			}
			
			j++;
		}
		
		for(int k=0; k<b.length; k++)
		{
			System.out.print(b[k]);
		}
	}

}
