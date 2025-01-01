
public class Main {

	public static void main(String[] args) {
		// The static keyword is a modifier which means a single copy
		// of a variable/method is created and shared among all
		// objects of a certain class.
		
		// Create friend objects
		new Friend("Bob");
		new Friend("Fred");
		new Friend("Tod");
		
		// Modify numberOfFriend static variable
		Friend.numberOfFriends++;
		
		// Print number of friends using static method
		Friend.displayNumberOfFriends();
	}

}
