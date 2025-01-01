package package2;

import package1.*;

public class B {
	// The default access modifier means the item can only be
	// accessed by classes in the same package.
	static String defaultMessage = "Default message";
	
	// The public access modifiers means the item can be accessed
	// across all packages.
	public static String publicMessage = "Public message";
}

