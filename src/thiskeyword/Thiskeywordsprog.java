package thiskeyword;

public class Thiskeywordsprog {
	
	
	// instance variable 
	String name;
	String email;
	int id;
// parameterized custructor
	public Thiskeywordsprog(String name,String email,int id) {
		
		name=name;
		email=email;
		id=id;
	}
	
// print method
	public void print() {
		
		System.out.println("name is"+name);
		System.out.println("email is"+email);
		System.out.println("name is"+id);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Thiskeywordsprog ob=new Thiskeywordsprog("fasila","fathimathulfasila9@gmail.com",1998);
		ob.print();   
	}

}
