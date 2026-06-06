/** @author მარიამი ზედგინიძე */

package homework6;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String n,int a, String e){
        this.name=n;
        this.age=a;
        this.email=e;
    }

    public Person(String n, int a) {
        this(n, a, null);
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getEmail(){
        return this.email;
    }

    public void introduce(){
        System.out.println("გამარჯობა, მე ვარ " +
                this.getName()+", "+this.getAge()+" წლის.");
    }

    public static void main(String[] args) {
        new Person("მარიამი",21).introduce();
        new Person("ანა", 25).introduce();
    }
}
