//Try catch eg1

import java.io.*;
import java.lang.*;


public class TryCatcheg1
{
	public static void main(String args[])
	{
		try
		{
			int data=50/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}
}	