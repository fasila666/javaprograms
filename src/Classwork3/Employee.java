package Classwork3;

public class Employee extends Member {
	 private String specialization;
	 
	 public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
	        super(name, age, phoneNumber, address, salary);
	        this.specialization = specialization;
	    }
	 public String getSpecialization() {
	        return specialization;
	    }
	 public void printDetails() {
	        super.printdetails();
	        System.out.println("Specialization: " + specialization);
	    }

	 }

