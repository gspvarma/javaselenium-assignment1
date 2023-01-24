package java_programs;

import java.util.Scanner;

public class pgrm7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       char c=sc.next().charAt(0);
       String s=Character.toString(c);
       System.out.println("String: "+s);
       String s1=sc.next();
       char c1=s1.charAt(0);
       System.out.println("char: "+c1);
	}

}
