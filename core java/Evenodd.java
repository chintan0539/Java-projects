//java prog to check entered no is even or odd


import java.io.*;
import java.lang.*;
import java.util.*;

class Evenodd
{
  public static void main(String args[])
  {
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of n");
   n=sc.nextInt();
   if(n%2==0)
   {
    System.out.println("even");
   }
   else
   {
    System.out.println("odd");
   }
 }
}