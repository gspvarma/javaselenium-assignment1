package java_programs;

import java.util.Scanner;

public class pgrm8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner  sc=new Scanner(System.in);
		    System.out.println("enter size of array:");
		    int n=sc.nextInt();
		    System.out.println("enter element to be searched:");
		    int k=sc.nextInt();
		    boolean flag=false;
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		    	a[i]=sc.nextInt();
		    }
		    for(int b:a)
		    {
		    	if(b==k)
		    	{
		    		flag=true;
		    		break;
		    	}
		    }
		    if(flag)
	    	{
	  
			System.out.println("element found");
    	}
    	else
    	{
    		System.out.println("element not found");
    	}
	}

}
