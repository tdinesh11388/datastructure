package com.dn.Comparable;

import java.util.Comparator;

public class NameFarmer implements Comparator<Farmer>
{
	@Override
	public int compare(Farmer f1,Farmer f2)
	{
		return f1.name.compareTo(f2.name);
	}
}
