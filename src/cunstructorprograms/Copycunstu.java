package cunstructorprograms;

public class Copycunstu {
	
	float area;
	public Copycunstu(float pi,int r) {
		
		area=pi*r*r;
		}
	
	public void display() {
		
		System.out.println(" arae of circle is " +area );
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Copycunstu 	 ob=new  Copycunstu(3.14f,2);
		ob.display();
		
		
		Copycunstu 	 ob2=ob;
		ob2.display();
		
	}

}
