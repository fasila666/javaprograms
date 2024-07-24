package THreadusingprograms;


class Threadnew extends Thread{
	public void run() {
		
		for(int i=1;i<=5;i++) {
			System.out.println("thread new");
		}
	}
}

public class Extendthreadclasspro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Threadnew t=new Threadnew ();
// start function		
		t.start();
		for(int i=1;i<=5;i++) {
			System.out.println("new thread is");
		}

	}

}
