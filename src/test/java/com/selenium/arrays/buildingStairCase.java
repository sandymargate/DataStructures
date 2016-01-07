package com.selenium.arrays;

public class buildingStairCase {
	
	public static void main(String[] args)
	{
		for(int i=1; i<=100; i++)
		{
			int j=i;
			while(j>0)
			{
				System.out.print("*");
				j--;
			}
			
			System.out.println();
						
		}
	}

}
