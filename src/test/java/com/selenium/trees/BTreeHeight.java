package com.selenium.trees;

public class BTreeHeight {

	public static void main(String[] args)
	{
		BTree root = new BTree(1);
		root.setLeft(new BTree(2));
		root.setRight(new BTree(3));
		root.getLeft().setLeft(new BTree(4));
		root.getLeft().setRight(new BTree(5));
		root.getRight().setLeft(new BTree(6));
		root.getRight().setRight(new BTree(7));
		
		System.out.println("The height of the tree is: "+ treeHeight(root));
	}

	private static int treeHeight(BTree root) {

		int left, right;
		if(root!=null)
		{
			left = treeHeight(root.getLeft());
			right = treeHeight(root.getRight());
			if(left>right)
			return (left+1);
			else
				return (right+1);
		}
		else
			return 0;
			}
}
