//wap to print prime no bw 30 to 50

import java.io.*;
import java.lang.*;
import java.util.*;

class Checkprime
{
	public static void main(String args[])
	{
		int i,a,flag;
        for(a=30;a<51;a++)
        {
         	flag=0;
         	for(i=2;i<(a/2);i++)
         	{
         		if(a%i==0)
         		{
         			flag=1;
         			break;
         		}	
         	}
         	if(flag==0)
         	{
         		System.out.println(+a);
         	}
        }
    }
}