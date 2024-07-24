package arrayprograms;

import java.util.Scanner;

public class Arrayswithscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, size;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a size");
		 size = scanner.nextInt();
		 
		 int[] array = new int[size];
		 System.out.println("Enter the elements of the array: ");
		 for ( i = 0; i < size; i++) {
			 
			 array[i] = scanner.nextInt();
			 
		 }
		 System.out.println("The elements of the array are: ");
		 for ( i = 0; i < size; i++) {
			 System.out.print(array[i] + " ");
			 
		 }
		

	}

}
