package com.selenium.arrays;

public class SegregateEvenAndOddNum {
	
	public static void main(String[] args)
	{
		int a[] = {1,2,4,5,3,7,8,9,0,2,3};
		int b[] = segregateEvenAndOddNum(a);
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
	}

	private static int[] segregateEvenAndOddNum(int[] a) {
		
		int c[] = new int[a.length];
		int odd[] = new int[a.length];
		
		int k=0,j=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				c[k]=a[i];
				k++;
			}
			
			else
			{
				odd[j]=a[i];
				j++;
			}
		}
		
		j=0;
		if(k!=a.length)
		{
			while(k<a.length)
			{
				c[k]= odd[j];
				k++;
				j++;
			}
		}
		
		return c;
	}

}
