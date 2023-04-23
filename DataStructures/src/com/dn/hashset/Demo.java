package com.dn.hashset;

public class Demo {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		System.out.println(h.add(20));
		System.out.println(h.add(22));
		System.out.println(h.add(32));
		System.out.println(h.add(45));
		System.out.println(h.add(22));
		System.out.println(h.add(89));
		System.out.println(h.add(12345));
		System.out.println(h.add("AAA"));
		System.out.println(h.add("BBB"));
		System.out.println(h.add("milk"));
		System.out.println(h.add("Milk"));
		System.out.println(h.add("aaa"));

		h.display();
	}

}
