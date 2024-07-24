package polymorphismprogrm;
class variables{
	final public void displays() {
		
		System.out.println("pi=3.1444");
	}
}

public class Finalkeywords extends variables  {
	
	public void display() {
		System.out.println("pi=3.14");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalkeywords c=new Finalkeywords();
		c.display();
	}

}
