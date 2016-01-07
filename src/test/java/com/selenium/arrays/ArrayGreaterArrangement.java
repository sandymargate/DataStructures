package com.selenium.arrays;

public class ArrayGreaterArrangement {

	public static void main(String[] args) {
		int[] a = { 1, -1, 0, 2, 3, 4, 5, -6 };
		System.out
				.println("The arranged array with less and greater elements are:");
		a = greaterArrangement(a, 2);
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	private static int[] greaterArrangement(int[] a, int num) {

		int[] temp = new int[a.length];
		int k = 0, j = a.length - 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < num) {
				temp[k] = a[i];
				k++;
			} else if(a[i]>num){
				temp[j] = a[i];
				j--;
			}
		}
		temp[j]=num;

		return temp;
	}

}
