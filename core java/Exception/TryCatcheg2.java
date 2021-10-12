//Try catch eg2
// multiple catch block


import java.io.*;
import java.lang.*;


public class TryCatcheg2
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[10]=30;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e+"   task 1");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e+"  Task 2 completed");
		}

		catch(Exception e)
		{
			System.out.println("Common task completed");
		}
		System.out.println("rest of the code");
	}
}	