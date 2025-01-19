
public class Main {

	public static void main(String[] args) {
		// Define int and double variables
		int myInt = 9;
	    double myDouble = myInt; // Implicit casting int to double
	    double myDouble1 = (int)myInt; // Explicit casting int to double
	    
	    // Print out values
	    System.out.println(myInt);      // Outputs 9
	    System.out.println(myDouble);   // Outputs 9.0
	    System.out.println(myDouble1);	// Outputs 9.0
	}

}
