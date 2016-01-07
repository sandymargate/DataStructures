package com.selenium.arrays;

public class ArrayArrangementIntegers {

	public static void main(String[] args) {

		int[] a = { 2, 0, -1, 0, 5, 0, 0, -9, 1, 4, -5, 8, -3 };
		a = arrangeIntegers(a);
		System.out.print("The arranged integers are: ");
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	//Time complexity: O(n)
	//Space complexity: O(n)
	private static int[] arrangeIntegers(int[] a) {

		int i = 0, j = a.length - 1, k = 0;
		int[] temp = new int[a.length];

		while (k<a.length) {
			
			if(a[k]<0)
			{
				temp[i]= a[k];
				i++;
				k++;
			}
			
			else if(a[k]>0)
			{
				temp[j]= a[k];
				j--;
				k++;
			}
			
			else
			{
				k++;
			}

		}
		
		if(i!=j)
		{
			while(i!=j)
			{
				temp[i]=0;
				i++;
			}
		}

		return temp;
	}

}
