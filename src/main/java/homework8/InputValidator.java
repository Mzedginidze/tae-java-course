/**
 * @author მარიამი ზედგინიძე
 */


package homework8;

public class InputValidator {
    static int processAge(String input) throws NumberFormatException,
            IllegalArgumentException {
        int age = Integer.parseInt(input);
        if (age < 0) throw new IllegalArgumentException("age can't be less than 0!");
        return age * 12;
    }

    public static void main(String[] args) {
        try {
            System.out.println(processAge("-5"));
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
