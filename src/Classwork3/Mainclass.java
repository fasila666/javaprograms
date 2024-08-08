package Classwork3;

public class Mainclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Parent parent = new Parent();
	        System.out.println("Calling parent class method using parent class object:");
	        parent.printParentMessage();

	        // 2. Create an object of the child class and call its method
	        Child child = new Child();
	        System.out.println("\nCalling child class method using child class object:");
	        child.printChildMessage();

	        // 3. Call the method of the parent class using the object of the child class
	        System.out.println("\nCalling parent class method using child class object:");
	        child.printParentMessage();
	}

}
