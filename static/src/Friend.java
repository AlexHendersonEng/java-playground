
public class Friend {
	// Attributes
	String name;
	static int numberOfFriends;
	
	// Constructor
	Friend(String name) {
		this.name = name;
		numberOfFriends++;
	}
	
	// Static method
	static void displayNumberOfFriends() {
		System.out.println("Number of friends: " + numberOfFriends);
	}
}
