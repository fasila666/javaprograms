package works;

abstract class Shapes {
    abstract double area();
}
class vattamz extends Shapes {
	
	
	
	private double radius;

    public vattamz(double radius) {
        this.radius = radius;
    }

	@Override
	double area() {
		// TODO Auto-generated method stub
		 return Math.PI * radius * radius;
	}
	
}
class chadhuram extends Shapes {
	
	private double length;
    private double width;

    public chadhuram(double length, double width) {
        this.length = length;
        this.width = width;
    }

	@Override
	double area() {
		// TODO Auto-generated method stub
		return length * width;
	}
	
}

public class Abstractclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shapes circle = new vattamz(5);
        Shapes rectangle = new chadhuram(4, 6);
        
        System.out.println("Circle area: " + circle.area());
        System.out.println("Rectangle area: " + rectangle.area());

	}

}
