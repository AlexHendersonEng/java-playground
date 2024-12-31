
public class Car {
	// Attributes
	String make;
	String model;
	int year;
	String colour;
	double price;
	
	// Constructor
	Car() {
		// Assign parameters to class attributes
		this.make = "Ford";
		this.model = "Mustang";
		this.year = 2020;
		this.colour = "blue";
		this.price = 5.0e4;
	}
	
	// Overloaded constructor
	Car(String make, String model, int year,
			String colour, double price) {
		// Assign parameters to class attributes
		this.make = make;
		this.model = model;
		this.year = year;
		this.colour = colour;
		this.price = price;
	}
	
	// Methods
	void drive() {
		System.out.println(this.make + " driving!");
	}
	
	void brake() {
		System.out.println(this.make + " braking!");
	}
	
	// Overloaded methods
	public String toString() {
		// All objects inherit a toString method by default which will
		// return a string with the memory location of the object.
		return this.make + " " + this.model + " " + this.year + " "
				+ this.colour + " £" + this.price;
	}
	
}
