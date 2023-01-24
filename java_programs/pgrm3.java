package java_programs;

import java.util.Scanner;

public class pgrm3 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a string");
	String s=sc.nextLine();
	String s2="";
	int n=s.length();
	for(int i=n-1;i>=0;i--)
	{
		s2=s2+s.charAt(i);
		
	}
	System.out.println(s2);
	if(s.equalsIgnoreCase(s2))
	{
		System.out.println("palindrome");
	}
	else
	{
		System.out.println("not a palindrome");
	}
}
}
