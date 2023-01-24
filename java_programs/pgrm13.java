package java_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class pgrm13 {
	public static void main(String args[])
	{
	Map<Integer,String> a=new HashMap<Integer,String>();
	a.put(1,"ABC");
	a.put(2,"DEF");
	a.put(3,"GHI");
	a.put(4,"JKL");
	LinkedHashMap<Integer,String> b=new LinkedHashMap<Integer,String>();
	a.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->b.put(x.getKey(),x.getValue()));
	System.out.println("Sorted map:");
	System.out.println(b);
	}
}
