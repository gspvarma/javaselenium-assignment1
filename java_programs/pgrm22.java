package java_programs;

import java.util.Scanner;

public class pgrm22 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine() ;
		 int n=s.length(),f=0;
		 char c=sc.next().charAt(0);
		 for(int i=0;i<n;i++)
		 {
			 if(s.charAt(i)==c)
			 {
				 f++;
			 }
		 }
		 System.out.println("frequency of " +c+":"+f);
	}

}
