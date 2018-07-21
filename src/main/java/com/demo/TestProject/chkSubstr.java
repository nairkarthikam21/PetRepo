package com.demo.TestProject;

import java.util.Scanner;

public class chkSubstr {

	public boolean chk_SubString(String s1,String s2)
	{		
		
		boolean flag=false;
		int len1=s1.length()-s2.length();
		int len2=s2.length();
		for(int i=0;i<=len1;i++,len2++)
		{
			if(s2.equals(s1.substring(i,len2)))
			{
				flag=true;
				break;
			}			
		}
		return flag;
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chkSubstr obj=new chkSubstr();
		Scanner sc=new Scanner(System.in);		
		String s1=sc.next();
		String s2=sc.next();
		boolean result=obj.chk_SubString(s1,s2);		
		if(result==false)
			System.out.println("Not a substring");
		else
			System.out.println("Its a substring");
		
		sc.close();		
	}

}
