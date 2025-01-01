
// The abstract keyword means this class cannot be instantiated
// but can be extended
public abstract class Vehicle {

	// Abstract methods must be defined in subclasses
	abstract void go();
	
	// Non-abstract methods will be inherited by subclasses
	void stop() {
		System.out.println("Vehicle stopped!");
	}
}
