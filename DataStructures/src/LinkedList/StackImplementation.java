package LinkedList;

class SK
{
	private Node first=null;
	private int count=0;
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
	}
	public int size()
	{
		return count;
	}
	public boolean isEmpty()
	{
		return first==null;
	}
	public Object pop()
	{
		if(first==null)return null;
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
}
public class StackImplementation
{
	public static void main(String[] args)
	{
		SK s=new SK();
		s.push(10);
		s.push(50);
		s.push(78);
		System.out.println(s.size());
		System.out.println(s.pop());
		
		
		while(!s.isEmpty())
		{
			System.out.println(s.pop());
		}
	}

}
