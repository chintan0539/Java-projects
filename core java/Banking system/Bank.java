import java.util.*;
import java.io.*;
import java.lang.*;

class Bank
{
	String name,accdate,acctype,address,phone,tid,tdate,dname;
	int opbal,damount,wamount,accno,taccno;
	Scanner s=new Scanner(System.in);

	void Accopen()
	{
		System.out.println("******************* Welcome to CP bank *********************** ");
		System.out.println("Enter account no");
		accno=s.nextInt();
		System.out.println("Enter name");
		name=s.next();
		System.out.println("Enter accdate");
		accdate=s.next();
		System.out.println("Enter account type 'S'OR'C'");
		acctype=s.next();
		System.out.println("Enter address");
		address=s.next();
		System.out.println("Enter phno");
		phone=s.next();
		System.out.print("\n\n\tEnter opening amount : ");
		opbal=s.nextInt();
		if(acctype.equals("S"))
		{
			if(opbal<200)
			{	
				System.out.println("opening amount should be greater than 200");
				System.out.print("\n\n\t plz enter Opening amount : ");
				opbal=s.nextInt();
			}
		}
		else
		{
			if(opbal<5000)
			{	
				System.out.println("opening amount should be greater than 5000");
				System.out.print("\n\n\t plz enter Opening amount : ");
				opbal=s.nextInt();
			}
		}
		System.out.println("\n\n******************** Thx for creating account ************************");
	}


	void Deposite()
	{
		System.out.println("\n\n************************* Deposite Section*********************");

		System.out.println("\nEnter Accno");
		taccno=s.nextInt();

		if(taccno==accno)
		{
			System.out.println("Tid=123123");
			System.out.println("Enter deposite date");
			tdate=s.next();
			System.out.println("Enter name");
			dname=s.next();
			System.out.print("\n\n\tEnter deposite Amt : ");
			damount=s.nextInt();
			opbal+=damount;
			System.out.print("\n\n\t***Bank balance is "+opbal);
		}
		else
		{
			System.out.println("Wrong acc no");
		}

	}

	void Withdraw()
	{
		System.out.println("\n\n*************************WithDrawal Section********************** ");

		System.out.println("\nEnter Accno");
		taccno=s.nextInt();

		if(taccno==accno)
		{
			System.out.println("Tid=123123");
			System.out.println("Enter Withdraw date");
			tdate=s.next();
			System.out.println("Enter name");
			dname=s.next();
			System.out.print("\n\n\tEnter WithDraw Amt : ");
			wamount=s.nextInt();
			if(opbal<wamount)
			{
				System.out.print("Dont have enough balance Sorry.....");
			}
			else
			{
				opbal-=wamount;

				System.out.print("\n\n\t***Bank balance is "+opbal);
			}
		}
		else
		{
			System.out.println("Wrong acc no");
		}
	}


	void info()
	{
		System.out.println("\n\n************************* Account Info*********************");

		System.out.println("\nEnter Accno");
		taccno=s.nextInt();

		if(taccno==accno)
		{
			System.out.println("Account no. : "+accno);
			System.out.println("Name : "+name);
			System.out.println("opening date "+accdate);
			System.out.println(" address : "+address);
			System.out.println(" phno : "+phone);
			System.out.print("\n\n\t***Bank balance is "+opbal);
		}
		else
		{
			System.out.println("Wrong acc no");
		}

	}

	public static void main(String args[])
	{
		int ch;
		Scanner s=new Scanner(System.in);
		Bank b=new Bank();

		for (; ; ) 
		{
			System.out.println("\n\n********************************************************");
			System.out.println("\n1. Open account");
			System.out.println("2. Deposite amount");
			System.out.println("3. Withdraw amount");
			System.out.println("4. Account Info");
			System.out.println("5. Exit");
			System.out.print("Enter : ");
			ch=s.nextInt();

			switch(ch)
			{
				case 1:
				b.Accopen();
				break;

				case 2:
				b.Deposite();
				break;

				case 3:
				b.Withdraw();
				break;

				case 4:
				b.info();
				break;

				case 5:
				System.out.println("Thx for Banking with us");
				System.exit(0);
				break;
			}

		}
	}

}