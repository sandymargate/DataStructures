package com.selenium.arrays;

public class PrintNUm {

	public static void main(String[] args)
	{
		int num = 20;
		for(int i=1; i<=num; i++)
		{
			if(i%3==0)
			System.out.println("FUZZ");
			else if(i%5==0)
				System.out.println("FUZZBIZZ");
			else
				System.out.println(i);
		}
		
	}
}
