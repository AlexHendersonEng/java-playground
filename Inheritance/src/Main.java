
public class Main {

	public static void main(String[] args) {
		// Inheritance allows one class to acquire the attributes
		// and methods of another.
		
		// Instantiate car and bicycle objects
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		
		// Call go and stop method inherited from Vehicle
		// superclass
		System.out.print("Car: ");
		car.go();
		System.out.print("Bicycle: ");
		bicycle.stop();
		
		// Print out Car and Bicycle class non-inherited
		// properties
		System.out.println("The car has " + car.wheels +
				" wheels and " + car.doors + " doors.");
		System.out.println("The bicycle has " + bicycle.wheels +
				" wheels and " + bicycle.pedals + " pedals.");

	}

}
