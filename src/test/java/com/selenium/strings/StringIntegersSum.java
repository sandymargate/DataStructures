package com.selenium.strings;

public class StringIntegersSum {
	
	public static void main(String[] args)
	{
		String str = "ABC123DFGT1356GHKNKH13367";
		long sum = integersSum(str);
		System.out.println("The sum of the integers in the string is:"+ sum);
	}

	private static long integersSum(String str) {
		
		int sum = 0,i=0,j=0;
		while(i<str.length())
		{
			if(!Character.isDigit(str.charAt(i)))
				i++;
			
			else
			{
				j=i;
				while(i<str.length()&&Character.isDigit(str.charAt(i)))
					i++;
				sum = sum+ Integer.valueOf(str.substring(j, i));
			}
		}
		
		
		return sum;
	}
	
	

}
