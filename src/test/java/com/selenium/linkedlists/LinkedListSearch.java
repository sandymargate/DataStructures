package com.selenium.linkedlists;

public class LinkedListSearch {

	// Time complexity: O(n)
	// Space complexity: O(1)

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);

		for (int i = 3; i <= 9; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
		}

		searchList(head, 9);

	}

	private static void searchList(ListNode head, int search) {

		int pos = 1;
		while (head != null) {
			if (search == head.getData()) {
				System.out.println("The search element is found at " + pos
						+ " position");
				break;
			} else {
				head = head.next;
				pos++;

			}
		}

	}

}
