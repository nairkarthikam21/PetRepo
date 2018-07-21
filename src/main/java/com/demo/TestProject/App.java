package com.demo.TestProject;

public class App 
{
	public String reverse(String input)
	{		
		String rev ="";
		for(int i=input.length()-1;i>=0;i--)
		{						
			rev=rev + input.charAt(i);		
		}		
		if (input.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		return (rev);
	}
    public static void main( String[] args )
    {
        App obj=new App();
        String text= obj.reverse("malayalam");
        System.out.println(text);        
    }
}
