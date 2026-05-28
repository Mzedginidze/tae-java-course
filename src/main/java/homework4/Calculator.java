/* @author მარიამი ზედგინიძე */

package homework4;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        double a=10;
        double b=0;

        double res=0;

        System.out.println("Enter operation symbol: *, +, - or / and press enter");

        Scanner sc = new Scanner(System.in);
        char op = sc.next().charAt(0);

        switch(op){
            case '*':
                res=a*b;
                break;
            case '+':
                res=a+b;
                break;
            case '-':
                res=a-b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: division by zero");
                    return;
                } else {
                    res = a / b;
                }
                break;
            default:
                System.out.println("operation could not be recognized");
                return;
        }

        System.out.println(a+" "+op+" "+b+" = "+res);
    }
}
