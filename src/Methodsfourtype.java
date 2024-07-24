import java.util.Scanner;

public class Methodsfourtype {
	
	
// FUCTIONWITH PARAMETER WITH NO RETURN TYPE	
   	public void even(int n) {
		
		
		if(n%2==0) {
			System.out.print("even numbers");
		}
		else {
			
			System.out.print("odd numbers");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Methodsfourtype ob=new Methodsfourtype();
		Scanner scan= new Scanner(System.in);
		System.out.println( " enter the number");
		int n=scan.nextInt();
		ob.even(n);  
		
		
		
		
	
	
	}

}
