package polymorphismprogrm;



class vandis{
	
	public void display() {
		
		int maxspeed=120;
		System.out.println(" maximum speed is ="+maxspeed);
		
	}
}
class bus extends vandis{
	
	
	int maxspeed=200;

	public void display() {
		
		super.display();
		System.out.println(" maximum speed is car ="+maxspeed);
	}
	
}
public class Methodusing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bus c= new bus();
		c.display();
	}

}
