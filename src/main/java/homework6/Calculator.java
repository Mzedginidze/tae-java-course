/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class Calculator {

    double calculate(double a, double b, char op) {
        double res = 0;
        switch (op) {
            case '+':
                res = a + b;
                break;
            case '-':
                res = a - b;
                break;
            case '*':
                res = a * b;
                break;
            case '/':
                if (b == 0) res = Double.NaN;
                else res = a / b;
                break;
            default:
                System.out.println("invalid operation!");
        }
        return res;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.calculate(10, 3, '+'));
        System.out.println(calc.calculate(10, 0, '/'));
        System.out.println(calc.calculate(10, 3, '*'));

    }
}
