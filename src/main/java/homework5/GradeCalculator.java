/** @author მარიამი ზედგინიძე */


package homework5;

public class GradeCalculator {
    static String getGrade(int score) {
        if (score < 0 || score > 100) return "Invalid";
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score>=70) return "C";
        else if (score>=60) return "D";
        else return "F";
    }
    public static void main(String[] args) {
        System.out.println(getGrade(-1));
        System.out.println(getGrade(101));
        System.out.println(getGrade(91));
        System.out.println(getGrade(81));
        System.out.println(getGrade(71));
        System.out.println(getGrade(61));
        System.out.println(getGrade(59));
    }

}
