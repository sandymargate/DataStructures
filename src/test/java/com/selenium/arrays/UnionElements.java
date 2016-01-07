package com.selenium.arrays;

public class UnionElements {

	public static void main(String[] args) {
		int a[] = { 3, 4, 5, 6, 7 };
		int b[] = { 1, 4, 9, 11 };

		int c[] = unionElements(a, b);

		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}

	private static int[] unionElements(int[] a, int[] b) {
		
		int c[] = new int[(a.length+b.length)];
		int i=0,j=0,k=0;
		 
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				k++;
				i++;
			}
			
			else if(a[i]>b[j])
			{
				c[k]=b[j];
				k++;
				j++;
			}
			else
			{
				c[k]=a[i];
				i++;
				k++;
				j++;
			}
		}
		
		if(i!=a.length)
		{
			for(;i<a.length;i++)
			{
				c[k]=a[i];
				k++;
			}
		}
		
		if(j!=b.length)
		{
			for(;j<b.length; j++)
			{
				c[k]=b[j];
				k++;
			}
		}

		return c;
	}
}
