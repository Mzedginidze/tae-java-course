/**
 * @author მარიამი ზედგინიძ
 */

package homework9;

public class GenericBox {

    public static class Box<T> {
        private T value;

        Box(T value) {
            this.value = value;
        }

        T get() {
            return this.value;
        }

        void set(T value) {
            this.value = value;
        }

        void printBoxInfo() {
            System.out.println(value.getClass().getSimpleName() + " box: " + this.value);
        }
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>("mariami");
        Box<Integer> integerBox = new Box<>(100);
        Box<Double> doubleBox = new Box<>(100.5);

        stringBox.printBoxInfo();
        integerBox.printBoxInfo();
        doubleBox.printBoxInfo();

    }
}
