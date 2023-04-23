package com.dn.ArrayList;

public class ArrayList
{
	private Object []a=new Object[5];
	int p=0;
	
	public void add(Object e)
	{
		if(p>=a.length)
		{
			increase();
		}
		a[p]=e;
		p++;
	}
	public void increase()
	{
		Object []temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
		{
			temp[i]=a[i];
		}
		a=temp;
	}
	public int size()
	{
		return p;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public void add(int index,Object e)
	{
		if(p>=a.length)
		{
			increase();
		}
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		for(int i=size()-1;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
		p++;
	}
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		for(int i=index+1;i<size();i++)
		{
			a[i-1]=a[i];
		}
		p--;
	}
}
