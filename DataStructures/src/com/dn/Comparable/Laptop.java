package com.dn.Comparable;

public class Laptop implements Comparable<Laptop>
{
	String name;
	int cost;
	String color;
	
	Laptop(String name,int cost,String color)
	{
		this.name=name;
		this.cost=cost;
		this.color=color;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", cost=" + cost + ", color=" + color + "]";
	}

	@Override
	public int compareTo(Laptop o) {
		return this.cost-o.cost;
	}
	
	
}
