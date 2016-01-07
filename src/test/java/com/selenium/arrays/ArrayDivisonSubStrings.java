package com.selenium.arrays;

public class ArrayDivisonSubStrings {
	
	public static void main(String[] args)
	{
		int[] a = {1,2,1,0};
		System.out.println("The substrings divided are: ");
		divisionSubStrings(a);
		
	}

	private static void divisionSubStrings(int[] a) {
		
		int sum = 0; int [] temp = new int[a.length/2];
		int j=0;
		for(int i=0; i< a.length; i++)
			sum = sum+a[i];
		    sum = sum/2;
		for(int i=0; i<a.length; i++)
		{
			if(sum>=a[i] && j<temp.length)
			{
				sum = sum -a[i];
				temp[j]= a[i];
				j++;
			}
			
			if(sum==0 && j==temp.length)
				break;				
			
		}
		
		if(j==temp.length && sum==0)
		{
		for(int i=0; i<temp.length; i++)
			System.out.print(temp[i]+",");
		}
		else
		{
			System.out.println("there are no equal substrings");
		}
	}

}
