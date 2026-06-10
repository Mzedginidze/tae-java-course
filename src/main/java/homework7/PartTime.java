/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public class PartTime extends Employee {
    double hourlySalary;
    double hoursWorked;

    public PartTime(String name, double hourlySalary, double hoursWorked) {
        super(name);
        this.hourlySalary = hourlySalary;
        this.hoursWorked=hoursWorked;
    }


    @Override
    double calculateSalary() {
        return this.hourlySalary * this.hoursWorked;
    }

    public static void main(String[] args) {
        Employee[] team = {new FullTime("Anna", 5000), new PartTime("Beka", 25, 80)};
        for (Employee e : team) {
            e.printInfo();
            System.out.println(e.calculateSalary());
        }

    }
}