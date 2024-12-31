
public class Main {

	public static void main(String[] args) {
		// Instantiate car object
		Car car1 = new Car();
		Car car2 = new Car("Audi", "R8", 2022, "red",
				8.0e4);
		
		// Print car class attributes
		System.out.println("Car class attributes:");
		System.out.println("Car 1: " + car1.make + " " + car1.model);
		System.out.println("Car 2: " + car2.make + " " + car2.model);
		System.out.println();
		
		// Call car methods
		System.out.println("Car class methods:");
		System.out.print("Car 1: ");
		car1.drive();
		System.out.print("Car 2: ");
		car2.brake();

	}

}
