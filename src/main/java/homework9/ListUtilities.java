/**
 * @author მარიამი ზედგინიძ
 */

package homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListUtilities {
    static <T> void printList(List<T> list) {
        for (T value : list) {
            System.out.println(value);
        }
    }

    static <T> T getFirst(List<T> list) {
        return list.getFirst();
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>(Arrays.asList("mariami", "zedginidze", "java"));
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        printList(stringList);
        System.out.println("First Element: " + getFirst(stringList));
        System.out.println("--------------------------");

        printList(integerList);
        System.out.println("First Element: " + getFirst(integerList));
    }
}
