package com.selenium.sorting;

public class CountSort {
   
    public static void main(String[] args){
        int[] A ={1,5,2,3,4,2,3,4,1,0,5,2,4,3,5};
        int[] B = counting_sort(A,5);
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }
    }

	private static int[] counting_sort(int[] a, int max) {
		
		int[] b = new int[max+1];
		int[] c = new int[a.length];
		for(int i = 0; i< b.length; i++)
		{
			b[i] = 0;
		}
		
		for(int i= 1; i<=max; i++)
		{
			b[i]= b[i]+b[i-1];
		}
		
		for(int i= a.length-1; i>=0; i--)
		{
			c[b[a[i]]-1]=a[i];
            b[a[i]]-=1;
		}
		
		return null;
	}
   
  
    
}