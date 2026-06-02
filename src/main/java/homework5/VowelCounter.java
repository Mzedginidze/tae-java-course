/**
 * @author მარიამი ზედგინიძე
 */

package homework5;

public class VowelCounter {

    public static int countVowels(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            switch (Character.toLowerCase(s.charAt(i))) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                    break;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Mariami Zedginidze"));
    }
}
