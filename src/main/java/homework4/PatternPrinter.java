/* @author მარიამი ზედგინიძე */

package homework4;

public class PatternPrinter {
    public static void main(String[] args){
        String name="mariami";

        for( int i=0;i<=name.length();i++){
            for(int j=0;j<i;j++)System.out.print("* ");
            System.out.println();
        }
    }
}
