
public class Person {
	// Attributes
	String name;
	int age;
	
	// Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Methods
	public String toString() {
		// Override the toString method
		return name + ", " + age;
	}
}
