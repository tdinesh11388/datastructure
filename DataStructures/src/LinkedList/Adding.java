package LinkedList;

public class Adding {

	public static void main(String[] args) 
	{
		LinkedListImplementation l=new LinkedListImplementation();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(1,33);
		l.reverse();
		for(int i=0;i<l.size();i++)
		{
			System.out.print((Integer)l.get(i)+" ");
		}
	}

}
