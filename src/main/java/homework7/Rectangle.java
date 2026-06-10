/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double w, double h) {
        if (w <= 0 || h <= 0) {
            throw new IllegalArgumentException("parameters cannot be negative");
        }
        this.width = w;
        this.height = h;
    }


    @Override
    public double area() {
        return this.width * this.height;
    }

    public static void main(String[] args) {
        try {
            Shape s1 = new Rectangle(4, 5);
            System.out.println(s1.area()); // 20.0
            Shape s2 = new Circle(3);
            System.out.println(s2.area()); // 28.27
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
