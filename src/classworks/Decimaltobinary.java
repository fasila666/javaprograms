package classworks;

import java.util.Scanner;

public class Decimaltobinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the decimalnumber");
		int n=scan.nextInt();
		String c=" ";
		while(n>0) {
			
			int rem=n%2;
			c=rem+c;
			n=n/2;
			}
	
		System.out.println("binary  number is"+c);
	}

}
