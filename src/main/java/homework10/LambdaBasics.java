/**
 * @author მარიამი ზედგინიძე
 **/

package homework10;

import java.util.Comparator;
import java.util.function.Predicate;

public class LambdaBasics {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Hello Lambda");

        r.run();
        System.out.println("----------------------------------");

        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println("5 : " + (isEven.test(5) ? "even" : "odd"));
        System.out.println("6 : " + (isEven.test(6) ? "even" : "odd"));

        System.out.println("----------------------------------");

        Comparator<String> byLength = (a, b) -> a.length() - b.length();

        System.out.println("Ani - Mariami : " + (byLength.compare("Ani", "Mariami") > 0 ? "First word is longer" :
                (byLength.compare("ani", "Mariami") < 0 ? "Second word is longer" : "those words are equal by length")));

        System.out.println("word - cat : " + (byLength.compare("word", "cat") > 0 ? "First word is longer" :
                (byLength.compare("word", "cat") < 0 ? "Second word is longer" : "those words are equal by length")));
        System.out.println("school - Window : " + (byLength.compare("school", "window") > 0 ? "First word is longer" :
                (byLength.compare("school", "window") < 0 ? "Second word is longer" : "those words are equal by length")));
    }
}

