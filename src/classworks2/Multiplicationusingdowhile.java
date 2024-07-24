package classworks2;

public class Multiplicationusingdowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {24, 50, 29};
		 int Size = 10; 
		 
		 for (int num : numbers) {
	            System.out.println("Multiplication table for " + num + ":");
	            int i = 1;
	            
	            do {
	            
	                System.out.println(num + " x " + i + " = " + (num * i));
	                i++;
	                
	            }  while (i <= Size); {
	            	
	            	System.out.println();
	            }
	            
		 }
		

	}

}
