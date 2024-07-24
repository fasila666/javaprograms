package classworks;

import java.util.Scanner;

public class Equations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number");
		int s=scan.nextInt();
		
		System.out.println("enter second  number");
		int s1=scan.nextInt();
		
		System.out.println("enter third  number");
		int s2=scan.nextInt();
		
		System.out.println("the result is =" +((s+s1)==s2||(s1+s2)==s||(s2+s)==s1));
		
		
		
	}

}
