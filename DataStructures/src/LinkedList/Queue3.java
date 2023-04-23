package LinkedList;

class Q
{
	private Node first=null;
	private int count=0;
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
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
}
class Queue3
{
	public static void main(String[] args)
	{
		Q q=new Q();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println(q.size());
		
		while(!q.isEmpty())
		{
			System.out.println(q.poll());
		}
	}
}
