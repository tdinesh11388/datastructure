package com.dn.hashset;

public class HashSet 
{
	 static Node[]a=new Node[10];
	 static int count=0;
	 public static boolean add(Object key)
	 {
		 int index=key.hashCode()%10;
		 if(a[index]==null)
		 {
			 a[index]=new Node(key,null);
			 count++;
			 return true;
		 }
		 Node curr=a[index];
		 Node prev=null;
		 while(curr!=null)
		 {
			 if(key.equals(curr.key))return false;
			 prev=curr;
			 curr=curr.next;
		 }
		 prev.next=new Node(key,null);
		 count++;
		 return true;
	 }
	 public static void display()
	 {
		for(int i=0;i<a.length;i++)
		{
			Node curr=a[i];
			while(curr!=null)
			{
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	 }
}
