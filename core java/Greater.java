//java prog to check entered no is even or odd


import java.io.*;
import java.lang.*;
import java.util.*;

class Greater
{
  public static void main(String args[])
  {
   int a,b,c;
   Scanner sc=new Scanner(System.in);
   System.out.println("enter the value of a,b &c");

   a=sc.nextInt();
   b=sc.nextInt();
   c=sc.nextInt();
   if(a>b&&a<c)
   {
    System.out.println("a is greater");
   }
   else if(b>c)
   {
    System.out.println("b is greater");
   }
   else
  {
  System.out.println("c is greater"); 
  }
 }
}