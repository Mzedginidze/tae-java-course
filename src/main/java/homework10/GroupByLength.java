/**
 * @author მარიამი ზედგინიძე
 **/

package homework10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {
    public static void main(String[] args) {
        List<String> words = List.of("a", "bb", "cc", "ddd", "ee", "fff");

        Map<Integer,List<String >> result=words.stream()
                .collect(Collectors.groupingBy(n->n.length()));

        System.out.println(result);
    }
}
