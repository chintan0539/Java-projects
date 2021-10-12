//wap to check entered no is prime or not

import java.io.*;
import java.lang.*;
import java.util.*;

class Prime
{
	public static void main(String args[])
	{
		int i,a,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any no.");
		a=sc.nextInt();

		for(i=2;i<=(a/2);i++)
		{
			if((a%i)==0)
			{
				flag=1;
				break;
			}
		}

		if(flag==0)
		{
			System.out.println("no. is prime");
		}
		else
		{
			System.out.println("no is not prime");
		}

	}
}