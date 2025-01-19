/*
	serialisation: The process of converting an object into a byte stream. This persists
	 			   (saves the state) of the object after the program exits. This byte
	 			   stream can be saved to a file (platform independent .ser) or sent 
	 			   over the network.
	 			   
    transient: Attributes of a class can be marked with 'transient' and this means they
    		   will not be serialised.
	
	deserialisation: The process of converting a byte stream into an object.
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// Instantiate user object
		User user = new User();
		
		// Assign attributes
		user.username = "username";
		user.password = "password";
		
		// Call method
		user.sayHello();
		
		// Get the current file's directory
        Path fileRelPath = Paths.get("");
        String fileCurrDir = fileRelPath.toAbsolutePath().toString();
		
		// Serialize user object
        String serPath = fileCurrDir + "\\src\\UserInfo.ser";
		FileOutputStream fileOut = new FileOutputStream(serPath);
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(user);
		out.close();
		fileOut.close();
		System.out.println("Object serialized to file");
		
		// Deserialize user object
		User user1 = null;
		FileInputStream fileIn = new FileInputStream(serPath);
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user1 = (User)in.readObject();
		in.close();
		fileIn.close();
		System.out.println("Object deserialized from file");
		
		// Use method on deserialized object
		user1.sayHello();
		
		// Delete serialized file
		File myFile = new File(serPath);
		myFile.delete();
		System.out.println("Deleted file");
	}

}
