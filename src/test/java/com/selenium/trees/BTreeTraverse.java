package com.selenium.trees;

public class BTreeTraverse {

	public static void main(String[] args) {
		BTree root = new BTree(1);
		root.setLeft(new BTree(2));
		root.setRight(new BTree(3));
		root.getLeft().setLeft(new BTree(4));
		root.getLeft().setRight(new BTree(5));
		root.getRight().setLeft(new BTree(6));
		root.getRight().setRight(new BTree(7));

		System.out.println("The pre oder traversal is:");
		preOrderTraversal(root);

		System.out.println("The in oder traversal is:");
		inOrderTraversal(root);
		
		System.out.println("The post order traversal is:");
		postOrderTraversal(root);
		
	}


	private static void postOrderTraversal(BTree root) {
		
		if(root==null)
			return;
		else
		{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data);
		}
		
	}

	private static void inOrderTraversal(BTree root) {

		if (root == null)
			return;
		else {
			inOrderTraversal(root.left);
			System.out.print(root.data);
			inOrderTraversal(root.right);
		}
	}

	private static void preOrderTraversal(BTree root) {

		if (root == null)
			return;
		else {
			System.out.print(root.data);
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}

	}
}
