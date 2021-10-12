//program to perform addition of matrix

import java.io.*;
import java.lang.*;
import java.util.*;

class MultiMatrix
{
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
        int i,j,k;
		Scanner sc=new Scanner(System.in);
        
		 
		System.out.println("enter a 3*3 matrix");
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		a[i][j]=sc.nextInt();
        	}
        }

        System.out.println("enter b 3*3 matrix");
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		b[i][j]=sc.nextInt();
        	}
        }
        
        System.out.println("***********multiplication of matrix *************\n\n");
        for(i=0;i<3;i++)
        {
        	for(j=0;j<3;j++)
        	{
        		c[i][j]=0;
                        for(k=0;k<3;k++)
                        {
                                c[i][j]=c[i][j]+a[i][k]*b[k][j];
                        }
                        System.out.print(c[i][j]+"  ");
        	}

        	System.out.println("\n");
        }
	}
}