package Classwork3;

public class Circle {
	
	private double radius;
	
	 public Circle(double radius) {
	        this.radius = radius;
	    }
	 public double getRadius() {
	        return radius;
	    }
	 public double getArea() {
	        return Math.PI * radius * radius;
	    }
	 
	 public void display() {
	        System.out.println("Radius: " + radius + ", Area: " + getArea());
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle1 = new Circle(2.0);
        Circle circle2 = new Circle(12.0);
        Circle circle3 = new Circle(24.0);

        // Display the radius and area of each Circle object
        System.out.println("Circle 1:");
        circle1.display();

        System.out.println("Circle 2:");
        circle2.display();

        System.out.println("Circle 3:");
        circle3.display();

	}

}
