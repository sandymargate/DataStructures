package com.selenium.linkedlists;

public class linkedListTraverse {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);

		// Adding elements
		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);

		for (int i = 3; i <= 9; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
		}
		temp1.setNext(null);

		// Time complexity: O(n)
		// Space complexity: O(1)
		// Traversing the elements
		System.out.println("The traversing elemnets are: ");
		ListNode temp = head;
		int i = 0;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
			i++;
		}
		System.out.println("The length of the linked list:" + i);

		// Printing odd number elements
		// Time complexity: O(n)
		// Space complexity: O(1)
		/*System.out.println("The odd position elements are:");
		temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			if (temp.getNext() != null)
				temp = temp.getNext().getNext();
			else
				temp = temp.getNext();
		}

		// Printing even number elements
		// Time complexity: O(n)
		// Space complexity: O(1)
		System.out.println("The even position elements are:");
		temp = head.getNext();
		while (temp != null) {
			System.out.println(temp.getData());
			if (temp.getNext() != null)
				temp = temp.getNext().getNext();
			else
				temp = temp.getNext();
		}

		// Reverse the elements
		System.out.println("The reverse elements are:");
		reverseElements(head);

		// Finding nth element from the starting point
		// Time complexity: O(n)
		// Space complexity: O(1)
		temp = head;
		int pos = 7;
		System.out.println("The element at the position " + pos + "is:");
		while (pos > 1 && temp != null) {
			temp = temp.getNext();
			pos--;
		}
		System.out.println(temp.getData());

		// Finding nth element from the end point
		// Time complexity: O(n)
		// Space complexity: O(1)
		temp = head;
		pos = 8;
		System.out.println("The elemnets are the position " + pos
				+ "from the end is: ");
		int iterate = i - pos;
		while (iterate > 0 && temp.getNext() != null) {
			temp = temp.getNext();
			iterate--;
		}
		System.out.println(temp.getData());

		// Inserting element at the given position
		// Time Complexity: O(n)
		// Space complexity: O(1)
		pos = 4;
		ListNode insertNode = new ListNode(9);
		//insertNode(pos, insertNode, head);

		// Deleting the element at the given position
		// Time complexity: O(n)
		// Space complexity: O(1)
		pos = 8;
		//deleteNode(pos, head);

		// Insert elements at the sorted list
		// Time complexity: O(n)
		// Space complexity: O(1)
		//insertSortNode(insertNode, head);

		// Middle in the list elements
		// Time complexity: O(n)
		// Space complexity: O(1)
		int middleEle = i / 2;
		temp = head;
		while (middleEle > 0) {
			temp = temp.getNext();
			middleEle--;

		}
		System.out.println("The middle element in the linked list: "
				+ temp.getData()); */

		// Reverse linked list

		// Sorting adjust elements
		sortAdjacentEle(head);

	}


	private static void sortAdjacentEle(ListNode head) {
		// TODO Auto-generated method stub
		
	}


	private static void insertSortNode(ListNode insertNode, ListNode head) {

		ListNode temp = head;
		ListNode temp2 = null;
		if (head.getData() >= insertNode.getData()) {
			insertNode.setNext(head);
			head = insertNode;
		} else {
			while (temp.getData() < insertNode.getData()
					&& temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp2 = temp.getNext();
			temp.setNext(insertNode);
			insertNode.setNext(temp2);
		}

		System.out.println("The Inserted sorted node list is:");
		temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}

	}

	private static void deleteNode(int pos, ListNode head) {

		if (pos == 1) {
			head = head.getNext();
		}

		else {
			ListNode temp = head;
			ListNode temp1 = null;
			int count = 1;
			while (count < pos - 1) {
				temp = temp.getNext();
				count++;
			}
			temp1 = temp.getNext().getNext();
			temp.setNext(temp1);

		}
		System.out.println("The Deleted node list is:");
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();

		}
	}

	private static void reverseElements(ListNode head) {

		if (head == null)
			return;
		reverseElements(head.getNext());
		System.out.println(head.getData());

	}

	private static void insertNode(int pos, ListNode insertNode, ListNode head) {
		if (pos == 1) {
			insertNode.setNext(head);
			head = insertNode;
		}

		else {
			int count = 1;
			ListNode temp1 = head;
			while (count < pos - 1) {
				temp1 = temp1.getNext();
				count++;
			}
			ListNode temp2 = temp1.getNext();
			temp1.setNext(insertNode);
			insertNode.setNext(temp2);
		}

		System.out.println("The inserted node list is:");
		ListNode temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}

	}

}
