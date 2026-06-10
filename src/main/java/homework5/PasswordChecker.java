/**
 * @author მარიამი ზედგინიძე
 */


package homework5;

public class PasswordChecker {

    public static boolean isStrong(String password) {
        boolean isLengthGreaterThenEight = false;
        boolean hasDigit = false;
        boolean hasUppercase = false;

        if (password.length() >= 8) isLengthGreaterThenEight = true;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                hasDigit = true;
                break;
            }
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                hasUppercase = true;
                break;
            }
        }
        return isLengthGreaterThenEight && hasDigit && hasUppercase;
    }


    public static void main(String[] args) {
        System.out.println(isStrong("Hello123"));
        System.out.println(isStrong("Hello1"));
        System.out.println(isStrong("HELLO123"));

    }
}
