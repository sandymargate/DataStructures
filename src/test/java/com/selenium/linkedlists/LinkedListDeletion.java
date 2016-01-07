package com.selenium.linkedlists;

public class LinkedListDeletion {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp1 = new ListNode(0);
		head.setNext(temp1);

		for (int i = 0; i <= 5; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
		}

		head = linkedListDeletion(head);
		System.out.println("The sorted list is");
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}

	// Time complexity: O(n^2)
	// Space complexity: O(2)
	private static ListNode linkedListDeletion(ListNode head) {

		ListNode temp = head, nextNode = null, prevNode = null;

		while (temp.next != null) {

			nextNode = temp.next;
			prevNode = temp;

			while (nextNode != null) {

				if (temp.data == nextNode.data) {
					prevNode.next = nextNode.next;
					nextNode = nextNode.next;
				}

				else {
					prevNode = prevNode.next;
					nextNode = nextNode.next;
				}
			}

			temp = temp.next;

		}

		return head;
	}

}
