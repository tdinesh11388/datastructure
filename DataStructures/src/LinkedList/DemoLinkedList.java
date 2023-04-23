package LinkedList;

class Node1
{
	Object ele;
	Node1 next;
	Node1(Object e,Node1 n)
	{
		ele=e;
		next=n;
	}
}
class LinkedList1
{
	private Node1 first=null;
	private Node1 last=null;
	private int count=0;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node1(e,null);
			last=first;
			count++;
			return;
		}
		last.next=new Node1(e,null);
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
		Node1 curr=first;
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
		Node1 curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
}
public class DemoLinkedList
{
	public static void main(String[] args)
	{
		LinkedList1 l=new LinkedList1();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.remove(1);
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}

}
