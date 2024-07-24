package cunstructorprograms;

public class Parameterizedcons {
	
	
	float area;
	public Parameterizedcons(float pi,int r) {
		
		area=pi*r*r;
		System.out.println(" " +area );
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parameterizedcons ob=new  Parameterizedcons(3.14f,2);
		 
	}

}
