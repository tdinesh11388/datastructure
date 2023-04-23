package com.dn.TreeSet;

public class HashSet
{
	Node []a=new Node[10];
	int count=0;
	public boolean add(int key)
	{
		int index=key%10;
		if(a[index]==null)
		{
			a[index]=new Node(key,null);
			count++;
			return true;
		}
		Node curr=a[index];
		Node prev=null;
		while(curr!=null)
		{
			if(curr.key==key)return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(key,null);
		count++;
		return true;
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node curr=a[i];
			while(curr!=null)
			{
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
		}
	}
}
