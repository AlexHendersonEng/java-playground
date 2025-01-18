public class Car {
	// Declare private attributes
	private String make;
	private String model;
	private int year;
	
	// Create constructor
	Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	// Define getters for private attributes
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public int getYear() {
		return year;
	}
	
	// Define setters for private attributes
	public void setMake(String make) {
		this.make = make;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
}
