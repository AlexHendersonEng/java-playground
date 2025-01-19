import java.io.Serializable;

public class User implements Serializable {
	
	// The serialization runtime associates a version number, called a serialVersionUID
	// with each serializable class, which is used during deserialization to verify
	// that the sender and receiver of a serialized object have loaded classes for that
	// object that are compatible with respect to serialization.
	private static final long serialVersionUID = 1L;
	String username;
	String password;
	
	public void sayHello() {
		System.out.println("Hello " + username);
	}
}
