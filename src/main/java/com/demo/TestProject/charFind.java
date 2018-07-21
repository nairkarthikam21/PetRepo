package com.demo.TestProject;

import java.util.Scanner;

public class charFind {

	public void getString(String s)
	{
	    Scanner scn=new Scanner(System.in);
	    System.out.println("Character at :");
		try {		
		int a=scn.nextInt();		
	    System.out.print(s.charAt(a));	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
		scn.close();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      charFind obj=new charFind();
      obj.getString("Kripa");
	}

}
