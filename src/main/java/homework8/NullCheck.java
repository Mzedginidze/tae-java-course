/**
 * @author მარიამი ზედგინიძე
 */

package homework8;

public class NullCheck {
    int safeLength(String s) {
        try {
            return s.length();
        } catch (NullPointerException e) {
            System.out.println("null სტრიქონი");
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(new NullCheck().safeLength("hello"));
        System.out.println("-----------------------");
        System.out.println(new NullCheck().safeLength(null));

    }
}
