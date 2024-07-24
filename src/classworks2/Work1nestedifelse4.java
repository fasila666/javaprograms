package classworks2;

import java.util.Scanner;

public class Work1nestedifelse4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// check the given number is greater than 100
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=scan.nextInt();
		
		if(number>100) {
			System.out.println("number is greater than 100 =" +"\t" +number);
			}
		else if(number>=50) {
				System.out.println("number is greater than  and equalto 50 "
						+ "but less than 100 =" +"\t" +number);
				
			}
		else {
			System.out.println("number is lessthan  50 =" +"\t" +number);
		}
	}

}
