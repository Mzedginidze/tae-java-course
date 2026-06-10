/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(this.name + ": bark!");
    }

    public static void main(String[] args) {
        new Dog("Rex").makeSound();
    }
}
