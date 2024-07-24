package javaprojects;

public class Loops {
	public static void main(String arg[]) {
		
		// simpleif
		//int n=20;
		//if (n>0) {
			// System.out.println("the large numbers ");
		//}
	// if else	
	//int n=10;	
	// if(n%2==0) {
		// System.out.println("even numbers");
	// }
	// else {
		// System.out.println("odd numbers");
	// }
	 
	 
	 // NESTED IF
	 // SYNTAX 1
	/* int n=20;
	 if(n%2==0) {
		  		if(n>0) {
		  			System.out.println("positive numbers");
		  		}
	 } 
		
	// syntax 2	
	int n=200;	
	if(n%2==0) {
			if(n>0) {
				System.out.println("positive numbers");
			}
			else {
				System.out.println("negative numbers");
			}
				
	} 
		
	// if-else-if ladder
		
		
	String browser="chrom";
	if(browser=="safari") {
		System.out.println("it is safari");
	}
		else if(browser=="chrom") {
			System.out.println("it is chrom");
		}
		else if (browser=="edge") {
			System.out.println("it is edge");
		}
		else {
			System.out.println("invalid statement");
		} */
	
	// OR 
		
		
	String browser="chrom";
	if(browser.equalsIgnoreCase("safari")) {
		System.out.println("it is safari");
	}
		else if(browser.equalsIgnoreCase("chrom")) {
			System.out.println("it is chrom");
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.out.println("it is edge");
		}
		else {
			System.out.println("invalid statement");
		}
	
	
	}

}
