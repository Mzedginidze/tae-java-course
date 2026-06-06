/* @author მარიამი ზედგინიძე */

package homework4;

public class PrimeCheck {
    public static void main(String[] args){
        int age=21;
        boolean isPrime=true;

        for(int i=2;i<age/2;i++){
            if(age%i==0) {
                isPrime = false;
                System.out.println(i);
                break;
            }
        }
        System.out.println("number "+age+" is "+(isPrime?"a prime":"not a prime")+" number");
    }
}
