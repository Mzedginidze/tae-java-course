/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class Car extends Vehicle {
    private int doors;

public Car(String brand,int year,int d){
    super(brand, year);
    if(d<0)System.out.println("Invalid data!");
    else {
        this.doors = d;
    }
}

@Override
    public void info(){
    System.out.println(this.brand+" "+this.year+", "+this.doors+" doors");
}

public static void main(String []args){
    new Car("Toyota", 2020, 4).info();
}
}
