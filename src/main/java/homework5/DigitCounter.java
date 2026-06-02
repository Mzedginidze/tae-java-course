/**
 * @author მარიამი ზედგინიძე
 */

package homework5;

public class DigitCounter {

    public static int countDigits(int n) {
        int counter = 0;

        while (Math.abs(n) > 0) {
            counter++;
            n /= 10;
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(2005));
    }
}
