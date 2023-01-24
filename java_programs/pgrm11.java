package java_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pgrm11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> al=new ArrayList<String>();
      al.add("abc");
      al.add("def");
      al.add("ghi");
      Object[] o1 = al.toArray();
      
      for (Object o2 : o1) {
          System.out.println(o2 + " ");
	}
      List a2 = Arrays.asList(o1);
      
      System.out.println(a2);
	}
}
