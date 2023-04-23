package LinkedList;

public class LinkedList5
{
	 Node first=null;
	 Node last=null;
	 int count=0;
	
	public  void add(int key)
	{
		if(first==null)
		{
			first=new Node(key,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(key,null);
		last=last.next;
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public void add(int index,int key)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first=new Node(key,first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node(key,curr.next);
		count++;
	}
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first=first.next;
			count--;
			return;
		}
		Node curr=first;
		for(int i=1;i<size();i++)
		{
			curr=curr.next;
		}
		curr=curr.next;
		count--;
	}
	public void reverse()
	{
		Node prev=null;
		Node curr=first;
		Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}
