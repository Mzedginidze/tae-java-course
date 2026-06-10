/**
 * @author მარიამი ზედგინიძე
 */


package homework7;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeSound();

    void sleep() {
        System.out.println(this.name + " is sleeping");
    }
}
