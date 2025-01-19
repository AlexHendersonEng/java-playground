/*
	records: A special kind of class designed to hold immutable data. They simplify the
			 the creation of data carrying classes by eliminating boilerplate code like
			 getters, toString(), hashCode() and equals() methods. When a record is
			 declared the compiler automatically generates these methods for you along
			 with a constructor that takes all the fields as parameters.
*/

public class Main {

	public static void main(String[] args) {
		// Create an instance of the record
        Person person = new Person("Person", 20);

        // Access fields using accessor methods
        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());

        // Automatic toString() method
        System.out.println(person);

        // Equals and hashCode demonstration
        Person anotherPerson = new Person("Person", 20);
        System.out.println("Are they equal? " + person.equals(anotherPerson));
        System.out.println("Hash Code: " + person.hashCode());
	}

}
