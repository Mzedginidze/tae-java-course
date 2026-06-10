/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class Circle extends Shape {
    public double radius;

    public Circle(double r) {
        if (r < 0) System.out.println("Invalid data!");
        else {
            this.radius = r;
        }
    }

    @Override
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }

    public static void main(String[] args) {
        System.out.println(String.format("%.2f",new Circle(3).area()));
    }
}
