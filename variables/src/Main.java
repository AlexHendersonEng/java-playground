
public class Main {

	public static void main(String[] args) {
		// Primitive data types
		boolean a = true; // Either true: 1 or false: 0 (1 bit) 
		byte b = 100; // 127 to -128 (1 byte, 8 bits)
		char c = 'a'; // Single character (2 bytes, 16 bits)
		short d = 100; // 32,767 to -32,768 (2 bytes, 16 bits)
		int e = 100; // 2,147,483,647 to -2,147,483,648 (4 bytes, 32 bits)
		float f = 100.0f; // 3.4028235e+38 to 1.4e-45 (4 bytes, 32 bits)
		long g = 100L; // 9,223,372,036,854,775,807 to -9,223,372,036,854,775,808 (8 bytes, 64 bits)
		double h = 100.0; // 1.7976931348623157e+308 to 4.9e-324 (8 bytes, 64 bits)
		
		// Reference data types
		String i = "Hello";
		
		// Print variables
		System.out.println("boolean: " + a);
		System.out.println("byte: " + b);
		System.out.println("char: " + c);
		System.out.println("short: " + d);
		System.out.println("int: " + e);
		System.out.println("float: " + f);
		System.out.println("long: " + g);
		System.out.println("double: " + h);
		System.out.println("String: " + i);
	}

}
