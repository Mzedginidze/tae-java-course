/**
 * @author მარიამი ზედგინიძე
 */

package homework5;

public class MultiplicationTable {

    public static void printTable(int n) {
        int res;
        for (int i = 1; i <= 10; i++) {
            res = n * i;
            System.out.println(n + " * " + i + " = " + res);
        }
    }

    public static void main(String[] args) {
        printTable(2);
    }
}
