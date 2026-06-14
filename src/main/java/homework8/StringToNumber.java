/**
 * @author მარიამი ზედგინიძე
 */

package homework8;

public class StringToNumber {
    int parseSafe(String s) {
        try {
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("არ არის რიცხვი: " + s);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new StringToNumber().parseSafe("42"));
        System.out.println("-----------------------");
        System.out.println(new StringToNumber().parseSafe("abc"));
        System.out.println("-----------------------");
        System.out.println(new StringToNumber().parseSafe(""));

    }
}
