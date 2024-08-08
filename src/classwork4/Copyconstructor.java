package classwork4;

public class Copyconstructor {
	
	 private String name;
	    private int age;
	    
	    public Copyconstructor(String name, int age) {
	        this.name = name;
	        this.age = age;
	        }
	    
	    public Copyconstructor (Copyconstructor person) {
	        this.name = person.name;
	        this.age = person.age;
	    }
	    
	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	    public void display() {
	        System.out.println("Name: " + name + ", Age: " + age);
	    }


public static void main(String[] args) {
		
	Copyconstructor  originalPerson = new Copyconstructor ("John Doe", 30);

        
	Copyconstructor copiedPerson = new Copyconstructor (originalPerson);

        // Display details of both original and copied Person objects
        System.out.println("Original Person:");
        originalPerson.display();

        System.out.println("Copied Person:");
        copiedPerson.display();
	}

}
