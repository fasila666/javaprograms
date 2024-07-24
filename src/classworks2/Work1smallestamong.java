package classworks2;

import java.util.Scanner;

public class Work1smallestamong {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan =new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1=scan.nextInt();
		
		System.out.println("Enter second number :");
		int num2=scan.nextInt();
		
		System.out.println("Enter third number :");
		int num3=scan.nextInt();
		
		if(num1<num2 && num1<num3) {
			System.out.println("the smallest is "+num1);
		}
		else if (num2<num1 && num2<num3) {
			System.out.println("the smallest is "+num2);
			
		}
		else if(num3<num1 && num3<num2) {
			System.out.println("the smallest is "+num3);
		}
		else {
			System.out.println("the number is not valid");
		}
		
	}

}
