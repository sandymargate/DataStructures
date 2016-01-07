package com.selenium.linkedlists;

// Time complexity: O(n)
// Space complexity: O(n)
public class LinkedListSortedDeletion {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);

		for (int i = 2; i <= 6; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
		}

		ListNode temp2 = new ListNode(6);
		temp1.setNext(temp2);
		temp2 = new ListNode(7);
		temp2.setNext(temp2);

		head = sortedDeletion(head);

		System.out.println("The sorted list is");
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}

	private static ListNode sortedDeletion(ListNode head) {

		ListNode temp = head, nextNode = head.next;
		while (temp != null && nextNode != null) {
			if (temp.data == nextNode.data) {
				temp.next = nextNode.next;
				temp = temp.next;
				if (temp != null) {
					nextNode = temp.next;
				}
			} else {
				nextNode = nextNode.next;
				temp = temp.next;
			}
		}

		return head;
	}

}
