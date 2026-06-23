/**
 * @author მარიამი ზედგინიძე
 **/

package homework10;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public class AuthorAnnotation {
    @Retention(RUNTIME)
    @Target(METHOD)
       public @interface Author{
            String name();
            String date() default "Unknown";
        }

}
