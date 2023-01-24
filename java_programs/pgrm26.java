package java_programs;




class parent {
	void Animal()
	{
		System.out.println("Animal class");
	}
}

class child extends parent
{
	
	void Dog()
	{
		System.out.println("Animal: Dog");
	}
}
public class pgrm26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      child a=new child();
		
		a.Animal();
		a.Dog();
		
	}

}
