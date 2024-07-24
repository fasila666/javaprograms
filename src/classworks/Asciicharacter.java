package classworks;

import java.util.Scanner;

public class Asciicharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan =new Scanner (System.in);
		System.out.println("enter the character is");
		 char num=scan.next().charAt(0);
		 
		 int asciivalue= (int) num;
		 
		 System.out.println("ascii values of" +"\t" +num  +" \t" +asciivalue);

	}

}
