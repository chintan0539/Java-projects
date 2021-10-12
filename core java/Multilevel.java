//multilevel Inheritance
import java.util.*;
import java.lang.*;
import java.io.*;

class a
{
	public void ou()g
	{
		System.out.println("Base class");

	}
}

class b extends a
{

	public void print()
	{
		super.ou();
		System.out.println("derived by class A");
	}
}

class Multilevel extends b
{
	public void o()
	{
		super.print();
		System.out.println("derived by class b");
	}

	public static void main(String args[])
	{
		Multilevel obj=new Multilevel();
		
		obj.o();
	}
}

