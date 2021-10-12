//java prog to calculate sum of even digit in a no

import java.io.*;
import java.lang.*;
import java.util.*;

class Evesumdigit
{
  public static void main(String args[])
 {
  int n,rem=0,sum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a no");
 n=sc.nextInt();

 while(n>0)
{
  rem=n%10;
  if(rem%2==0)
  	sum=sum+rem;
  n=n/10;
}
System.out.println("sum of even digits is ="+sum);
}
}
 