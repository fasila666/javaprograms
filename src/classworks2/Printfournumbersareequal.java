package classworks2;

import java.util.Scanner;

public class Printfournumbersareequal {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int num1=scan.nextInt();
		
		System.out.println("enter second number");
		int num2=scan.nextInt();
		
		System.out.println("enter third number");
		int num3=scan.nextInt();
		
		System.out.println("enter fourth number");
		int num4=scan.nextInt();
		
		if(num1==num2&&num1==num3&&num1==num4) {
			
			System.out.println("numbers are equal");
			
		}
		else {
			System.out.println("not equal");
			
		}
		
		

	}

}
