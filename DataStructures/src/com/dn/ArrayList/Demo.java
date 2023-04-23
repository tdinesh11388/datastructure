package com.dn.ArrayList;

public class Demo {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
		a.add(10);	
		a.add(30);	
		a.add(145);	
		a.add(56);	
		a.add(90);
		//a.add(1,56);
		a.remove(0);
		System.out.println(a.size());
		System.out.println(a.get(0));
	
	}
	
}
