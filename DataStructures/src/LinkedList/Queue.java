package LinkedList;


class Nodee
{
	Object ele;
	Nodee next;
	Nodee(Object e,Nodee n)
	{
		ele =e;
		next=n;
	}
}
class Queue1
{
	private Nodee first=null;
	private int count=0;
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Nodee(e,null);
			count++;
			return;
		}
		Nodee curr=first;
		while(curr!=null)
		{
			curr=curr.next;
		}
		curr.next=new Nodee(e,null);
		count++;
	}
	public Object get()
	{
		if(first==null)return null;
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
}

public class Queue {

	public static void main(String[] args) 
	{
		Queue1 q=new Queue1();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		while(!q.isEmpty())
		{
			System.out.println(q.get());
		}
	}

}
