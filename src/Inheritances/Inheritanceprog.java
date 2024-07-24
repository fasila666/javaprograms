package Inheritances;

class animals{
		
		String color;
	
	public void eat() {
		
		System.out.println("animal is eating");
	}
}
	class dog extends animals{
		String breed="pug";
		
		
		
	
	public void bark() {
		System.out.println("dog is barking");
	}
	}
	public class Inheritanceprog {
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog dg=new dog();
		System.out.println("dog is"+(dg.breed) +(dg.color));
		dg.bark();
		dg.eat();
	}

}
