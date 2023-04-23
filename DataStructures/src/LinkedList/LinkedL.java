package LinkedList;

class Node11
{
	Object ele;
	Node11 next;
	public Node11(Object e,Node11 n)
	{
		ele=e;
		next=n;
	}
}
class LinkedLL
{
	private Node11 first=null;
	private Node11 last=null;
	private int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node11(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node11(e,null);
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
		Node11 curr=first;
		for(int i=1;i<index;i++)
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
		Node11 curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	public void reverse()
	{
		Node11 prev=null;
		Node11 curr=first;
		Node11 next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		if(index==0)
		{
			first=new Node11(e,first);
			count++;
			return;
		}
		Node11 curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node11(e,curr.next);
		count++;
	}
}
public class LinkedL
{
	public static void main(String[] args)
	{
		LinkedLL l=new LinkedLL();
		l.add(10);
		l.add(30);
		l.add(90);
		l.add(45);
		l.add(78);
		l.add(3,65);
		l.reverse();
		
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
