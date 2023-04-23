package com.dn.Comparable;

import java.util.Comparator;

public class SortFarmer implements Comparator<Farmer>{

	@Override
	public int compare(Farmer o1, Farmer o2) {
		return o2.AadharId-o1.AadharId;
		//desending Order
	}

}
