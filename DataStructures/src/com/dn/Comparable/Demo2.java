package com.dn.Comparable;

import java.util.Arrays;

public class Demo2
{
	public static void main(String[] args) {
		
		Laptop []l=new Laptop[4];
		l[0]=new Laptop("dell",1999,"red");
		l[1]=new Laptop("Asus",2999,"grey");
		l[2]=new Laptop("dell",3999,"blue");
		l[3]=new Laptop("Asus",6999,"black");
		
		Arrays.sort(l);
		
		for(Laptop a:l)
		{
			System.out.println(a);
		}
	}
}
