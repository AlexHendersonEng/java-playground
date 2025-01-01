package package2;

import package1.*;

public class Asub extends A {
	
	public static void main(String[] args) {
		// The defaultMessage static attribute of class B
		// can be accessed by the Asub class as it uses the
		// default access modifier and both classes are in the
		// same package.
		System.out.println(B.defaultMessage);
		
		// The protectedMessage static attribute of class A can
		// be accessed by the Asub class as it uses the protected
		// access modifier which means it can be accessed by any
		// subclass of the A class
		System.out.println(A.protectedMessage);
	}
	
}
