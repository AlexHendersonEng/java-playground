/*
	Interface: A completely abstract class that is used to group related methods with
			   empty bodies.
*/

public class Main {

	public static void main(String[] args) {
		// Create mammal, bird and fish objects
		Mammal mammal = new Mammal(); // Implements prey interface
		Fish fish = new Fish(); // Implements predator interface
		Bird bird = new Bird(); // Implements prey and predator interface
		
		// Call methods on objects
		mammal.flee();
		fish.flee();
		fish.hunt();
		bird.hunt();
	}

}
