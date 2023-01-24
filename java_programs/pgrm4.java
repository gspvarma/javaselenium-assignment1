package java_programs;

import java.util.Scanner;

public class pgrm4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner  sc=new Scanner(System.in);
    System.out.println("enter size of array:");
    int n=sc.nextInt();
    int k=0;
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
    	a[i]=sc.nextInt();
    	k=k+a[i];
    }
    float avg=k/n;
    System.out.println(avg);
	}

}
