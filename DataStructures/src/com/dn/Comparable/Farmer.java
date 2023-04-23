package com.dn.Comparable;

public class Farmer
{
	String name;
	int AadharId;
	int phoneNumber;
	public Farmer(String name, int aadharId, int phoneNumber) 
	{
		this.name = name;
		AadharId = aadharId;
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "Farmer [name=" + name + ", AadharId=" + AadharId + ", phoneNumber=" + phoneNumber + "]";
	}
	
	
	
}
