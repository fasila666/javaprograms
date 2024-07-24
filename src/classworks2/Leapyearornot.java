package classworks2;

import java.util.Scanner;

public class Leapyearornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a year");
		int year=scan.nextInt();
		
		boolean isleapyear=false;
		if(year%4==0) {
			if(year%100!=0 || year%400==0) {
				isleapyear=true;
				
			}
		}
		if(isleapyear) {
			System.out.println("is a leapyaer"+year);
		}
		else {
			System.out.println("is not a leapyear"+year);
		}
			
	}

}
