package javaprojects;

import java.util.Scanner;

public class SwitchCases {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//SWITCHCASES
		/*String browser="chrom";
		switch(browser) {
		
		case "safari": System.out.println("safari browser");
		break;
		
		case "edge": System.out.println("edge browser");
		break;
		
		case "chrom": System.out.println("chrom browser");
		break;
		
		
		default	: System.out.println("not supported browsers");
		
		
		} 
		
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a day :");
	int day =scan.nextInt();
		
	 
	 switch(day) {
	 
	 case 1 :System.out.println("today is monday");
	 break;
	 
	 
	 case 2 :System.out.println("today is tuesday");
	 break;
	 
	 
	 case 3 :System.out.println("today is wedneday");
	 break;
	 
	 
	 
	 case 4 :System.out.println("today is thursday");
	 break;
	 
	 
	 
	 case 5 :System.out.println("today is friday");
	 break;
	 
	 case 6:System.out.println("today is saturday");
	 break;
	 
	 
	 case 7:System.out.println("today is sunday");
	 break;
	 
	 
	 
	 default : System.out.println("its not fount");
	 
	 
	 }    */
	 
	 
	 
	 
	 //NESTED SWITCH
	 
	 
	 System.out.println("1.PG \n  a.MTEC\n  b.MBA\n  c.MCA\n");
	 System.out.println("1.UG \n  a.BTEC\n  b.MCA\n  c.BBA\n");
	 
	 int grad =2;
	 char course='b';
	 
	 
	 
	 switch(grad) {
	 
	 
	 case 1: System.out.println("PG");
	 
	 		switch(course) {
	 		case 'a': System.out.println("MTEC");
	 		break;
	 		
	 		
	 		case 'b': System.out.println("MBA");
	 		break;
	 		
	 		
	 		case 'c': System.out.println("MCA");
	 		break;
	 		
	 		default : System.out.println("invalid input");
	 		
	 		}
	 		
	 break;
	 
	 case 2: System.out.println("UG");
	 
	 
	 switch(course) {
		case 'a': System.out.println("BTECH");
		break;
		
		
		case 'b': System.out.println("BCA");
		break;
		
		
		case 'c': System.out.println("BBA");
		break;
		
		default : System.out.println("invalid input");
		
		}
	 
	 break;
	 		
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	}

}
