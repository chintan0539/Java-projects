//constructor

import java.util.*;
import java.io.*;

class Empcon{
	int eno;
	String nm;
	double sal;

	public Empcon(){
		eno=100;
		nm="chintan";
		sal=999999.99;
	}

	public Empcon(int eno,String nm,double sal){
		this.eno=eno;
		this.nm=nm;
		this.sal=sal;
	}

	public void Display(){
		System.out.println("empno="+eno);
		System.out.println("Name="+nm);
		System.out.println("Salary="+sal);
	}

	public static void main(String args[]){
		Empcon obj=new Empcon();
		obj.Display();
		Empcon obj2=new Empcon(102,"qwe",787878787);
		obj2.Display();
	}
}