package Classwork3;

public class Main {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Employee employee = new Employee("Alice", 30, "123-456-7890", "123 Main St", 50000.0, "Software Engineering");
		 
		 Mager manager = new Mager("Bob", 45, "987-654-3210", "456 Elm St", 75000.0, "IT");
		 
		 System.out.println("Employee Details:");
	        employee.printDetails();
	        
	        // Print details of Manager
	        System.out.println("\nManager Details:");
	        manager.printDetails();
		
	}

}
