package java_programs;



class parentA
{
	void operate()
	{
		System.out.println("add two numbers");
	}
}

class childA extends parentA
{
	void operate()
	{
		System.out.println("multiply numbers");
	}
}

public class pgrm29 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parentA a=new childA();
		a.operate();

	}
}
