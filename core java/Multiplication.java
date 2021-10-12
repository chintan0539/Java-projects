//WAP to print multiplication table of a given no.

import java.io.*;
import java.lang.*;
import java.util.*;

class Multiplication
{
	public static void main(String args[])
	{
	   int a,i;
	   Scanner sc=new Scanner(System.in);

	   System.out.println("enter a no=");
	   a=sc.nextInt();
	   i=1;
	   while(i<11)
	   {
	      System.out.println(a+"*"+i+"="+(a*i));
	      i=(i+1);

	   }

	}
}