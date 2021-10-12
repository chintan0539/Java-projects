//OOPS in JAVA 

import java.io.*;
import java.util.*;
import java.lang.*;

class Employee{
	int ecode;
	String name;
	double sal;

	Scanner sc=new Scanner(System.in);

	public void getData(){
		System.out.println("enter empcode,name,salary");
		ecode=sc.nextInt();
		name=sc.next();
		sal=sc.nextDouble();
	}

	public void putData(){
		System.out.println("empcode="+ecode);
		System.out.println("name="+name);
		System.out.println("salary="+sal);
	}

	public static void main(String args[]){
		Employee obj=new Employee();
		obj.getData();
		obj.putData();
	}
}