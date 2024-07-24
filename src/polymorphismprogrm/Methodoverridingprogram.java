package polymorphismprogrm;


class birds1{
	
	public void sound() {
		
		System.out.println("tweet... tweet");
	}
}

class crow extends birds1{
	
	public void sound() {
		System.out.println("kaaa...kaaa");
		
	}
}
public class Methodoverridingprogram {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//crow ro=new crow();
	// ro.sound();
		
	birds1 br=new birds1();
	br.sound();
	
	}

}
