import java.io.*;
import java.lang.*;
import java.util.*;

class Pyramid
{
	public static void main(String args[])
	{
		int i,j,k;
   		for(i=1;i<5;i++)
   		{
   			for(k=i;k<5;k++)
   			{
   				System.out.print("  ");
   			}
   			for(j=1;j<i;j++)
   			{
   				System.out.print(j+" ");
   			}
   			for(int l=j;l>=1;l--)
   			{
   				System.out.print(l+" ");
   			}
   			System.out.println();
   		}
		
	}
}