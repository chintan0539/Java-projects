import java.util.*;
import java.lang.*;
import java.io.*;

class Empcon
{
	int eno;
	String name;
	double sal;

	Scanner sc=new Scanner(System.in);

	public Empcon()
	{
		eno=101;
		name="ABC";
		sal=89898;
	}

	public Empcon(int eno,String name,double sal)
	{
		this.eno=eno;
		this.name=name;
		this.sal=sal;
	}
	public void put()
	{
		System.out.println("empno="+eno);
		System.out.println("Name="+name);
		System.out.println("salary="+sal);
	}

	public static void main(String args[])
	{
		Empcon e= new Empcon();
		e.put();
		Empcon e2= new Empcon(102,"Rakesh",56566);
		e2.put();
	}
}