package java_programs;


interface Godavari{
	public void godavari();
}

interface Krishna{
	public void krishna();
}

 class Rivers  implements Godavari,Krishna
{
	public void godavari()
	{
		System.out.println("Godavari is one of the largest peninsular river");
	}
	
	public void krishna()
	{
		System.out.println("krishna is one of the largest peninsular river");
	}
}

public class pgrm28 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rivers a=new Rivers();
		a.godavari();
		a.krishna();

	}

}
