package java_programs;

import java.util.Scanner;

public class pgrm24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine() ;
		 System.out.println("reverse of string:"+reversing(s));
	}
	public static String reversing(String str)  
	{     
	if(str.isEmpty())  
	{       
	return str;  
	}   
	else   
	{  
	return reversing(str.substring(1))+str.charAt(0);  
	}  
	}  
}
