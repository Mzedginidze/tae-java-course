/**
 * @author მარიამი ზედგინიძე
 */


package homework5;

public class NumberClassifier {

    public static String classify(int n) {
        if (n > 0) return "Positive";
        else if (n < 0) return "Negative";
        else return "Zero";

    }

    public static String classify(double n) {
        String res;
        if (n > 0.0) res = "Positive";
        else if (n < 0.0) res = "Negative";
        else res = "Zero";

        if (n % 1 == 0) {
            res += " · whole";
        } else {
            res += " · Decimal number";
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(classify(-5));
        System.out.println(classify(5));
        System.out.println(classify(-5.0));
        System.out.println(classify(5.0));
        System.out.println(classify(-5.1));
        System.out.println(classify(5.1));
    }
}
