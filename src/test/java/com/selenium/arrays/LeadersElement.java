package com.selenium.arrays;

public class LeadersElement {
	
	//Time complexity: O(n2)
	
	public static void main(String[] args)
	{
		int a[] = {9,4,3,2,1,8,0,-1};
		leaderElements(a);
	}

	private static void leaderElements(int[] a) {
		
		for(int i=0; i<a.length-1; i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
					break;
				
				if(j==a.length-1)
					System.out.println(a[i]);
			}
		}
		
	}

}
