//to search element in bub

import java.io.*;
import java.lang.*;
import java.util.*;

class Bubsearch
{
	public static void main(String args[])
	{
		int a[]= new int[5];
		int i,flag=0,s;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 5 elements of array");
		for(i=0;i<5;i++)
		{
			a[i]= sc.nextInt();
		}

		System.out.print("enter the search element  :  ");
		s=sc.nextInt(); 

		for(i=0;i<5;i++)
		{
			
				if(a[i]==s)
				{
					System.out.println("element is at location "+(i+1));
					flag=1;
				}
			
		}
		if(flag==0)
		{
			System.out.println("element not found");
		}
		
	}
}