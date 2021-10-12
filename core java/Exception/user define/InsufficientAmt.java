//User define Exception

import java.io.*;
import java.lang.*;

class InsufficientAmt extends Exception
{
	private double amount;

	public InsufficientAmt(double amount)
	{
		this.amount=amount;
	}

	public double getamount()
	{
		return amount;
	}
}