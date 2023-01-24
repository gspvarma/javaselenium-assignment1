package java_programs;

import java.util.Scanner;

public class pgrm2 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=0,b=1,c;
	System.out.println("enter length of fibonacci");
	int n=sc.nextInt();
	System.out.print(a+" "+b);
	for(int i=0;i<n;i++)
	{
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
	
}
}
