package com.selenium.linkedlists;

public class LinkedListAlternateDeletion {
	
	public static void main(String[] args)
	{
		ListNode head = new ListNode(1);
		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);
		for (int i = 3; i <= 4; i++) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
		}
		
		head = linkedListAlternateDeletion(head);
		System.out.println("The Alternate deletion list is");
		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

		

	}

	private static ListNode linkedListAlternateDeletion(ListNode head) {
		
		ListNode temp = head;
		while(temp.next!=null && temp.next.next!=null)
		{
			temp.next = temp.next.next;
			temp = temp.next;
		}
		
		if(temp.next!=null)
		{
			temp.next=null;
		}
		
		return head;
	}

}
