/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class BankAccount {
    private String owner;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public BankAccount(String o, double b) {
        this.owner = o;
        this.balance = b;
    }

    public void deposit(double amount) {
        if (amount > 0) this.balance += amount;
        else System.out.println("შესატანი თანხა უნდა იყოს 0-ზე მეტი!");
    }

    public void withdraw(double amount) {
        if (amount <= this.balance) this.balance -= amount;
        else System.out.println("არასაკმარისი თანხა");
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("მარიამი", 100);
        acc.deposit(50);
        System.out.println(acc.getBalance());

        acc.deposit(-10);
        System.out.println(acc.getBalance());

        acc.withdraw(150.1);
        System.out.println(acc.getBalance());

        acc.withdraw(149.9);
        System.out.println(String.format("%.3f", acc.getBalance()));
    }
}
