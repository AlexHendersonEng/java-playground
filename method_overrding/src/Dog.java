
public class Dog extends Animal {
	// Methods
	@Override // Not necessary but is good practice when
			  // overriding a method defined in the parent class
	void speak() {
		System.out.println("The dog barks");
	}

}
