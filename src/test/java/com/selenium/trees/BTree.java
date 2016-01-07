package com.selenium.trees;

public class BTree {

	public int data;
	public BTree left;
	public BTree right;

	public int getData() {
		return this.data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public void setLeft(BTree left) {
		this.left = left;
	}

	public BTree getLeft() {
		return this.left;
	}

	public BTree getRight() {
		return this.right;
	}

	public void setRight(BTree right) {
		this.right = right;
	}
	
	public BTree(int data)
	{
		this.data = data;
	}

}
