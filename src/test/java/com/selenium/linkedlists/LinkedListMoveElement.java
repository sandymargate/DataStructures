package com.selenium.linkedlists;

public class LinkedListMoveElement {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);
		int count = 2;
		for (int i = 3; i <= 7; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
			count++;
		}

		head = linkedListMoveElement(head, 5, count);
		System.out.println("The rotated list is");
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	// Time complexity: O(n)
	// Space complexity: O(3)
	private static ListNode linkedListMoveElement(ListNode head, int pos,
			int count) {

		ListNode temp = head, temp2 = null, temp3 = null;
		int counter = count - pos;
		while (counter > 1) {
			temp = temp.next;
			counter--;
		}

		temp2 = temp.next;
		temp.next = null;
		temp3 = temp2;
		while (temp2.next != null) {
			temp2 = temp2.next;
		}

		temp2.setNext(head);

		return temp3;
	}
}
