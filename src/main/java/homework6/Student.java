/**
 * @author მარიამი ზედგინიძე
 */

package homework6;

public class Student {
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }

    double averageGrade() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        if (grades.length == 0) return Double.NaN;
        else return sum / grades.length;
    }

    String getStatus() {
        if (this.averageGrade() >= 60) return "Pass";
        else return "Fail";
    }

    public static void main(String[] args) {
        System.out.println(new Student("ანა", new int[]{85, 92, 78}).getStatus());
    }
}
