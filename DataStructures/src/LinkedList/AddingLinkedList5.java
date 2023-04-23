package LinkedList;

public class AddingLinkedList5
{
	public static void main(String[] args) 
	{
		LinkedList5 l=new LinkedList5();
		l.add(20);
		l.add(25);
		l.add(30);
		l.add(45);
		l.add(89);
		l.reverse();
		for(int i=0;i<l.size();i++)
		{
			System.out.print(l.get(i)+" ");
		}
	}
}
