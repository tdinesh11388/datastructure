package LinkedList;

class Container<E>
{
	private E obj;
	public void set(E obj)
	{
		this.obj=obj;
	}
	public E get(int index)
	{
		return obj;
	}
}
public class GenericType
{
	public static void main(String[] args) 
	{
		Container<String>c1=new Container<String>();
		c1.set("dinesh");
		c1.set("abc");
		
		System.out.println(c1.get(0));
	}

}
