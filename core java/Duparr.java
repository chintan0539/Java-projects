import java.util.*;
import java.lang.*;
import java.io.*;
class Duparr1
{
	public static void main(String args[])
	{
		int a[]=new int[6];
		int b[]=new int[6];
		int n=0;
		boolean flag=true;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a array of 5");
		for(int i=0;i<5;i++)
			a[i]=s.nextInt();

		System.out.println("After removing duplicate elements...");
		for(int i=0;i<5;i++)
		{
			flag=true;
			for(int j=0;j<5;j++)
			{
				if(a[i]==b[j])
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				b[n]=a[i];
				n++;
			}
		}


		for(int i=0;i<n;i++)
			System.out.println(b[i]);
	}
}