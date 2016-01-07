package com.selenium.linkedlists;

public class LinkedListReverse {
	
	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);

		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);

		for (int i = 3; i <= 9; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
		}
		
		
		reverseLinkedList(head);
	}

	private static void reverseLinkedList(ListNode head) {
		
		ListNode temp=null, nextNode = null;
		while(head!=null)
		{
			nextNode = head.next;
			head.setNext(temp);
			temp = head;
			head = nextNode;
		}
		
		System.out.println("The reverse list is");
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
		
		
	}

}
