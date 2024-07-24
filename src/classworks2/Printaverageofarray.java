package classworks2;

public class Printaverageofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1, 4, 17, 7, 25, 3, 100};
        double sum=0;
        System.out.println("original array");
        for(int i=0;i<numbers.length;i++) {
        	sum=sum+numbers[i];
        }
         	double average=(double)sum/numbers.length;
         	System.out.println("the average of array= "+average);
         	System.out.println("the largest number above average is ");
         	
         	 for(int i=0;i<numbers.length;i++) {
         		 if(numbers[i]>average) {
         			 System.out.println(numbers[i]);
         		 }
         	 }
    	}
	}


