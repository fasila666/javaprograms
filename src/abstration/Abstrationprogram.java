package abstration;

abstract class vehiclees{
	
	public abstract void start();
	public static void speed() {
		
		System.out.println("max speed =120");
		
	}
}
class bikeee extends vehiclees {
	public void start() {
	
		System.out.println("key start");
		
	}
}
class train extends vehiclees{
	
	public void start() {
		System.out.println("press button");
	}
	
}
public class Abstrationprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 bikeee ob=new  bikeee ();
		 ob.start();
		 train ob1=new train();
		 ob1.start();

	}

}
