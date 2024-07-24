package Exceptionhandlingprog;

import java.util.Scanner;

public class Exceptionhandlingpro {
	Scanner scan=new Scanner(System.in);
	public void print() {
	//	try {
			System.out.println(" enter a number");
			int num=scan.nextInt();
	//	}
	//	catch(Exception e) {
			
	//		System.out.println("enter a valid number");
		}
//	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Exceptionhandlingpro ob=new Exceptionhandlingpro ();
			ob.print();

		}
		catch(Exception e) {
			System.out.println("enter a valid number");
			
		}
	}

}
