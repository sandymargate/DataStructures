package com.selenium.linkedlists;

public class ListNode {

	int data;
	ListNode next;

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setNext(ListNode next) {
		this.next = next;
	}

	public ListNode getNext() {
		return this.next;
	}
	
	public ListNode(int data)
	{
		this.data = data;
	}

	public ListNode() {
	}
}