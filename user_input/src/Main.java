import java.util.Scanner; // Import Scanner for user input functionality

public class Main {

	public static void main(String[] args) {
		// Instantiate scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Ask user for input
		System.out.println("Hello, what is your name?");
		String name = scanner.nextLine();
		
		// Close scanner
		scanner.close();
		
		// Print using user input
		System.out.println("Hello, " + name);
	}

}