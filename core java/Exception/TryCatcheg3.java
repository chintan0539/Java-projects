//Try catch eg3


import java.io.*;
import java.lang.*;


public class TryCatcheg3
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5]=30;
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("task 1 completed");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"  Task 2 completed");
		}
		catch(Exception e)
		 {
		 	System.out.println("common task completed");
		}

		System.out.println("rest of the code");
	}
}	