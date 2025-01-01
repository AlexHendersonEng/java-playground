
public class Car extends Vehicle {

	// The go method must be overrode as it is an abstract method
	// in the parent class
	@Override
	void go() {
		System.out.println("The car is moving!");
	}
	
}
