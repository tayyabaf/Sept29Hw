package gradedstudentslab;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        String firstName = "Leon";
//        String lastName = "Hunter";
        Double[] examScores = { 100.0, 95.0, 123.0, 96.0 };
        Double[] examScores1 = { 93.3,96.7,45.6 };
        Double[] examScores2 = { 56.7, 34.6, 99.9 };
        Double[] examScores3 = { 56.7, 99.9 };
//        Student student = new Student(firstName, lastName, examScores);
//        student.addExamScore(39.6);
//        student.setExamScore(1,85.00);
////        System.out.println(student.getExamScores());
////       // System.out.println(student.getExamScores().indexOf(95.0));
////        System.out.println(student.getAverageExamScore());
//        System.out.println(student);
Student jules = new Student("Julianna", "baloney", examScores);
        Student [] students = { new Student("Sarah", "Bob", examScores1), new Student("Qris", "Mush", examScores2)};
        Classroom myClassroom = new Classroom(students);
//        System.out.println(myClassroom.getAverageExamScore());
        myClassroom.addStudent(new Student("Jules", "Kolek", examScores3));
        myClassroom.addStudent(jules);
        for (int i = 0; i < myClassroom.getStudents().length; i++){
            System.out.println(myClassroom.getStudents()[i]);
        }
    }
}
