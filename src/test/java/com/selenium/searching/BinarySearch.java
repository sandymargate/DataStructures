package com.selenium.searching;

public class BinarySearch {
	
	public static void main(String[] args)
	{		
		int [] a = {-10, -9, -8, -7, -6, -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	    int elementPresent = aBinarySearch(a, 5);
	    if(elementPresent == -1)
	    {
	    	System.out.println("The element is not present");
	    }
	    else
	    {
	    	System.out.println("The element is present at the index " + (elementPresent + 1));
	    }
		
	}

	private static int aBinarySearch(int[] a, int searchIndex) {
		
		int left = 0;
		int right = a.length -1;
		int mid = (left+right)/2;
		int eleIndex = -1;
		
		while(left <= right)
		{
			if(a[mid]< searchIndex)
				left = mid+1;
			else if (a[mid]> searchIndex)
				right = mid-1;
			else
			{
				eleIndex = mid;
			    break;
			}
			
			mid = (left+right)/2;
		}
		
		return eleIndex;
		
	}
}