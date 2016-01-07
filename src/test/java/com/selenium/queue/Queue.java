package com.selenium.queue;

public class Queue {

	public int top = -1;
	public int rear = 0;
	public int[] arr;
	public int capacity;

	public Queue(int capacity) {
		arr = new int[capacity];
		top = -1;
		rear = 0;
		this.capacity = capacity;
	}

	public boolean isQueueFull() {
		if (top == capacity - 1)
			return true;
		else
			return false;

	}

	public boolean isQueueEmpty() {
		if (rear == top + 1)
			return true;
		else
			return false;
	}

	public void push(int val) {
		if (isQueueFull())
			System.out.println("The element can't be inserted!!");
		else
			arr[++top] = val;
	}

	public int pop() {
		int val = 0;
		if (isQueueEmpty())
			return 0;
		else {
			val = arr[rear];
			rear++;
		}
		return val;
	}
}
