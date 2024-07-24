package javaprojects;

public class StaticVariable {
	static String course= "software testing";
	String name;
	int id;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticVariable ob=new StaticVariable();
		System.out.println("name is :"+(ob.name="fas"));
		System.out.println("id is :"+(ob.id=101));
		System.out.println("course is :"+course);
		
		StaticVariable ob1=new StaticVariable();
		System.out.println("name is :"+(ob1.name="adharsh"));
		System.out.println("id is :"+(ob1.id=102));
		System.out.println("course is :"+course);
	}

}
