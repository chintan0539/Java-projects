

import java.io.*;
import java.lang.*;
import java.util.*;

class Studentarr{
	static int rollno;
	String name;
	float marks;

	Scanner sc=new Scanner(System.in);

	public void getData(){
		name=sc.next();
		marks=sc.nextFloat();
	}

	public void putData(){
		rollno=rollno+1;
		System.out.println(rollno+"\t"+name+"\t"+marks);
	}

	public static void main(String args[]){
		Studentarr obj[]=new Studentarr[5];
		System.out.println("enter name & marks for 5 students");
		int i;

		for(i=0;i<5;i++){
			//obj[i]=new Studentarr();
			obj[i].getData();
		}

		System.out.println("rollno\tName\tmarks");
		for(i=0;i<5;i++){
			obj[i].putData();
		}
	}
}