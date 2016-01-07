package com.selenium.arrays;


public class ArrayMovingZerosToEnd {

	public static void main(String[] args) {
		int[] a = { 1, 0, 3, 2, 0, 4, 5, 0, 6, 0, 7, 0, 8, 0, 11, 0, 12 };
		System.out.println("The rearranged array after moving to the end is:");
        a = rearrangedArray(a);
		a = reArrangeArrayWithoutSpaces1(a);
		a = reArrangeArrayWithoutSpaces(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	//Time complexity: O(n)
	//Space complexity: O(n)
	private static int[] rearrangedArray(int[] a) {

		int temp[] = new int[a.length];
		int i = 0, j = 0;

		while (i < a.length && j < temp.length) {
			if (a[i] != 0) {
				temp[j] = a[i];
				j++;
			}
			i++;
		}

		return temp;
	}
	
	//Time complexity: O(n)
	//Space complexity: O(1)
	private static int[] reArrangeArrayWithoutSpaces1(int[] a){
		
		int i=a.length-1, j= a.length-1;
		while(i>=0)
		{
			if(a[i]!=0 && i!=j)
			{
				int temp = a[j];
				a[j] = a[i];
				a[i] = temp;
				j--;
			}
			
			if(a[i]!=0 && i==j)
			{
				i--;
				j--;
			}
			else if(a[i]==0)
				i--;
		}
		return a;
	}
	
	private static int[] reArrangeArrayWithoutSpaces(int[] a){
		
		int i=0, j=0;
		while(i<a.length)
		{
			if(a[i]!=0 && i!=j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				j++;
			}
			else if(a[i]!=0 && i==j)
			{
				i++;
				j++;
			}
				
			else if(a[i]==0)
				i++;
		}
		
		return a;
		
	}

}
