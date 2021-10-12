 class A
{
	public void put()
	{
		System.out.println("aaaaaa");
	}
}

public class B extends A
{
	public void  output()
	{
		super.put();
	}
	public static void main(String args[])
	{
		B q=new B();
		q.output();
	}
}