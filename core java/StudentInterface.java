import java.util.*;
import java.lang.*;
import java.io.*;

class Student
{
	int rno;
	String nm;
	Scanner s=new Scanner(System.in);
	public void get()
	{
		System.out.println("Enter rollno. and name");
		rno=s.nextInt();
		nm=s.next();
	}

	public void put()
	{
		System.out.println("Name - "+nm);
		System.out.println("Rollno - "+rno);
	}
}


interface L1
{
	int spwt=10;
}


class StudentInterface extends Student implements L1
{
	int m1,m2,total;
	Scanner s=new Scanner(System.in);
	public void getdata()
	{
		super.get();

		System.out.println("Enter m1 and m2");
		m1=s.nextInt();
		m2=s.nextInt();
	}

	public void putdata()
	{
		super.put();

		System.out.println("M1 is "+m1);
		System.out.println("M2 is "+m2);
		total=m1+m2+spwt;
		System.out.println("Total is "+total);
	}

	public static void main(String args[])
	{
		StudentInterface si=new StudentInterface();

		si.getdata();
		si.putdata();
	}
}