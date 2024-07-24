package classworks2;

public class Usingnextedswitch {

	public static void main(String[] args) {
// Using nexted switch
		System.out.println(" 1.schoole of computer sceince\n   a.depart of informatics\n   b.depart of machinelearning\n");
		System.out.println(" 2.schoole of business\n    a.depart of commerce\n    b.depart of purchasing\n");
		System.out.println(" 3.schoole of engineering\n    a.depart of mech\n    b.depart of mechatronics\n");
           int deptid=2;
           char course='b';
           
           switch(deptid) {
           
           			case 1: System.out.println("school of computer science");
           				
           
           				switch(course) {
           				case 'a':System.out.println( "\t" +"department of informatics");
           				break;
           	
           				case 'b':System.out.println("\t"+"depart depart of machinelearning");
           				break;
           	
           				default :System.out.println("invalid input");
           	 
          
           			}
          	
	
           break;   
           			case 2: System.out.println("schoole of business");
           			switch(course) {
           			
           			
           			
           			case 'a':System.out.println("department of commerse ");
           			break;
           	
           			case 'b':System.out.println("department of purchasing");
           			break;
           	
           			default :System.out.println("invalid input");
           			}
           break;
           
           			case 3: System.out.println("schoole of engineering");
           			switch(course) {
           			
           			case 'a':System.out.println("depart of mech ");
           			break;
           	
           			case 'b':System.out.println("depart of machine learning");
           			break;
           	
           			default :System.out.println("invalid input");
           			
           			
           			}
           		break;
           }
} 
}