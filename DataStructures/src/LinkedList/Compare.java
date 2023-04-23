package LinkedList;



import java.util.Arrays;
import java.util.Comparator;

class com implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return ((String)o1).length()-((String)o2).length();
	}
}
class comp implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		return ((String)o1).compareTo(((String)o2));
	}
}
public class Compare
{
	public static void main(String[] args)
	{
		dispArray();
		String[] s1= {"akhilesh","manju","pruthwi"};
		Arrays.sort(s1,new com());
		System.out.println(Arrays.toString(s1));
		Arrays.sort(s1,new comp());
		System.out.println(Arrays.toString(s1));
	}

	static void dispArray()
	{
		int [] a= {100,50,25,445,85,1,1,3,41};
		Arrays.sort(a);
		System.out.println("a "+Arrays.toString(a));
 
		String[] s= {"manju","akhil","pruthwi"};
		Arrays.sort(s);
		System.out.println("s "+Arrays.toString(s));
	}
}