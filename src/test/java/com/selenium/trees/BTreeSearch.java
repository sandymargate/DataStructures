package com.selenium.trees;

public class BTreeSearch {
	
	public static void main(String[] args)
	{
		BTree root = new BTree(1);
		root.setLeft(new BTree(2));
		root.setRight(new BTree(3));
		root.getLeft().setLeft(new BTree(4));
		root.getLeft().setRight(new BTree(5));
		root.getRight().setLeft(new BTree(6));
		root.getRight().setRight(new BTree(7));
		
		if(searchElement(root, 9))
		{
			System.out.println("The element is found");
		}
		else
		{
			System.out.println("The element is not found");
		}
		
	}

	private static boolean searchElement(BTree root, int searchEle) {
		
		boolean temp = false;
		if(root!=null)
		{
			if(root.data==searchEle)
				return true;
			else
				temp = searchElement(root.getLeft(), searchEle);
			if(temp)
			    return true;
			else
				temp = searchElement(root.getRight(), searchEle);
		}
		return temp;
	}

}
