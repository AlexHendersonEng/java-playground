
public class Hero extends Person {
	// Attributes
	String power;
		
	// Constructor
	Hero(String name, int age, String power) {
		super(name, age); // Call superclass constructor
		this.power = power;
	}
	
	// Methods
	public String toString() {
		// Override the toString method and call superclass
		// toString method
		return super.toString() + ", " + power;
	}
}
