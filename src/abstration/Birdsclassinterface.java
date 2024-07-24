package abstration;

public class Birdsclassinterface implements Birdss{
	@Override
	public void sounds() {
		// TODO Auto-generated method stub
		System.out.println(" quick.....quick....");
		
	}
	
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Birdsclassinterface b=new Birdsclassinterface();
		b.sounds();
		
		 Birdss ob=new Birdsclassinterface(); // UPCASTING
		 b.sounds();
		
		
	}

	

}
