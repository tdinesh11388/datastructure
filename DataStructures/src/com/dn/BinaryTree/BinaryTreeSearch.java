package com.dn.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeSearch
{
	private Node root=null;
	private int count=0;
	
	public  boolean add(int k)
	{
		root=addNode(root,k);
		return true;
	}
	public Node addNode(Node n,int k)
	{
		if(n==null)
		{
			n=new Node(k);
			count++;
			return n;
		}
		if(k<n.key)
		{
			n.left=addNode(n.left,k);
		}
		else if(k>n.key)
		{
			n.right=addNode(n.right,k);
		}
		return n;
	}
	public void levelOrder()
	{
		Queue<Node>q=new LinkedList<Node>();
		if(root!=null)q.add(root);
		while(!(q.isEmpty()))
		{
			Node n=q.poll();
			System.out.print(n.key+" ");
			if(n.left!=null)q.add(n.left);
			if(n.right!=null)q.add(n.right);
		}
	}
	public void preOrderTraverse()
	{
		preOrder(root);
		System.out.println();
	}
	public void preOrder(Node n)
	{
		if(n==null)return;
		System.out.print(n.key+" ");
		preOrder(n.left);
		preOrder(n.right);
	}
	public void postOrderTraverse()
	{
		postOrder(root);
		System.out.println();
	}
	public void postOrder(Node n)
	{
		if(n==null)return;
		postOrder(n.left);
		postOrder(n.right);
		System.out.print(n.key+" ");
	}
	public void InOrderTraverse()
	{
		InOrder(root);
	}
	public void InOrder(Node n)
	{
		if(n==null)return;
		InOrder(n.left);
		System.out.print(n.key+" ");
		InOrder(n.right);
	}
}
