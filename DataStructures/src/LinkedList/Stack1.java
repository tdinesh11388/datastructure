package LinkedList;

import java.util.EmptyStackException;

class Stack
{
	private Nodee first=null;
	private int count=0;
	
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Nodee(e,null);
			count++;
			return;
		}
		first=new Nodee(e,first);
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
		if(isEmpty())
		{
			throw new EmptyStackException();
		}
		Object ele=first.ele;
		first=first.next;
		count--;
		return ele;
	}

}
public class Stack1 {

	public static void main(String[] args)
	{
		Stack s=new Stack();
		s.push(10);
		s.push(30);
		s.push(40);
		
		System.out.println(s.pop());
	}

}
