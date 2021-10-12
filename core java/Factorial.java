//java prog for factorial of a given no

import java.io.*;
import java.lang.*;
import java.util.*;

class Factorial
{
	public static void main(String args[])
    {
    	int n,i=1,fact=1;
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter a no");
    	n=sc.nextInt();

 		while(i<=n)
		{ 
			fact=fact*i;
			i=(i+1);
 		}
		System.out.println("sum of even digits is ="+fact);
	}
}
 