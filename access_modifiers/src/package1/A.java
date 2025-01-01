package package1;

import package2.*;

public class A {
	
	// The protected access modifier means the item can be 
	// accessed by all subclasses of a given class.
	protected static String protectedMessage = "Protected message";

	// The private access modifier means the item can only be 
	// accessed from within the current class.
	private static String privateMessage = "Private message";
	
	public static void main(String[] args) {
		// The publicMessage static attribute of class B
		// can be accessed by the A class as it uses the
		// public access modifier which means it can be accessed
		// by classes across packages.
		System.out.println(B.publicMessage);
		
		// The privateMessage static attribute of class A can 
		// only be accessed by class A as it uses the private 
		// access modifier which makes it only accessible by the
		// current class.
		System.out.println(A.privateMessage);
	}

}
