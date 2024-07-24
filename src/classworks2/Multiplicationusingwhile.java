package classworks2;

public class Multiplicationusingwhile {

	public static void main(String[] args) {
		int[] numbers = {24, 50, 29};
		 int Size = 10; 
		 
		 for (int num : numbers) {
	            System.out.println("Multiplication table for " + num + ":");
	            int i = 1;
	            while (i <= Size) {
	                System.out.println(num + " x " + i + " = " + (num * i));
	                i++;
	            }
	            System.out.println();
		 }
		

	}

}
