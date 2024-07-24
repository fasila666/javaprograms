package THreadusingprograms;

public class Theadusingprog {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("current thread is" +t);
		System.out.println(" thread name  is"+t.getName());
		
		t.setName("my thread");
		System.out.println(" after changing the thread" +t);
		System.out.println("new thread is" +t.getName());
		
		for(int n=5;n>=1;n--) {
			System.out.println(n);
	//		Thread.sleep(1000);
			t.sleep(10000);
		}
		
		
	}

}
