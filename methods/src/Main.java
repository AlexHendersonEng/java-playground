
public class Main {

	public static void main(String[] args) {
		// Define parameters
		String name = "Bob";
		int age = 34;
		
		// Call hello method
		String message = hello(name, age);
	}
	
	static String hello(String name, int age) {
		// Construct message
		String message = "Hello " + name + ". You are " + 
				         age + " years old.";
		
		// Print out message
		System.out.println(message);
		
		// Return message
		return message;
	}

}
