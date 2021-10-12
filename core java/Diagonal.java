//To calculate sum of digonals of matrix

import java.io.*;
import java.util.*;
import java.lang.*;

class Diagonal{
	public static void main(String args[]){
		int a[][]=new int[3][3];
		int i,j,sd1=0,sd2=0;

		Scanner sc= new Scanner(System.in);
		System.out.println("enter a 3*3 matrix");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				a[i][j]=sc.nextInt();
			}
		}
        for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(i==j){
					sd1=sd1+a[i][j];
				}
			}
		}


		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				if(i+j==2){
					sd2=sd2+a[i][j];
				}
			}
		}

		System.out.println("sum of first diagonal="+sd1);
		System.out.println("sum of second diagonols"+sd2);	
	}
}