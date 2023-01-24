package java_programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class pgrm12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Map<Integer,String> al=new HashMap<Integer, String>();
	      al.put(1,"abc");
	      al.put(2,"def");
	      al.put(3,"ghi");
	      System.out.println(al);
	      ArrayList<Integer> a= new ArrayList<Integer>(al.keySet());
	      ArrayList<String> b= new ArrayList<String>(al.values());
	      System.out.println(a);
	      System.out.println(b);
	}

}
