import java.util.*;
import java.io.*;
import java.lang.*;

class Perfect
{
  public static void main(String args[])
  {
    int n,i=1,sum=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a no.");
    n=s.nextInt();
    while(i<n)
    {
      if(n%i==0)
      {
        sum=sum+i;
      }
      i++;
    }
    if(n==sum)
    {
      System.out.println(n+ " is a perfect no.");
    }
    else
    {
      System.out.println("Not a perfect no.");
    }
  }
}
