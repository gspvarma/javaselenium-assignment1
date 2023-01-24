package java_programs;

import java.util.Scanner;

public class pgrm1 {

public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int a=sc.nextInt();
	if(a<=1)
	{
		System.out.println("Non-prime");
	}
	else if(a==2)
	{
		System.out.println("prime");
	}
	else
	{
	for(int i=2;i<a;i++)
	{
		if(a%i==0)
		{
			System.out.println("Non-prime");
		}
		else
		{
			System.out.println("prime");
		}
		break;
	}
	}
}
}
