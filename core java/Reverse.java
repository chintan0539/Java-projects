//java prog to reverse a no

import java.io.*;
import java.lang.*;
import java.util.*;

class Reverse
{
  public static void main(String args[])
 {
  int n,rem=0,rev=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter a no");
 n=sc.nextInt();

 while(n>0)
{
  rem=n%10;
  rev=rev*10+rem;
  n=n/10;
}
System.out.println("reverse no ="+rev);
}
}
 