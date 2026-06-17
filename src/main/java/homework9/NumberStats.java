/**
 * @author მარიამი ზედგინიძ
 */

package homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberStats {

    static int findMax(List<Integer> list) {
        if (list.isEmpty()) throw new IllegalArgumentException("list is empty");
        Integer max = list.getFirst();

        for (Integer num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    static int findMin(List<Integer> list) {
        if (list.isEmpty()) throw new IllegalArgumentException("list is empty");
        Integer min = list.getFirst();

        for (Integer num : list) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    static double average(List<Integer> list) {
        if (list.isEmpty()) throw new IllegalArgumentException("list is empty");

        Integer sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return (double) sum / list.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, -2, 3, 6, 5));

        System.out.println("Max: " + findMax(numbers));
        System.out.println("Min: " + findMin(numbers));
        System.out.println("Average: " + average(numbers));

    }
}
