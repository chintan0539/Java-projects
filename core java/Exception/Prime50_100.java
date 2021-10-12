//wap to print prime no. from 50 to 100



import java.util.*;
import java.lang.*;
import java.io.*;

class Prime50_100
{
	public static void main(String args[])
	{
		int a=50,i=2,flag=0;

		for(a=50;a<101;a++)
		{ 
			flag=0;
			for(i=2;i<a;i++)
			{
				if(a%i==0)
				{
					flag=1;
				}
				
			}

			if(flag==0)
			{
				System.out.println(a);
			}
		}
	}
} 