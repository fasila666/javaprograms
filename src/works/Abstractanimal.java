package works;

abstract class Animal {
    abstract void sound();
}
class Lion extends Animal {

	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("Lion roars");
	}
	
}
class Tiger extends Animal {

	@Override
	void sound() {
		// TODO Auto-generated method stub
		 System.out.println("Tiger growls");
	}
	
}

public class Abstractanimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Animal lion = new Lion();
	        Animal tiger = new Tiger();

	        lion.sound(); // Output: Lion roars
	        tiger.sound(); // Output: Tiger growls
	}

}
