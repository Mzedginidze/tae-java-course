/**
 * @author მარიამი ზედგინიძე
 */

package homework8;

public class FinallyDemo {
    static int readNumber(String s) {
        try {
           return Integer.parseInt(s);
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
            return -1;
        }finally {
            System.out.println("დასრულდა readNumber");
        }
    }

    public static void main(String[] args) {
        System.out.println(readNumber("100"));
        System.out.println("-----------------------");
        System.out.println(readNumber("xyz"));
    }
}
