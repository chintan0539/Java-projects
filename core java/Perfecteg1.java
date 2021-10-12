import java.util.*;
import java.io.*;
import java.lang.*;

class Perfecteg1
{
  public static void main(String args[])
  {
    int n,i=1,sum=0;
    System.out.println("Perfect no. between 1 to 10000 are");
    for(n=1;n<10000;n++)
    {
      sum=0;
      for(i=1;i<n;i++)
      {
        if(n%i==0)
        {
          sum=sum+i;
        }
      }
      if(n==sum)
      {
        System.out.println(n);
      }
    }



  }
}
