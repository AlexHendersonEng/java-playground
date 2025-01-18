/*
	exception: An event that occurs during the execution of a program that,
	 		   disrupts the normal flow of instructions. Exceptions can be handled
	 		   using the following syntax:
	 		   try { 
	 		       // Code that may throw an error.
	 		   } catch (<ExecutionType> e) { 
	 		       // Code that runs if exception of type <ExecutionType> is thrown.
	 		   } finally {
	 		       // Code that is executed regardless.
	 		   }
*/

public class Main {

	public static void main(String[] args) {
		// Define try, catch, finally block
		try {
			// Throw exception
			throw new Exception("There has been an exception!");
		} catch (Exception e) {
			// Handle exception
			System.out.println(e);
		} finally {
			// Run code regardless
			System.out.println("This code runs regardless!");
		}
	}

}
