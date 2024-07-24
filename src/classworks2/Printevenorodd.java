package classworks2;

import java.util.Scanner;

public class Printevenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("input a number");
		int num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println("number is even");
			System.out.println(1);
			
		}
		else {
			System.out.println("number is odd");
			System.out.println(0);
		}
			
	}

}
