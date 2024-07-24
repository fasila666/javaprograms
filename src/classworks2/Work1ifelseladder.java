package classworks2;

import java.util.Scanner;

public class Work1ifelseladder {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter mark");
		int mark=scan.nextInt();
		
		if(mark>90) {
			System.out.println("A grade");
		}
		else if(mark>=70 && mark<=89) {
			
			System.out.println("B grade");
		}
		else if(mark>=50 && mark<=69) {
			
			System.out.println("C grade");
			
		}
		else {
			System.out.println("D grade");
		}
	}

}
