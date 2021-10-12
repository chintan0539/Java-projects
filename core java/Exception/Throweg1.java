// Throw keyword 

import java.io.*;
import java.lang.*;


public class Throweg1
{
	static void validate(int age)
	{
		if(age<18)
			throw new ArithmeticException ("not valid");

		else
			System.out.println("Welcome to vote");
	}

	public static void main(String args[])
	{
		validate(17);
		System.out.println("rest of code");
	}
}