package classwork4;

import java.util.Scanner;

public class Minmaxstring {
	
	public static void printMaxNumber(int num1, int num2, int num3) {
        int max = num1;

        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }

        System.out.println("The maximum number is: " + max);
    }
	 public static void printMinNumber(int num1, int num2, int num3) {
	        int min = num1;

	        if (num2 < min) {
	            min = num2;
	        }
	        if (num3 < min) {
	            min = num3;
	        }

	        System.out.println("The minimum number is: " + min);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the first number: ");
	        int num1 = scanner.nextInt();

	        System.out.println("Enter the second number: ");
	        int num2 = scanner.nextInt();

	        System.out.println("Enter the third number: ");
	        int num3 = scanner.nextInt();

	        printMaxNumber(num1, num2, num3);
	        printMinNumber(num1, num2, num3);

	        

	}

}
