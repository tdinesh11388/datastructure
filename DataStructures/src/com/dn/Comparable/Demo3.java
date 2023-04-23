package com.dn.Comparable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo3 {

	public static void main(String[] args)
	{
		Farmer[] f=new Farmer[3];
		f[0]=new Farmer("Nanna",111,232345);
		f[1]=new Farmer("vijay",333,567849);
		f[2]=new Farmer("chalapathi",222,2984565);
		SortFarmer s=new SortFarmer();
		//NameFarmer n=new NameFarmer();
		Arrays.sort(f,s);
		for(Farmer o:f)
		{
			System.out.println(o);
		}
	}

}
