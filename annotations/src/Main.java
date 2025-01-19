/*
	annotations: A form of metadata that provides additional information about the code.
				 They do not affect the program's execution directly but can be used 
				 by the compiler or runtime to enforce certain behaviours or perform 
				 certain operations. Annotations use the '@' symbol syntax.
*/

public class Main {
	// Using the custom annotation
    @MyAnnotation(value = "Custom Annotation Applied")
    public void myAnnotatedMethod() {
        System.out.println("Method with @MyAnnotation executed.");
    }

    public static void main(String[] args) throws Exception {
    	// Instantiate Main object
        Main example = new Main();
        example.myAnnotatedMethod();

        // Reflectively access the annotation
        MyAnnotation annotation = example.getClass()
                                         .getMethod("myAnnotatedMethod")
                                         .getAnnotation(MyAnnotation.class);
        
        // Print out annotation value
        if (annotation != null) {
            System.out.println("Annotation value: " + annotation.value());
        }
    }
}
