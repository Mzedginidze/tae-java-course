/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.makeSound();
        d.sleep();
    }
}
