package java_programs;

import java.util.Scanner;

public class pgrm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        char c=sc.next().charAt(0);
        char c1=Character.toLowerCase(c);
        if(c1>='a'&&c1<='z')
        {
        	System.out.println("alphabet");
        }
        else
        {
        	System.out.println("not an alphabet");
        }
	}

}
