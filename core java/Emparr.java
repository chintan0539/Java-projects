// class & object

import java.io.*;
import java.lang.*;
import java.util.*;

class Emparr
{
	static int empno;
	String name;
	double sal;

	Scanner sc=new Scanner(System.in);

	void get()
	{
		
		name=sc.next();
		sal=sc.nextDouble();
	}

	void put()
	{
		empno=empno+1;
		System.out.println(empno+"\t"+name+"\t"+sal);
		
	}

	public static void main(String args[])
	{
		Emparr obj[]= new Emparr[5];
		int i;
		System.out.println("enter name and salary for five employee");
		for(i=0;i<5;i++)
		{
			obj[i]=new Emparr();
			obj[i].get();
		}
		
		system.out.println("empno	name	salary");
		for(i=0;i<5;i++)
		{
			obj[i].put();
		}
	}
}
	
