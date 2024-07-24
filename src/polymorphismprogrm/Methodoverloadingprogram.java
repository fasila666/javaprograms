package polymorphismprogrm;

public class Methodoverloadingprogram {
	
	public void add() {
		
		
	int	a=20;
    int b=10;
	int	c=a+b;
	
	System.out.println(c);
	}
	
	public void add(int a, int b) {
		
		System.out.println(a+b);
	}
	public void add(int a, float b) {
		
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Methodoverloadingprogram ob=new Methodoverloadingprogram ();
		ob.add(30,30.55f);
		ob.add(30,21);
		ob.add(30, 40);
		
	}

}
