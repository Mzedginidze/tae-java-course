/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class Counter {
    private int count;
    private  int maxValue;

    public Counter(int c, int mv){
        this.count=c;
        this.maxValue=mv;
    }

    public Counter(){
        this(0,100);
    }

    public void increment(){
        if(count<maxValue)this.count++;
        else System.out.println("max value reached!");
    }

    public void reset(){
        this.count=0;
    }

    public void countTo(int target){
        for(int i=0;i<target;i++){
            this.increment();
        }

    }

    public static void main(String[] args) {
        Counter c = new Counter();
        c.countTo(5);
        System.out.println(c.count);

        c.countTo(5);
        System.out.println(c.count);

        c.reset();
        c.countTo(101);
        System.out.println(c.count);
    }
}
