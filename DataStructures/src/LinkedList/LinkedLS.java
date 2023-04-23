package LinkedList;


class LLS
{
	private Node first=null;
	private Node last=null;
	private int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node(e,null);
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
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	
	public void add(int index,Object e)
	{
		if(index==-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		
		if(index==0)
		{
			first=new Node(e,first);
			count++;
			return ;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node(e,curr.next);
		count++;
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
public class LinkedLS
{
	public static void main(String[] args)
	{
		LLS l=new LLS();
		l.add(10);
		l.add(30);
		l.add(50);
		l.add(89);
		
		l.add(1,11);
		
		l.reverse();
		
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{	
			System.out.println((Integer)l.get(i));
		}
	}

}
