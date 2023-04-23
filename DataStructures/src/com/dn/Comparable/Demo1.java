package com.dn.Comparable;

import java.util.Arrays;

class Circle implements Comparable
{
	int radius;
	Circle(int r)
	{
		this.radius=r;
	}
	@Override
	public int compareTo(Object obj)
	{
		return radius-((Circle)obj).radius;
		//return radius-obj.radius;
	}
	 
}
public class Demo1 {

	public static void main(String[] args)
	{
		Circle[]c=new Circle[5];
		c[0]=new Circle(30);
		c[1]=new Circle(12);
		c[2]=new Circle(38);
		c[3]=new Circle(78);
		c[4]=new Circle(31);
		
		Arrays.sort(c);
		
		for(Circle s:c)
		{
			System.out.println(s.radius);
		}
	}

}
