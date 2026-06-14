/**
 * @author მარიამი ზედგინიძე
 */

package homework8;

public class MultiCatchDemo {
    static void processInput(String input) {
        try {
            int result = Integer.parseInt(input);
            int[] arr = {10, 20};
            System.out.println(arr[result] / result);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        processInput("abc");
        System.out.println("-----------------------");
        processInput("0");
        System.out.println("-----------------------");
        processInput("99");
        System.out.println("-----------------------");
        processInput("1");
    }
}
