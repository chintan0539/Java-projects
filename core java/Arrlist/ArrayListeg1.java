import java.util.ArrayList;

public class ArrayListeg1
{
	public static void main(String args[])
	{
		ArrayList<String>al=new ArrayList<String>();
		//add ele to the arrlist

		al.add("JAVA");
		al.add("c++");
		al.add("ASP.NET");
		al.add("PHP");
		System.out.println(al);
		//get element by index
		System.out.println("element at index 1 = "+al.get(1));
		System.out.println("Does list contain java?  "+al.contains("JAVA"));
		//add element at a specific index
		al.add(2,"C");
		System.out.println(al);
		System.out.println("Is arraylist is empty?  "+al.isEmpty());
		System.out.println("Index of ASP.NET is "+al.indexOf("ASP.NET"));
		System.out.println("Size of arrlist is "+al.size());
	}

}