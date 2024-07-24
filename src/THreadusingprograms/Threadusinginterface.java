package THreadusingprograms;

// RUNNABLE CLASS IMLEMENTS 
public class Threadusinginterface implements Runnable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		for(int i=1;i<5;i++) {
		Threadusinginterface ob1=new Threadusinginterface();
		
		
//THREAD OBJECT CREATE CHEYYAA		
		Thread ob=new Thread(ob1);
		ob.start();
		ob.sleep(10000);
		}
	}
// ADD FUCTION OVERIDE
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("currently working thread is :" +Thread.currentThread().getName());
		
	}

}
