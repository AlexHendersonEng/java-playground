/*
	Encapsulation: Makes sure sensitive data is hidden from users. This achieved 
				   through declaring class variables/attributes as private and 
				   providing public get and set methods to access and update the 
				   value of a private variable.
*/

public class Main {
	
	public static void main(String[] args) {
		// Generate car object
		Car car = new Car("Make", "Model", 1234);
		
		// Set car attributes using setters
		car.setMake("Make1");
		car.setModel("Model1");
		car.setYear(4321);
		
		// Get car attributes using getters
		System.out.println("Car make: " + car.getMake());
		System.out.println("Car model: " + car.getModel());
		System.out.println("Car year: " + car.getYear());
	}

}
