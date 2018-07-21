package com.demo.TestProject;

import java.util.Scanner;

public class anagramChk {

	public boolean chkForAnagram(String s1,String s2)
	{
		int l1=s1.length();
		int l2=s2.length();
		boolean flag=false;
		if (l1==l2)
		{		
			for(int i=0;i<l1;i++)
			{
				for(int j=0;j<l2;j++)
				{				
					if(s1.charAt(i)==s2.charAt(j))
					{
					    flag=true;
						break;
					}		
					else
						flag=false;
				}
				if (!flag)
					break;				
			}
		}
		return flag;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      anagramChk obj=new anagramChk();
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String s1=sc.next();
      boolean res=obj.chkForAnagram(s, s1);
      if(res)
    	  System.out.println(s+" is anagram of "+s1);
      else
    	  System.out.println(s+" is not anagram of "+s1);
      sc.close();
	}

}
