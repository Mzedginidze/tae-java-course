/* @author მარიამი ზედგინიძე */

package homework4;

public class GradeCalculator {
    public static void main(String[] args){
        short birthMonth=2;
        char grade;

        if (birthMonth < 1 || birthMonth > 12) {
            grade = 'x';
        }
        else if (birthMonth == 12) {
            grade = 'A';
        }
        else if (birthMonth >= 9) {
            grade = 'B';
        }
        else if (birthMonth >= 6) {
            grade = 'C';
        }
        else if (birthMonth >= 3) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }
        System.out.println((grade=='x'?"invalid birthMonth":"grade: "+grade));
    }
}
