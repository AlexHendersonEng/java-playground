
public class Main {

	public static void main(String[] args) {
		// Method overriding allows a child class to override a
		// method defined in the parent class.
		
		// Instantiate animal object and call speak method
		Animal animal = new Animal();
		animal.speak();
		
		// Instantiate dog object and call overridden speak
		// method
		Dog dog = new Dog();
		dog.speak();
	}

}
