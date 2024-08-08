package classwork4;

import java.util.Scanner;

public class Votingeligleusingmethod {
	
	public static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        checkVotingEligibility(age);

        scanner.close();

	}

}
