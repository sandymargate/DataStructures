package com.selenium.arrays;

public class MissingNumInArray {
	
	public static void main(String[] args)
	{
		int [] a = {1,3,5,7,10,12,15,17};
		missingNum(a);
	}

	private static void missingNum(int[] a) {
		
		int indexNum = a[1]-a[0];
		for(int i=1; i<a.length-1; i++)
		{
		  if((a[i+1]-a[i])!=indexNum)
		  {
			  System.out.println("The missing number is"+ (a[i]+indexNum));
		  }
			
		}
	}

}
