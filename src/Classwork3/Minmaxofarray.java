package Classwork3;

import java.util.Scanner;

public class Minmaxofarray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of elements in the array:");
	        int n = sc.nextInt();
	        int[] arr = new int[n];

	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        
	        System.out.println("Maximum value in the array is: " + max);
	        System.out.println("Minimum value in the array is: " + min);

	}

}
