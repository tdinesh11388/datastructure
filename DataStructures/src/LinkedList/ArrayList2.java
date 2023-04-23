package LinkedList;

public class ArrayList2
{
	Object []a=new Object[3];
	private int p=0;
	public  void add(Object e)
	{
		if(p>=a.length)
		{
			
		}
		a[p]=e;
		p++;
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
}
class Demo2
{
	public static void main(String []args)
	{
		ArrayList2 a=new ArrayList2();
		a.add(10);
		a.add(20);
		a.add(30);
		Object c=a.get(1);
		System.out.println(c);
	}
}
