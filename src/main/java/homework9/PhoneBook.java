/**
 * @author მარიამი ზედგინიძ
 */


package homework9;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, String> contacts = new HashMap<>();

    public PhoneBook() {
        contacts.put("Mariami", "551790595");
        contacts.put("Ani", "555555555");
        contacts.put("Maia", "511111111");
        contacts.put("Eka", "588888888");
    }

    public HashMap<String, String> getContacts() {
        return this.contacts;
    }

    public String findPhone(String name) {
        return this.contacts.getOrDefault(name, "არ მოიძებნა");
    }

    public static void main(String[] args) {
        PhoneBook obj1 = new PhoneBook();

        System.out.println(obj1.findPhone("Mariami"));
        System.out.println(obj1.findPhone("Nia"));

        for (String key : obj1.getContacts().keySet()) {
            System.out.println(key + " : " + obj1.getContacts().get(key));
        }
    }
}
