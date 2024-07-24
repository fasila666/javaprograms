package javaprojects;

import java.util.Scanner;

public class InputingusingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER YOUR NAME IS");
		String name=scan.next();
		System.out.println("name :"+name);
		
		
		Scanner scan1 = new Scanner(System.in);
		System.out.println("ENTER YOUR id is");
		int id=scan1.nextInt();
		System.out.println("id is :"+id);
		
		
		Scanner scan2= new Scanner(System.in);
		System.out.println("course is");
		String course=scan2.next();
		System.out.println("course is :"+course);
		
		Scanner scan3 = new Scanner(System.in);
		System.out.println("ENTER YOUR fee is");
		int fees=scan3.nextInt();
		System.out.println("fees is :"+fees);
	}

}
