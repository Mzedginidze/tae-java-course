/**
 * @author მარიამი ზედგინიძე
 */

package homework7;

public abstract class Employee {
    protected String name;

    public Employee(String name){
        this.name=name;
    }
    abstract double calculateSalary();

    void printInfo(){
        System.out.println("name: "+this.name);
    }

}
