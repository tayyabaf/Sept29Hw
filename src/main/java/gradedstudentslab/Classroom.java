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
        Arrays.sort(this.students);
        return students;
        }



    //gradebook determined by percentiles
    //REDO!!!!!!!!!!!
    public Map<Student, Character> getGradeBook(){
        Map <Student, Character> studentsGradeBook = new HashMap<>();
        Map <Student, Double> positionOfStudent = new HashMap<>();


        for (int i = 0; i < getStudentsByScore().length; i++){
            double length = getStudentsByScore().length -1;
            double percentile = (i)/length;
            positionOfStudent.put(getStudentsByScore()[i], percentile);
        }

        for (Map.Entry<Student, Double> entry: positionOfStudent.entrySet()){
            if(entry.getValue() >= (1-.1)){
                studentsGradeBook.put(entry.getKey(), 'A');
            }else if(entry.getValue() <(1-.1) && entry.getValue() >=(1-.29)){
                studentsGradeBook.put(entry.getKey(), 'B');
            }else if(entry.getValue() <(1-.29) && entry.getValue() >=(1-.5)){
                studentsGradeBook.put(entry.getKey(), 'C');
            }else if(entry.getValue() <(1-.5) && entry.getValue() >=(1-.89)){
                studentsGradeBook.put(entry.getKey(), 'D');
            }else if(entry.getValue() <(1-.89)){
                studentsGradeBook.put(entry.getKey(), 'F');
            }

        }

        return studentsGradeBook;
    }
}



