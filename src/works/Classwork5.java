package works;


abstract class Shape {
    abstract double calculateArea();
}
class Circle extends Shape {
	
	private double radius;
	
	public Circle(double radius) {
        this.radius = radius;
    }


	@Override
	double calculateArea() {
	
		 return Math.PI * radius * radius;
	}
	
}
class Rectangle extends Shape {
	
	private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

	@Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return length * width;
		}
	
}
class Triangle extends Shape {
	private double base;
    private double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
	double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}
}

public class Classwork5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 8);
        
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Triangle area: " + triangle.calculateArea());

	}

}
