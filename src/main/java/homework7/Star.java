/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public class Star implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing Star ★");
    }

    public static void main(String[] args) {
        Drawable [] drawables=new Drawable[]{
                new Square(),
                new Triangle(),
                new Star()
        };

        for(Drawable d: drawables){
            d.draw();
        }
    }
}
