/**
 * @author მარიამი ზედგინიძე
 */

package homework8;

public class ArrayReader {
    public static int readSafe(int[] arr, int index) {
        try {
            return arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ინდექსი არასწორია: " + index);
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        System.out.println(readSafe(nums, 1));
        System.out.println("-----------------------");
        System.out.println(readSafe(nums, 10));
    }
}
