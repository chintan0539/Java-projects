import java.io.*;
import java.lang.*;
import java.util.*;

class Student{
	int rno;
	String nm;

	public void getdata(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rollno and name");
		rno=sc.nextInt();
		nm=sc.next();
	}

	public void putdata(){
		System.out.println("rollno="+rno);
		System.out.println("name="+nm);
	}
}

class Marks extends Student{
	float m1,m2,total,avg;
	
	public void get(){
		super.getdata();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m1,m2");

		m1=sc.nextFloat();
		m2=sc.nextFloat();
	}

	public void display(){
		super.putdata();
		total=m1+m2;
		avg=total/2;

		System.out.println("total marks="+total);
		System.out.println("avg marks="+avg);
	}

	public static void main(String args[]){
		Marks obj=new Marks();
		obj.get();
		obj.display();
	}
}

