package com.selenium.trees;

public class BTreeMaximumElement {

	public static void main(String[] args) {
		BTree root = new BTree(1);
		root.setLeft(new BTree(2));
		root.setRight(new BTree(3));
		root.getLeft().setLeft(new BTree(4));
		root.getLeft().setRight(new BTree(5));
		root.getRight().setLeft(new BTree(6));
		root.getRight().setRight(new BTree(7));

		System.out.println("The maximum element in the binary tree is: "
				+ maxElement(root));
		
		System.out.println("The minimum element in the binary tree is: "+minElement(root));
	}

	private static int minElement(BTree root) {
		int root_val,left,right, min= 10000;
		if(root!=null)
		{
			root_val = root.data;
			left = minElement(root.getLeft());
			right = minElement(root.getRight());
			if(left<right)
				min=right;
			else
				min=left;
			if(root_val<=min)
				min=root_val;
		}
		
		return min;
	}

	private static int maxElement(BTree root) {

		int root_val,left, right, max=0;
		if (root != null) {
			root_val = root.data;
			left = maxElement(root.getLeft());
			right = maxElement(root.getRight());
			if (left > right)
				max = left;
			else
				max = right;
			if(root_val>max)
				max= root_val;
		}

		return max;
	}
	
	

}
