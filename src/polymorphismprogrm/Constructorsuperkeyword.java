package polymorphismprogrm;



class vandigals{
	
	
	public vandigals() {
		System.out.println("max speed is=120");
	}
	
	public vandigals(int maxspeed) {
		
		System.out.println("max speed is"+maxspeed);
	}
	
}

class lorry extends vandigals{
	public lorry() {
		super(40);
		System.out.println("max speed is=200");
		}
	
	
}

public class Constructorsuperkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
