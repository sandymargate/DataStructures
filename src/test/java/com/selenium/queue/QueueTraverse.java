package com.selenium.queue;

public class QueueTraverse {

	public static void main(String[] args) {
		int a[] = { 0, 1, 2, 3, 4, 5, 6, 7 };
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		Queue Q1 = new Queue(a.length);
		for (int i = 0; i < a.length; i++) {
			Q1.push(a[i]);
		}
         System.out.println("THe Queue results are: ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Q1.pop() + " ");
		}
	}

}
