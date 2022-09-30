package gradedstudentslab;

public class Main {
    public static void main(String[] args) {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);
        student.addExamScore(39.6);
        student.setExamScore(1,85.00);
//        System.out.println(student.getExamScores());
//       // System.out.println(student.getExamScores().indexOf(95.0));
//        System.out.println(student.getAverageExamScore());
        System.out.println(student);
    }
}
