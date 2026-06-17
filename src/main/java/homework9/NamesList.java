/**
 * @author მარიამი ზედგინიძ
 */


package homework9;

import java.util.ArrayList;


public class NamesList {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Mariami");
        names.add("Anna");
        names.add("Nia");
        names.add("Nini");
        names.add("Maia");

        System.out.println("size: " + names.size() + "\nFirst element: " + names.getFirst() +
                "\nLast element: " + names.get(names.size() - 1));

        names.remove(2);

        System.out.println("does collection contains anna? : " + (names.contains("Anna") ? "yes" : "no"));

        System.out.println("_________________________");

        for (String name : names) {
            System.out.println(name);
        }

    }

}
