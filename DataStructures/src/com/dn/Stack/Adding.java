package com.dn.Stack;

public class Adding {

	public static void main(String[] args) 
	{
		Stack s=new Stack();
		s.push(20);
		s.push(65);
		s.push(40);
		s.push(50);
		s.push(90);
		
		while(!(s.isEmpty()))
		{
			System.out.print(s.pop()+" ");
		}
	}

}
