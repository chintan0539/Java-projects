import java.io.*;
import java.lang.*;
import java.util.*;

class Table
{
	synchronized void printTable(int n)
	{
		for(int i=0;i<5;i++)
		{	
			System.out.println(n*i);

			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}