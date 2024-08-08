package classwork4;
class Person {
    // Private instance variables
    private String name;
    private int age;
    private String country;
    
    // Constructor
    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
    }
}

public class Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Person person = new Person("John Doe", 30, "USA");
	         person.displayPersonDetails();
	        person.setName("Jane Doe");
	        person.setAge(28);
	        person.setCountry("Canada");
	        person.displayPersonDetails();

	}

}
