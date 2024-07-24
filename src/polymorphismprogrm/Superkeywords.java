package polymorphismprogrm;


class vehicle{
	
	int maxspeed=120;
}
class car extends vehicle{
	
	int maxspeed=200;
	public void display() {
// super keyword	to fetch maximum speed 120	
		System.out.println("maximum speed is="+super.maxspeed);
		System.out.println(" maximum speed is ="+maxspeed);
	}
}
public class Superkeywords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car c=new car();
		c.display();

	}

}
