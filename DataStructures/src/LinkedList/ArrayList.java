package LinkedList;

class ArrayList1
{
	private Object[]a=new Object[5];
	private int p=0;
	public void add(Object e)
	{
		if(p>=a.length)
		{
			increase();
		}
		a[p++]=e;
	}
	public void increase()
	{
		Object[]temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
		{
			temp[i]=a[i];
		}
		a=temp;
	}
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
		{
			throw new IndexOutOfBoundsException();
		}
		
		for(int i=size()-1;i>=0;i--)
		{
			a[i+1]=a[i];
		}
		a[index]=e;
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
	public int size()
	{
		return p;
	}
}
public class ArrayList
{
	public static void main(String[] args)
	{
		ArrayList1 a=new ArrayList1();
		a.add(10);
		a.add(20);
		a.add(40);
		a.add(1,4);
		
		for(int i=0;i<a.size();i++)
		{
			System.out.println((Integer)a.get(i));
		}
		//System.out.println(a.size());
		//System.out.println((Integer)a.get(1));
	}

}
