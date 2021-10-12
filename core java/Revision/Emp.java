import java.util.*;
import java.lang.*;
import java.io.*;

class Emp
{
	static int eno;
	String name;
	double sal;

	Scanner sc=new Scanner(System.in);

	public void get()
	{
		System.out.println("Enter name and salary");
		name=sc.next();
		sal=sc.nextDouble();
	}

	public void put()
	{
		eno=eno+1;
		System.out.println("empno="+eno);
		System.out.println("Name="+name);
		System.out.println("salary="+sal);
	}

	public static void main(String args[])
	{
		Emp e= new Emp();

		e.get();
		e.put();

		Emp e2= new Emp();
		e2.get();
		e2.put();
	}
}
