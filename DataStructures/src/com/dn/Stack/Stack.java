package com.dn.Stack;

public class Stack 
{
	Node first=null;
	int count=0;
	
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object pop()
	{
		if(first==null)return null;
		Object e=first.ele;
		first=first.next;
		return e;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
}
