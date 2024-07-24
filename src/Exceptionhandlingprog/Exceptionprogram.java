package Exceptionhandlingprog;

public class Exceptionprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("haiiiii....");
		try {
			int arr[]= {1,2,3,4};
			System.out.println(arr[10]);
			
			int num=10;
			int a=num/0;
			System.out.println(a);
		}
		catch(ArithmeticException e1) {
			System.out.println(e1);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println(e2);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("java program");
		}
		System.out.println(" welcome to java");
		}

}
