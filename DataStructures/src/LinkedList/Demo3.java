package LinkedList;

class ArrayListt
{
	Object []a=new Object[3];
	static int p=0;
	public void add(Object e)
	{
		if(p>=0)
		{
			Object[] temp=new Object[a.length+3];
			for(int i=0;i<size();i++)
			{
				temp[i]=a[i];
			}
			a=temp;

		}
		a[p]=e;
		p++;
	}
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		return a[index];
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
		a[p]=null;
	}
	public int size()
	{
		return p;
	}
}
public class Demo3
{
	public static void main(String[] args)
	{
		ArrayListt a=new ArrayListt();
		a.add(10);
		a.add(90);
		a.add(45);
		a.add(89);
		a.remove(3);
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		//System.out.println(a.get(1));
	}

}
