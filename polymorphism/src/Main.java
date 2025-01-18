/*
	Polymorphism: The ability of an object to identify as more than one type.
*/

public class Main {

	public static void main(String[] args) {
		// Generate car, bicycle and boat objects
		Car car = new Car();
		Bicycle bicycle = new Bicycle();
		Boat boat = new Boat();
		
		// Store in vehicle array as all objects inherit from the vehicle class
		Vehicle[] racers = {car, bicycle, boat};
		
		// Loop over racers and call go method
		for (Vehicle vehicle : racers) {
			vehicle.go();
		}
	}

}
