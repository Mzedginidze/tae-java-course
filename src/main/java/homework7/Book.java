/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public class Book {
    private String title;
    private String author;
    private int year;

    Book(String title){
        this(title, "Unknown", 0);
    }

    Book(String title, String author){
        this(title, author, 0);
    }

    Book(String title, String author, int year){
        this.title=title;
        this.author=author;
        this.year=year;
    }

    @Override
    public String toString() {
        return this.title+" by "+this.author+" ("+this.year+") ";
    }

    public static void main(String[] args) {
        System.out.println(new Book("Java").toString());
        System.out.println(new Book("Java", "Bloch").toString());
        System.out.println(new Book("Java", "Bloch", 2020).toString());

    }
}
