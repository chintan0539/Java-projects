//arithmetic ope using switch case
import java.io.*;
import java.util.*;
class Arithmetic
{
	public static void main(String args[])
	{
		int a,b,r=0;
		String ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two nos.  ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter arithmetic operator= ");
		ch=sc.next();
		switch(ch)
		{
			case "+":
			r=(a+b);
			break;

			case "-":
			r=(a-b);
			break;
            
            case "*":
			r=(a*b);
			break;

			case "/":
			r=(a/b);
			break;

			case "%":
			r=(a%b);
			break;

			default:
			System.out.println("entered wrong choice");
			break;
		}
		System.out.println("result=" +r);

	}
}
