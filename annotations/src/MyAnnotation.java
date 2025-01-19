import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// The annotation can only be applied to methods
@Target(ElementType.METHOD)

// The annotation will be available at runtime
@Retention(RetentionPolicy.RUNTIME)

public @interface MyAnnotation {
    String value();  // This is an element of the annotation
}
