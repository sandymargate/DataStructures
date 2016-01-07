package com.selenium.linkedlists;

public class LinkedListPalindrome {
	
	//Time complexity: O(n)
	//Space complexity: O(n)

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode temp1 = new ListNode(2);
		head.setNext(temp1);
		int length = 2;
		for (int i = 6; i >= 1; i--) {
			ListNode temp2 = new ListNode(i);
			temp1.setNext(temp2);
			temp1 = temp2;
			length++;
		}

		linkedListPalindrome(head, length);

	}

	private static void linkedListPalindrome(ListNode head, int length) {

		ListNode temp = head, temp2 = null, nextNode = null;
		boolean ispalindrome = false;
		length = (length / 2);
		while (length > 0) {
			temp = temp.next;
			length--;
		}

		while (temp != null) {
			nextNode = temp.next;
			temp.setNext(temp2);
			temp2 = temp;
			temp = nextNode;
		}
		
		while(temp2!=null)
		{
			if(head.getData()==temp2.getData())
			{
				head = head.getNext();
				temp2 = temp2.getNext();
				ispalindrome = true;
				
			}
			else
			{
				ispalindrome = false;
				System.out.println("The list is not palindrome");
				break;
				
			}
		}
		
		if(ispalindrome)
		{
			System.out.println("The linked list is palindrome");
		}

	}

}
