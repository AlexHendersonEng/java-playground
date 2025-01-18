import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		// Define the file name
        String fileName = "test.txt";

        try {
            // Step 1: Create the file
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Step 2: Write "Hello World!" to the file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello World!");
            writer.close();
            System.out.println("Successfully wrote to the file.");

            // Step 3: Read the file
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            System.out.println("Reading file content:");
            while ((line = reader.readLine()) != null) {
                // Step 4: Print the content to the command line
                System.out.println(line);
            }
            reader.close();

            // Step 5: Delete the file
            if (file.delete()) {
                System.out.println("File deleted: " + file.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

	}

}
