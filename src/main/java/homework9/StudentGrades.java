/**
 * @author მარიამი ზედგინიძ
 */

package homework9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentGrades {

    private HashMap<String, List<Integer>> grades;

    public StudentGrades(HashMap<String, List<Integer>> grades) {
        this.grades = grades;
    }

    public StudentGrades() {
        this.grades = new HashMap<>();
    }

    public HashMap<String, List<Integer>> getGrades() {
        return grades;
    }

    public void setGrades(String name, List<Integer> studentGrades) {
        this.grades.put(name, studentGrades);
    }

    double averageFor(String name) {
        int sum = 0;

        for (int grade : grades.get(name)) {
            sum += grade;
        }
        return (double) sum / grades.get(name).size();
    }

    public static void main(String[] args) {
        StudentGrades st1 = new StudentGrades();

        st1.setGrades("Mariami", new ArrayList<>(List.of(91, 100, 83, 98)));
        st1.setGrades("Ani", new ArrayList<>(List.of(91, 51, 53, 88)));
        st1.setGrades("Salo", new ArrayList<>(List.of(85, 92, 78, 90)));

        for (String key : st1.getGrades().keySet()) {
            System.out.println(key + " : " + st1.getGrades().get(key) + " avg = " + st1.averageFor(key));
        }

    }
}
