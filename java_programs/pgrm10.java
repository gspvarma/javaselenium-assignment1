package java_programs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pgrm10 {
	public static void main(String[] args)
	{
		List<String> l1 = new ArrayList<String>();
        l1.add("abc");
        l1.add("def");
        l1.add("ghi");
       List<String> l2 = new ArrayList<String>();
        l2.add("how");
        l2.add("are");
        l2.add("you");
       List<String> l3 = new ArrayList<String>();
        l3.addAll(l1);
        l3.addAll(l2);
System.out.println("joined list : "+l3);
	}
}
