package javaprojects;

public class Whileprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		/* int i=10;
		while(i<=20) {
			
			
			System.out.println(i);
			i++;
		}

		
		// do while
		
		
		int n=1;
		do  
		
		
		
		
		// BREAK STATEMENTS
		// till print 2
		
		for (int i=0;i<=5;i++) {
			
			
				System.out.println(i);
				if (i==2) {
					
					
					
					break;
				}
				
		}   
		
		// BREAK LABEL
		
	outer:	for (int i=1;i<=3;i++) {
			
			for(int j=1; j<=3 ; j++) {
				
				System.out.println(i + "" + j);
				
				if (i==2 && j==2) {
					
					break outer;
				}
				
			}
			
			
			
			
			
			
			
			
		}   
	
	// continue  print except 2
	
		for(int i=0; i<=3 ;i ++) {
			
			if (i==2) {
				
				continue;
			}
			System.out.println(i);	
		} */
			
		
		
		
		
		// print upto 3 3 except 2 2
		
		
		
		
 outer:		for(int i=1; i<=3;  i++) {
		
			{
				for (int j=1 ; j<=3;  j++) {
						if (i==2 && j==2) {
							
							continue outer;
						}
						System.out.println(i  +  ""  +j );	
				}
			 
			
			}
	}

}
}
