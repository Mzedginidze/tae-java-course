/* @author მარიამი ზედგინიძე */

package homework4;

public class SumOfDigits {
    public static void main(String[] args){
        int sum=0;
        int birthYear=2005;

        while(birthYear>0){
            sum+=birthYear%10;
            birthYear/=10;
        }

        System.out.println("sum of digits: "+sum);
    }
}
