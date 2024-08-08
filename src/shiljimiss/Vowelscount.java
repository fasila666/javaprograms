package shiljimiss;

import java.util.Scanner;

public class Vowelscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		String sc=scan.nextLine();
		
	
		
		int count=0;
		for(int i=0;i<sc.length();i++) {
		    
			char ch=sc.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
				}
			
			}
		 System.out.println("Number of vowels: " +count);
		}
	}