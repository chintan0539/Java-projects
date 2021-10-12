import java.util.*;
import java.lang.*;
import java.io.*;


class Thread1 extends Thread
{
	Table t=new Table();
	Thread1(Table t)
	{
		this.t=t;
	}
	public void run()
	{
		t.printTable(5);
	}
}