package java_programs;

import java.util.Scanner;

public class pgrm18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
  String s=sc.nextLine();
  int n=s.length(),v=0,c=0;
  s=s.toUpperCase();
  for(int i=0;i<n;i++)
  {
	  if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
	  {
		  if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
		  {
			  v++;
		  }
		  else
		  {
			  c++;
		  }
	  }
	  
  }
  System.out.println("vowels:"+v);
  System.out.println("consonants:"+c);
	}

}
