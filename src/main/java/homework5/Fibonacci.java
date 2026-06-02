/**
 * @author მარიამი ზედგინიძე
 */

package homework5;

public class Fibonacci {

    public static long fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        long x = 0;
        long y = 1;

        long res=0;

        for (int i = 2; i <= n; i++) {
            res = x + y;
            x = y;
            y = res;
        }

        return res;
    }

    public static void main(String[] args) {
System.out.println(fib(21));
    }
}
