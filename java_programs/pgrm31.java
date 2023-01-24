package java_programs;


abstract class Transport{
	abstract void vehicle();
}

class bus extends Transport
{
	void vehicle()
	{
		System.out.println("Bus transportation");
	}
}

public class pgrm31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport a=new bus();
		a.vehicle();
	}

}
