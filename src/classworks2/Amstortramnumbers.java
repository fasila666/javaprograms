package classworks2;

public class Amstortramnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 for (int number = 1; number <= 500; number++) {
	            int sumOfCubes = 0;
	            int temp = number;
	            while (temp != 0) {
	                int digit = temp % 10;
	                sumOfCubes += digit * digit * digit;
	                temp /= 10;
	            }
	            if (sumOfCubes == number) {
	                System.out.println(number);
	            }
	        }
		
	}

	
	

}
