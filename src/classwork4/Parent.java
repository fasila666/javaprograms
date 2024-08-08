package classwork4;


class Parentis {
    void printParent() {
        System.out.println("This is parent class");
    }
}

class Child extends Parentis {
    void printChild() {
        System.out.println("This is child class");
    }
}

public class Parent {
	
	public static void main(String[] args) {
        // Creating an object of Parent class
        Parentis p = new Parentis();
        // Calling the method of Parent class by the object of Parent class
        p.printParent();
        
        // Creating an object of Child class
        Child child = new Child();
        // Calling the method of Child class by the object of Child class
        child.printChild();
        
        // Calling the method of Parent class by the object of Child class
        child.printParent();
    }
	

}
	
