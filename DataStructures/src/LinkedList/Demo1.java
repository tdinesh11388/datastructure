package LinkedList;

class ArrayLL
{
	private Object []a=new Object[3];
	private int p=0;
	public void add(Object e)
	{
		if(p>=a.length)
		{
			Object[] temp=new Object[a.length+3];
			for(int i=0;i<a.length;i++)
			{
				temp[i]=a[i];
			}
			a=temp;
		}
		a[p++]=e;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return a[index];
	}
	public int size()
	{
		return p;
	}
}
public class Demo1 {

	public static void main(String[] args)
	{
		ArrayList2 a=new ArrayList2();
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(16);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
	}

}
