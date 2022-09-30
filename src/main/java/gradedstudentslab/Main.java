package gradedstudentslab;

public class Main {
    public static void main(String[] args) {
        String firstName = "Leon";
        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Student student = new Student(firstName, lastName, examScores);

        System.out.println(student.getExamScores(student));
    }
}
