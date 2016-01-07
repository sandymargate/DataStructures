package com.selenium.strings;

public class StringSameOrder {

	public static void main(String[] args)
	{
		String text = "asjkhaaskjhjkASJAKJWOEIOWPUOIERURUWIONzbNBXBZBXZMXC";
		String sampleOrder = "aAWORIRUR12";
	   Boolean isSequenced = stringSameOrder(text, sampleOrder);
	   if(isSequenced)
	   {
		   System.out.println("The string is sequenced properly");
	   }
	   else
	   {
		   System.out.println("The string is not sequenced properly");
	   }
	   
	}

	private static Boolean stringSameOrder(String text, String sampleOrder) {
		
		char[] t1 = text.toCharArray();
		char[] p1 = sampleOrder.toCharArray();
		boolean isSequenced= false;
		
		int i=0, j=0;
		while(i<t1.length && j< p1.length)
		{
			if(t1[i]==p1[j])
			{
				i++;
				j++;
			}
			else
			{
				i++;
			}
		}
		
		if(j==p1.length)
		{
			isSequenced = true;
		}
		
		return isSequenced;
	}
}
