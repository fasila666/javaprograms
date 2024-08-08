package Classwork3;

public class Mager extends Member{
	private String department;
	
	 public Mager(String name, int age, String phoneNumber, String address, double salary, String department) {
	        super(name, age, phoneNumber, address, salary);
	        this.department = department;
	    }
	 public String getDepartment() {
	        return department;
	    }
	 public void printDetails() {
	        super.printDetails();
	        System.out.println("Department: " + department);
	    }
	    

	
}
