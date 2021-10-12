import java.io.*;
import java.lang.*;
import java.util.*;

class Pattern
{
	public static void main(String args[])
	{
		int i,j,k;
		for(i=5;i>=1;i--)
		{
			for( k=i;k<=5;k++)
			{
				System.out.print("  ");
			}
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}