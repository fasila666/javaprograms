package thiskeyword;

public class Uingthiskeyword {
	
	// instance variable
	String name;
	String email;
	int id;
	
	public Uingthiskeyword(String name,String email,int id) {
		
	this.name=name;
	this.email=email;
	this.id=id;
	}
public void print() {
		
		System.out.println("name is"+name);
		System.out.println("email is"+email);
		System.out.println("id is"+id);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thiskeywordsprog ob=new Thiskeywordsprog("fasila","fathimathulfasila9@gmail.com",1998);
		ob.print();   

	}

}
