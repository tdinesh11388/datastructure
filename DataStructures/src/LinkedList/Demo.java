package LinkedList;

class Node
{

	Object ele;
	Node next;
	public Node(Object e,Node n)
	{
		ele =e;
		next=n;
	}
	
}
class LinkedList
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
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			//Throw new IndexOutOfBoundsException();
		}
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	public int size()
	{
		return count;
	}
}
	
public class Demo
{

	public static void main(String[] args)
	{
		LinkedList l=new LinkedList();
		l.add(30);
		l.add(70);
		l.add(45);
		l.add(10);
		for(int i=0;i<l.size();i++)
		{
			System.out.println((Integer)l.get(i));
		}
	}

}
