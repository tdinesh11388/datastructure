package com.dn.Queue;

public class Queue 
{
	Node first=null;
	int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object poll()
	{
		if(first==null)return null;
		Object curr=first.ele;
		first=first.next;
		count--;
		return curr;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	
	public Object peek()
	{
		if(first==null)return null;
		return first.ele;
	}
}
