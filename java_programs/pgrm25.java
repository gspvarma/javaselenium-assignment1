package java_programs;

interface i1
{
	void work();
}
class class1 implements i1
{
	public void work()
	{
		System.out.println("Working on java");
	}
}
public class pgrm25 {
public static void main(String args[])
{
	class1 c=new class1();
	c.work();
}
}
