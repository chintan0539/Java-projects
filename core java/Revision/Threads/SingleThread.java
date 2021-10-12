import java.lang.*;


class SingleThread
{
	public static void main(String args[])
	{
		Table obj=new Table();

		Thread1 t=new Thread1(obj);

		t.start();
	}
}