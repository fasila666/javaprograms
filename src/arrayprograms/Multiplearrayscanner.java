package arrayprograms;

import java.util.Scanner;

public class Multiplearrayscanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Scanner scan=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=scan.nextInt();
		
		System.out.println("enter the columns");
		int column=scan.nextInt();
		
		int array[][]=new int [rows][column];
		
		System.out.println("elements of array ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
				
			System.out.print("elements at ("+i +" ,"+j +") ");
			System.out.println( "\t ");
			
			 array[i][j]=scan.nextInt();
		}
			System.out.println("the matrix is");
			for( i=0;i<rows;i++) {
				for(int j=0;j<column;j++) {
					
					System.out.print(array[i][j] + " ");
				}
				System.out.println();
				
			}

	}
		scan.close();      */
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        
        int[][] matrix = new int[rows][columns];
        
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
        	for (int j = 0; j < columns; j++) {
        		
        		System.out.print("Element at (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
                
        	}
        	
        	}
        	
        	 System.out.println("The matrix is:");
             for ( int i = 0; i < rows; i++) {
            	 for (int j = 0; j < columns; j++) {
            		 
            		 System.out.print(matrix[i][j] + " \t");
            	 }
            	 System.out.println(); 
             }
	
        
        
     
		
}
}