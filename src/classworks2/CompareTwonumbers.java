package classworks2;

import java.util.Scanner;

public class CompareTwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int num1=scan.nextInt();
		
		System.out.println("Enter second number");
		int num2=scan.nextInt();
		
		if(num1>num2) {
			System.out.println("first number is not equals to second number="+"\t" +num1 +">"+num2);
		}
		else if (num1<num2) {
			System.out.println("first number is less than than second number ="+num1 +"<"+num2);
		}
		else{
			System.out.println("first number is equals to second number"+num1  +"=" +num2);
		}
	}

}
