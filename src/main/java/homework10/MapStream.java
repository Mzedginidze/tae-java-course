/**
 * @author მარიამი ზედგინიძე
 **/

package homework10;

import java.util.List;
import java.util.stream.Collectors;

public class MapStream {
    public static void main(String[] args) {
        List<String> names = List.of("Anna", "Beka", "Cita","Mariami");

        List<String> namesToUpperCase=names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        List<Integer>lengthOfNames=names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(namesToUpperCase);
        System.out.println(lengthOfNames);
    }
}
