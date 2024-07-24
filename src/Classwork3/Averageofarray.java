package Classwork3;

public class Averageofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[]  array= {45, 39, 32, 41, 53};
		 int length=array.length;
		 int sum=0;
		 for(int i=0;i<length;i++) {
			 sum=sum+array[i];
		 }
			 
			float average=sum/length;
			 System.out.println("Average of array elements are="+average);
			
			 
		 
		 
	}

}  
