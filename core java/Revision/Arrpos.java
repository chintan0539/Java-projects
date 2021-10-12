import java.util.*;
class Arrpos
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		
		int i,s;Boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter five no.");
		for(i=0;i<5;i++)
		{
			a[i]=sc.nextInt();	
		}
		System.out.println("Enter the search element");
		s=sc.nextInt();
		for(i=0;i<5;i++)
		{
			if(a[i]==s)
			{
				System.out.println("element found at location  "+(i+1));
				flag=true;
			}
		}

		if(flag==false)
		{
			System.out.println("no. not found");
		}
	}

}
	