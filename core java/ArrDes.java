//WAP to sort arr in des
//addition of matrix
//class and object


import java.util.*;
import java.lang.*;
import java.io.*;

class ArrDes
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		int i,j,temp=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 ele for array");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}

		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				if(a[j]<a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.println("Sorted array........... ");
		for(i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
	}
}