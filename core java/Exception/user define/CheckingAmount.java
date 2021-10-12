import java.io.*;

class CheckingAmount
{
	private double balance;
	private int number;

	public CheckingAmount(int number)
	{
		this.number=number;
	}

	public void deposit(double amount)
	{
		balance +=amount;//balance=balance+amount1;
	}

	public void withdraw(double amount)throws InsufficientAmt
	{
		if(amount<=balance)
		{
			balance=balance-amount;
		}
		else
		{
			double needs=amount-balance;
			throw new InsufficientAmt(needs);
		}
	}
	public double getbalance()
	{
		return balance;
	}

	public int getnumber()
	{
		return number;
	}
}