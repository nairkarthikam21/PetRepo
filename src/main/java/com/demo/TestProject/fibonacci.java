package com.demo.TestProject;

import java.util.Scanner;

public class fibonacci {

	public void fib(int a)
	{
		int sum=0,n1=0,n2=1;	
		int count=3;
		  System.out.print("0 1");
		while(count<=a)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
			count++;
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fibonacci obj=new fibonacci();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		int n=sc.nextInt();		
		if (n==0 || n==1)
			System.out.println("0");
		else if (n==2)
			System.out.println("0 1");
		else
		{		  
			obj.fib(n);
		}
		sc.close();
	}

}
