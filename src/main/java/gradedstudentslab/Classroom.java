package gradedstudentslab;

import jdk.jfr.Percentage;

import java.util.*;

public class Classroom{
    private Student[] students;

    //3constructors
    //maxNumber of students
    public Classroom(int maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    //takes array
    public Classroom(Student[] students) {
        this.students = students;
    }

    //nullary constructor which makes 30 students
    public Classroom() {
        students = new Student[30];
    }

    //getter
    public Student[] getStudents() {
        return students;
    }

    //avg exam score from array of students
    public double getAverageExamScore() {
        double sum = 0;
        int numberOfExams = 0;
        for (int i = 0; i < students.length; i++) {
            for (Double x : students[i].getExamScores(1)) {
                sum += x;
            }
            numberOfExams += students[i].getExamScores(1).size();

        }
        double average = sum / numberOfExams;
        return average;
    }

    //add a student to the student list
    public void addStudent(Student student) {
        Student[] temporaryList = new Student[this.students.length + 1];
        for (int i = 0; i < this.students.length; i++) {
            temporaryList[i] = this.students[i];
        }
        temporaryList[temporaryList.length - 1] = student;
        students = temporaryList;
    }

    //removes student from list
    public void removeStudent(String firstName, String lastName) {
        List<Student> temporaryArrayList = new ArrayList<>();

        for (int i = 0; i < students.length; i++) {
            temporaryArrayList.add(students[i]);
        }
        for (Student x : temporaryArrayList) {
            if (x.getFirstName().equals(firstName) && x.getLastName().equals(lastName)) {
                temporaryArrayList.remove(x);
            }
        }
        temporaryArrayList.toArray(students);
        }

    //compare by average scores..if same then alphabetically by name
        public Student[] getStudentsByScore(){
        Arrays.sort(students);
        return students;
        }


    //gradebook determined by percentiles
    //REDO!!!!!!!!!!!
    public Map<Student, Character> getGradeBook(){
        Map <Student, Character> studentsGradeBook = new HashMap<>();
        double sumOfGrades = 0;
        for (int i = 0; i < students.length; i++){
            sumOfGrades += students[i].getAverageExamScore();
        }

        for (int i = 0; i < students.length; i++){
            studentsGradeBook.put(students[i], 'I');
            sumOfGrades += students[i].getAverageExamScore();
        }
        for (int i = 0; i < students.length; i++){

        }

        for (int i = 0; i < getStudentsByScore().length; i++){
            double valA = getStudentsByScore().length*.1;
            if(i<= valA);
        }
        for (Student x : studentsGradeBook.keySet()){
            if(x.getAverageExamScore() >= (sumOfGrades*.1)){
                studentsGradeBook.put(x, 'A');
            }else if(x.getAverageExamScore() < (sumOfGrades*.1) && x.getAverageExamScore() >= (sumOfGrades*.29)){
                studentsGradeBook.put(x, 'B');
            }else if(x.getAverageExamScore() < (sumOfGrades*.29) && x.getAverageExamScore() >= (sumOfGrades*.50)){
                studentsGradeBook.put(x, 'C');
            }else if(x.getAverageExamScore() < (sumOfGrades*.5) && x.getAverageExamScore() >= (sumOfGrades*.89)){
                studentsGradeBook.put(x, 'D');
            }else if(x.getAverageExamScore() < (sumOfGrades*.89)){
                studentsGradeBook.put(x, 'F');
            }
        }


//        for (int i = 0; i < students.length; i++){
//            Character grade;
//            if(students[i].getAverageExamScore() == students[i+1].getAverageExamScore()){
//            }
//            studentsGradeBook.put(students[i], grade);
//
//        }
        return studentsGradeBook;
    }
    }



