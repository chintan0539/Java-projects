//addition of matrix
//class and object

import java.util.*;
import java.lang.*;
import java.io.*;

class ADDmat
{
	public static void main(String args[])
	{
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int i,j,c[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2*2 A matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter 2*2 B matrix");
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}

		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				c[i][j]=(a[i][j]+b[i][j]);
			}
		}

		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.print(c[i][j]+"  ");
			}
			System.out.println();		
		}
	}
}