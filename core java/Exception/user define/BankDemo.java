//main of user define handling

import java.io.*;

class BankDemo
{
	public static void main(String args[])
	{
		CheckingAmount obj= new CheckingAmount(101);
		obj.deposit(500);

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