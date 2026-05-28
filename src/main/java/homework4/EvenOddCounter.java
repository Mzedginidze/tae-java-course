/* @author მარიამი ზედგინიძე */

package homework4;

public class EvenOddCounter {
    public static void main(String[] args){
        int birthYear=2005;
        int counterEven=0;
        int counterOdd=0;

        for(int i=1;i<=birthYear%100;i++){
            if(i%2==0)counterEven++;
            else counterOdd++;
        }

        System.out.println("ლუწი რიცხვების რაოდენობა 1 - დან "+birthYear%100+" მდე: "+counterEven);
        System.out.println("კენტი რიცხვების რაოდენობა 1 - დან "+birthYear%100+" მდე: "+counterOdd);
    }
}
