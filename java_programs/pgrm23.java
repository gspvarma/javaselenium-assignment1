package java_programs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class pgrm23 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		 String s=sc.nextLine() ;
		    Date d1=new SimpleDateFormat("dd/MM/yyyy").parse(s);  
		    System.out.println(s+"\t"+d1);  
	}

}
