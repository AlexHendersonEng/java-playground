/*
	Lambda expressions: A short block of code that takes in parameters and returns a 
						value with the following formatting:
						parameter -> expression
						(parameter1, parameter2) -> expression
						(parameter1, parameter2) -> { code block }
*/

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Create array list
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    
	    // Use for each method and lambda function to print out each element
	    numbers.forEach(n -> System.out.println(n));
	}
}