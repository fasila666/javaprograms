package javaprojects;

import java.util.Scanner;

public class Classproblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// WORK : SWAP program
		int a=10;
		int b=50;
		
	    System.out.println(" before swaping a ="  +a + " , b= "+b );
 
	    
	   // using temperory variable
	    
	    int temp=a;
	    a=b;
	    b=temp;
	    
	    System.out.println(" after swaping swaping a ="  +a + " , b= "+b ); 
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
// WORK :  fibnocci series n number
		
		
	/*	int n1=0;
		int n2=1;
		int n=10;
		System.out.println("fibnocci series  " +n    );
		
		for (int i=1; i <=n ; i++) {
			
			
			System.out.println( n1 );
			int nextterm= n1+n2;
			n1=n2;
			 n2= nextterm;
			
			}  
		
		
// WORK : fibnocci series of enter a number from keyboard
		
		
		Scanner sc =new Scanner (System.in);
		
		System.out.println(" enter a number");
		 
		int n= sc.nextInt();
		
		int n1=0;
		int n2=1;
		
		
		
		
		for (int i=1; i <=n ; ++ i) {
			
			System.out.println("fibnocci series of" +n +  "numbers ");
			
			
			System.out.println( n1 + " ," );
			int nextterm= n1+n2;
			n1=n2;
			 n2= nextterm;
		
		
		
		
		}	
		
// WORK :PRINT 10 TO 19
		int n=20;
		for ( int i=10; i<n;i++) {
			
			System.out.println(i);
		} 
		
// WORK :FACTORIAL OF A NUMBER 
		
		int n;
		 int fact=1;
		System.out.println(" enter a number");
		Scanner sc=new Scanner(System.in);
		
		 n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			
			fact=fact*i;
			
		}
		System.out.println( " factorial of a number is " + fact);    
		
		
		
// work factorial of a number	
		
		int fact=1 ;
		int n=5;
		int i;
		
		for (i=1;i<=n;i++) {
			
			fact=fact*i;
			System.out.println("fact is " +i +  "\t"  +fact );
		}
		
		
		
// Reverse of a digit 12345
		
		Scanner scan= new Scanner(System.in);
		int reverse=0;
		System.out.println(" enter the number");
		
		int num=scan.nextInt();
		while(num>0)
		{
			int remainder =num%10;
			reverse=reverse *10+remainder;
			num=num/10;
		}   
		
		System.out.println("reversed number is" + " \t "+reverse  );	*/
// REVERSED A NUMBER
	/*	int rev=0; int num1=1234;
		while(num1>0) {
			
			int remain =num1%10;
			rev=rev*10+remain;
			num1=num1/10;
		
			
		}
		
		System.out.println("reversed number is" + " \t "+rev  );	 */
	}

	

}
