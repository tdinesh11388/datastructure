package com.dn.Queue;

public class Adding {

	public static void main(String[] args) 
	{
		Queue q=new Queue();
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		
		System.out.println(q.peek());
		while(!(q.isEmpty()))
		{
			System.out.print(q.poll()+" ");
		}
		
	}

}
