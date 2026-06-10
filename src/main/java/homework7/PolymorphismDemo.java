/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public class PolymorphismDemo {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Dog("Rex"),
                new Cat("mia"),
                new Dog("Buddy"),
                new Cat("Mushu")};

        for (Animal a : animals) {
            System.out.println(a.name + (a instanceof Dog ? " (Dog): " : " (Cat): "));
            a.makeSound();
            a.sleep();
        }
    }
}
