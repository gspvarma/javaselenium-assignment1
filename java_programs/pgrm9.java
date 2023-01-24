package java_programs;

import java.util.Arrays;
import java.util.Scanner;

public class pgrm9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc=new Scanner(System.in);
	    System.out.println("enter size of array:");
	    int n=sc.nextInt();
	
	    int a[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    System.out.println("largest element:"+a[n-1]);
	}

}
