package classworks;

import java.util.Scanner;

public class Evenorodddusingternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter the number");
		int num=scan.nextInt();
		String evenodd=(num%2==0)? "even" :"odd";
		System.out.println( num +"is a"  + "\t" + evenodd + "number");
		

	}

}
