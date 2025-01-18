/*
	throws: Indicates what exception type may be thrown by a method.
*/

public class Main {
	static void checkAge(int age) throws ArithmeticException {
		if (age < 18) {
			throw new ArithmeticException("Access denied");
		}
		else {
			System.out.println("Access granted");
		}
	}

	public static void main(String[] args) {
		checkAge(20);
	}
}
