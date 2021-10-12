// class & object

import java.io.*;
import java.lang.*;
import java.util.*;

class Emp
{
	static int empno;
	String name;
	double sal;

	Scanner sc=new Scanner(System.in);

	public void get()
	{
		System.out.println("enter name and salary");
		name=sc.next();
		sal=sc.nextDouble();
	}

	public void put()
	{
		empno=empno+1;
		System.out.println("empno="+empno);
		System.out.println("name="+name);
		System.out.println("salary="+sal);
	}

	public static void main(String args[])
	{
		Emp obj= new Emp();
		obj.get();
		obj.put();
	}
}
	
