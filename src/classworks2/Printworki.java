package classworks2;

import java.util.Scanner;

public class Printworki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		
		if(num>100) {
			System.out.println("number is greater than 100");
		}
		else if(num<100){
			 
			 System.out.println("number is less than 100");
		}
		 else {
			 System.out.println("number  is equal");
		 }
	}

}
