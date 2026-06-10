/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

import java.util.Arrays;

public class Person implements Comparable<Person> {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.age = age;
        this.name = name;
    }


    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }


    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Anna", 25),
                new Person("Beka", 30),
                new Person("Cita", 22),
                new Person("Mariami", 21)
        };

        Arrays.sort(people);

        for (int i = 0; i < people.length; i++) {
            System.out.println(people[i].name + " (" + people[i].age + ") ");
        }
    }
}
