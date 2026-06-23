/**
 * @author მარიამი ზედგინიძე
 **/

package homework10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names=List.of("Ani","mariami","saloMe");

        names.forEach(System.out::println);

        System.out.println("--------------------------");

        List<String>namesToUpperCase=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(namesToUpperCase);
        System.out.println("--------------------------");


        List<Integer>integers= Stream.of("1","2","3")
                .filter(s -> s.matches("-?\\d+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        System.out.println(integers);
    }
}
