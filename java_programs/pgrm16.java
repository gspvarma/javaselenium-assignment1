package java_programs;

import java.util.Scanner;

public class pgrm16 {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	System.out.println("enter size of table");
	int n=sc.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println(a+"*"+i+"="+a*i);
	}
}
}
