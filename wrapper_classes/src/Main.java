
public class Main {

	public static void main(String[] args) {
		// A wrapper class provides a way to use primitive data types
		// as reference data types. Reference data types offer some
		// useful methods but are more computationally expensive to
		// work with than primitive data types.
		//
		// Primitive | Wrapper
		// ---------------------
		// boolean   | Boolean
		// char      | Character
		// int       | Integer
		// double    | Double
		//
		// Autoboxing = The automatic conversion the Java complier 
		//              makes between the primitive and their
		//              corresponding object wrapper class
		// Unboxing = The reverse of autoboxing. Automatic conversion
		//            wrapper class to primitive
		
		// Autoboxing example
		Boolean a = true;
		Character b = 'a';
		Integer c = 123;
		Double d = 3.14;
		System.out.println("Autoboxing:");
		System.out.println("Boolean: " + a + ", Character: " + b +
						   ", Integer: " + c + ", Double: " + d);
		
		// Unboxing example
		boolean e = a;
		char f = b;
		int g = c;
		double h = d;
		System.out.println("Unboxing:");
		System.out.println("boolean: " + e + ", char: " + f +
						   ", int: " + g + ", double: " + h);
		
	}

}
