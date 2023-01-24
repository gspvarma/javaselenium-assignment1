package java_programs;

import java.util.Scanner;

public class pgrm5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of rows and columns:");
       int a=sc.nextInt();
       int b=sc.nextInt();
       int[][] a1=new int[a][b];
       int[][] a2=new int[a][b];
       for(int i=0;i<a;i++)
       {
    	   for(int j=0;j<b;j++)
    	   {
    		   a1[i][j]=sc.nextInt();
    	   }
       }
       for(int i=0;i<a;i++)
       {
    	   for(int j=0;j<b;j++)
    	   {
    		   a2[i][j]=sc.nextInt();
    	   }
       }
       int[][] a3=new int[a][b];
       for(int i=0;i<a;i++)
       {
    	   for(int j=0;j<b;j++)
    	   {
    		   a3[i][j]=a1[i][j]+a2[i][j];
    	   }
       }
       for(int i=0;i<a;i++)
       {
    	   for(int j=0;j<b;j++)
    	   {
    		   System.out.println(a3[i][j]);
    	   }
       }
      
	}

}
