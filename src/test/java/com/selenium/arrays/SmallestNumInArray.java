package com.selenium.arrays;

public class SmallestNumInArray {
	
	//Time complexity: O(n)
	//Space complexity: O(2)
	public static void main(String[] args)
	{
		int a[] = {1,-4,0, -1, 2,-2,4,-5};
		
		int min_val1 = a[0];
    	int min_val2 = a[1];
    	
	    if(a[0]>a[1])
	    {
	    	 min_val1 = a[1];
	    	 min_val2 = a[0];
	    }
	
	    for(int i=2; i< a.length; i++)
	    {
	    	if(a[i]<min_val2)
	    	{
	    		if(a[i]<min_val1)
	    		{
	    			min_val2 = min_val1;
	    			min_val1 = a[i];
	    		}
	    		else
	    		{
	    			min_val2 = a[i];
	    		}
	    		
	    	}
	    }
	    
	    System.out.println("The smallest value in the array is "+ min_val1);
	    System.out.println("The second smallest value in the array is "+ min_val2);
	}

}
