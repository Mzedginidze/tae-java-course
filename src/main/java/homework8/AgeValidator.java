/**
 * @author მარიამი ზედგინიძე
 */

package homework8;

public class AgeValidator {
    static void validate(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Age outsides of range");
        } else System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            validate(25);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            validate(-5);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
        try {
            validate(200);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
