package LinkedList;

public class LinkedListImplementation 
{
	NodeN first=null;
	NodeN last=null;
	int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new NodeN(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new NodeN(e,null);
		last=last.next;
		count++;
	}
	public int size()
	{
		return count;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index==0)
		{
			first=new NodeN(e,first);
			count++;
			return;
		}
		NodeN curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new NodeN(e,curr.next);
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
		NodeN curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next;
		count--;
	}
	
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		NodeN curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public void reverse()
	{
		NodeN prev=null;
		NodeN curr=first;
		NodeN next=null;
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
