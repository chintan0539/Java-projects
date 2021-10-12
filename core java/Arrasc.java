//to arrange array elements in ascending order

import java.io.*;
import java.lang.*;
import java.util.*;

class Arrasc
{
	public static void main(String args[])
	{
		int a[]= new int[5];
		int i,j,temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 5 elements of array");
		for(i=0;i<5;i++)
		{
			a[i]= sc.nextInt();
		}

		for(i=0;i<5;i++)
		{
			for(j=0;j<4;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		System.out.println("*****************sorted array is***************");
		for(i=0;i<5;i++)
		{
			System.out.println("{ "+a[i]+" }");
		}
	}
}