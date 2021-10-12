import java.util.*;
import java.lang.*;
import java.io.*;

class BankDemo
{
	public static void main(String args[])
	{
		CheckingAmount obj= new CheckingAmount(101);
		obj.deposite(500);

		try
		{
			obj.withdraw(100);
			obj.withdraw(600);
		}
		catch(InsufficientAmt e)
		{
			System.out.println("Insufficient Amount exception raised"+e.getamount());
			e.printStackTrace();
		}
	}
}