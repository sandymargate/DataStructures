package com.selenium.linkedlists;

public class LinkedListAlternateSplit {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);
		for (int i = 3; i <= 7; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
		}

		ListNode sub1 = linkedListAlternateSplit(head);
		System.out.println("The Sub array list1 is:");
		while (sub1 != null) {
			System.out.println(sub1.data);
			sub1 = sub1.next;
		}

		ListNode sub2 = linkedListAlternateSplit(head.next);
		System.out.println("The Sub array list1 is:");
		while (sub2 != null) {
			System.out.println(sub2.data);
			sub2 = sub2.next;
		}
	}

	private static ListNode linkedListAlternateSplit(ListNode head) {

		ListNode sublist = new ListNode();
		ListNode temp = head;
		while (temp.next != null && temp.next.next != null) {
			sublist.setData(temp.data);
			temp = temp.next;
		}
		if (temp.next != null) {
			temp.next = null;
		}

		return head;

	}

}
