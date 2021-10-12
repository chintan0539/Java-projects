//wap to print rno,name,marks,for 5 students
import java.io.*;
import java.lang.*;
import java.util.*;

class Student
{
	public static void main(String args[])
	{
		int rno[]=new int[5];
		String name[]=new String[5];
		float marks[]=new float[5];
		int i;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter rno,name,marks for 5 students");

		for(i=0;i<5;i++)
		{
			rno[i]=sc.nextInt();
			name[i]=sc.next();
			marks[i]=sc.nextFloat();
		}

		System.out.println("rno   name   marks");
		for(i=0;i<5;i++)
		{
			System.out.println(rno[i]+"\t"+name[i]+"\t"+marks[i]);
		}
	}
}
	
