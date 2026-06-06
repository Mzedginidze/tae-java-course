/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double w,double h){
        if(w<0 || h<0) {
            System.out.println("invalid data!");
        }
        else{
            this.width = w;
            this.height = h;
        }
    }

    @Override
    public double area(){
        return this.width*this.height;
    }

    public static void main(String []args){
       System.out.println(new Rectangle(4, 5).area());
    }
}
