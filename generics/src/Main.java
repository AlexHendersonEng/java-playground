/*
	generics: Allows types (classes and interfaces) to be parameterised when defining.
			  This eliminates the needs to generate multiple versions of methods or 
			  classes for various reference data types.
*/

public class Main {

	public static void main(String[] args) {
		// Create arrays of different reference data types
		Integer[] intArray = {1, 2, 3, 4, 5};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
		String[] stringArray = {"B", "Y", "E"};
		
		// Print out arrays using generic printArray method
		System.out.println("Integer Array: ");
		printArray(intArray);
		System.out.println();
		//
		System.out.println("Double Array: ");
		printArray(doubleArray);
		System.out.println();
		//
		System.out.println("Character Array: ");
		printArray(charArray);
		System.out.println();
		//
		System.out.println("String Array: ");
		printArray(stringArray);
		System.out.println();
		
		// Get first element of arrays using generic getFirst method
		System.out.print("Integer Array First Element: ");
		System.out.println(getFirst(intArray));
		System.out.println();
		//
		System.out.print("Double Array First Element: ");
		System.out.println(getFirst(doubleArray));
		System.out.println();
		//
		System.out.print("Character Array First Element: ");
		System.out.println(getFirst(charArray));
		System.out.println();
		//
		System.out.print("String Array First Element: ");
		System.out.println(getFirst(stringArray));
		System.out.println();
		
		// Instantiate generic class and print value
		MyGenericClass<Integer> myClass = new MyGenericClass<Integer>(10);
		System.out.println("Generic Class Value: " + myClass.getValue());
	}
	
	// Generic method for printing an array of any reference data type
	public static <T> void printArray(T[] array) {
		for (T x : array) {
			System.out.println(x);
		}
	}
	
	// Generic method for returning first element of array of any reference data type
	public static <T> T getFirst(T[] array) {
		return array[0];
	}
}
