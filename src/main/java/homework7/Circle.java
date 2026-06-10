/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("radius cannot be negative");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }
}
