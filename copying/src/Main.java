
public class Main {

	public static void main(String[] args) {
		// Create car objects
		Car car1 = new Car("Make", "model", 1234);
		Car car2 = new Car("Make1", "model", 4321);
		
		// Print out car objects
		System.out.println("Car 1: " + car1 + ", model: " + car1.getMake() +
						   ", model: " + car1.getModel() + ", year: " + car1.getYear());
		System.out.println("Car 2: " + car2 + ", model: " + car2.getMake() +
				   		   ", model: " + car2.getModel() + ", year: " + car2.getYear());
		
		// Perform deep copy of car 1 into car 2
		car2.copy(car1);
		System.out.println("Car 2: " + car2 + ", model: " + car2.getMake() +
		   		   		   ", model: " + car2.getModel() + ", year: " + car2.getYear());
		
		// Create car object using copy constructor
		Car car3 = new Car(car1);
		System.out.println("Car 3: " + car3 + ", model: " + car3.getMake() +
		   		   		   ", model: " + car3.getModel() + ", year: " + car3.getYear());

	}

}
