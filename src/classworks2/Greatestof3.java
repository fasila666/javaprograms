package classworks2;

import java.util.Scanner;

public class Greatestof3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		
		System.out.println("enter second number");
		int num2=scan.nextInt();
		
		System.out.println("enter third number");
		int num3=scan.nextInt();
		
		
		
		if(num1>=num2&& num1>=num3) {
			System.out.println("greatest is num1="+num1);
		}
		else if (num2>=num1&&num2>=num3) {
			System.out.println("greatest is nummber= "+num2);
			
		}
		else {
			System.out.println("greatest is number="+num3);
		}

	}

}
