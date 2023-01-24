package java_programs;

public class pgrm6 {
public static void main(String args[])
{
	int a[]= {1,2,3,4,5};
	int b[]= {6,7,8};
	int m=a.length;
	int n=b.length;
	int k=m+n;
	int[] c=new int[k];
	System.arraycopy(a,0,c,0,m);
	System.arraycopy(b,0,c,m,n);
	for(int s:c)
	{
	System.out.print(s+" ");
	}
}
}
