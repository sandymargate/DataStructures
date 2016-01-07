package com.selenium.searching;

public class LinearSearch {
	
	public static void main(String[] args)
	{
		int [] a = {2,1,4,5,3,7,0, -1, -5};
	    int elementPresent = aLinearSearch(a, -1);
	    if(elementPresent == -1)
	    {
	    	System.out.println("The element is not present");
	    }
	    else
	    {
	    	System.out.println("The element is present at the index " + (elementPresent + 1));
	    }
		
	}

	private static int aLinearSearch(int[] a, int aSearch) 
	{
		int index = -1;
		for(int i=0; i< a.length; i++)
		{
			if(a[i]==aSearch)
			{
				index = i;
				break;
			}
		}
		
	    return index;
	}

}
