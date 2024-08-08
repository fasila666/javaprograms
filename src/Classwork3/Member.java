package Classwork3;

public class Member {
	
	private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    // Constructor to initialize Member object
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }
    
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }
	public void printdetails() {
		// TODO Auto-generated method stub
		System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);

	}

	public void printDetails() {
		
	}

}
