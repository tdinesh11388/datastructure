package com.dn.BinaryTree;

public class Demo {

	public static void main(String[] args)
	{
		BinaryTreeSearch b=new BinaryTreeSearch();
		
		b.add(50);
		b.add(30);
		b.add(70);
		b.add(10);
		b.add(40);
		b.add(60);
		b.add(80);
		
		b.levelOrder();
		System.out.println("");
		//b.preOrderTraverse();
		//b.postOrderTraverse();
		//b.InOrderTraverse();
	}

}
