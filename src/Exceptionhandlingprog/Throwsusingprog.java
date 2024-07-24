package Exceptionhandlingprog;

import java.util.Scanner;

class AgeLimitException extends RuntimeException{
	public AgeLimitException(String msg){
		super(msg);
	}
}

public class Throwsusingprog {

	public static void main(String[] args) throws AgeLimitException {
		// TODO Auto-generated method stub
// try used to catch the exceptions
		try {
		Scanner scan=new Scanner(System.in);
		System.out.println("ente the age");
		int age=scan.nextInt();
		
		if(age<18) {
	// throw used to declare exception		
			throw new AgeLimitException("not aligible for vote");
		}
		else {
			System.out.println(" aligible for vote");
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("hello......");	
		
	
	}

}
