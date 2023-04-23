package com.dn.TreeSet;

public class HashSetObject
{
	Node1 []a=new Node1[10];
	int count=0;
	public boolean add(Object key)
	{
		int index=key.hashCode()%10;
		if(a[index]==null)
		{
			a[index]=new Node1(key,null);
			count++;
			return true;
		}
		Node1 prev=null;
		Node1 curr=a[index];
		while(curr!=null)
		{
			if(key.equals(curr.key)) return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node1(key,null);
		count++;
		return true;
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node1 curr=a[i];
			while(curr!=null)
			{
				System.out.println(curr.key+" ");
				curr=curr.next;
			}
		}
	}
}
