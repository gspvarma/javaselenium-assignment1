package java_programs;

import java.util.Scanner;

public class pgrm20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       System.out.println(a+" "+b);
       int c;
       c=a;
       a=b;
       b=c;
       System.out.println(a+" "+b);
	}

}
