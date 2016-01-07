package com.selenium.stacks;

public class SAStack {

	public int top;
	public int capacity;
	public String[] arr;

	public SAStack(int capacity) {
		top = -1;
		this.capacity = capacity;
		arr = new String[this.capacity];
	}

	public boolean isStackFull() {
		if (top == arr.length)
			return true;
		else
			return false;
	}

	public boolean isStackEmpty() {
		if (top == -1)
			return true;
		else
			return false;
	}

	public void push(String value) {
		if (isStackFull())
			System.out.println("The stack is full!!!");
		else {
			arr[++top] = value;
		}
	}

	public String pop() {
		if (isStackEmpty())
		 return	  null;
		else
			return arr[top--];

	}

}
