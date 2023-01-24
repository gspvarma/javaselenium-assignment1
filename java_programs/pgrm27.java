package java_programs;


class parent1 {
	void Animal()
	{
		System.out.println("Animal class");
	}
}

class child1 extends parent1
{
	
	void Dog()
	{
		System.out.println("Dog class");
	}
}


public class pgrm27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent1 a=new child1();
		
		a.Animal();
		
	}

}
