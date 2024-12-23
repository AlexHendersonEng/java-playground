
public class Main {

	public static void main(String[] args) {
		// Define parameters
		String name = "Bob";
		int age = 34;
		double height = 179.4;
		
		// Call hello method
		String message = hello(name, age);
		
		// Call overloaded hello method
		String message1 = hello(name, height);
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
	
	static String hello(String name, double height) // overloaded hello method
	{
		// Construct message
		String message = "Hello " + name + ". You are " + 
				         height + " cm tall.";
		
		// Print out message
		System.out.println(message);
		
		// Return message
		return message;
	}

}
