package java_programs;

class parentB
{
	void PLAY()
	{
		System.out.println("Parent : I PLAY CRICKET");
	}
}

class childB extends parentB
{
	void PLAY()
	{
		super.PLAY();
		System.out.println("Child : I PLAY BADMINTON");
	}
}

public class pgrm30 {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			parentB a=new childB();
			a.PLAY();
			

		}

}
