/* @author მარიამი ზედგინიძე */


package homework4;

public class Factorial {
    public static void main(String[] args){
        short birthMonth=7;
        long res=1;
        if (birthMonth < 0) {
            System.out.println("Factorial is undefined for negative numbers");
            return;
        }

        for(int i=1;i<=birthMonth;i++){
          res*=i;
        }
        System.out.println(birthMonth+"! = "+res);
    }
}
