package gradedstudentslab;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private Student [] students;

    //3constructors
    //maxNumber of students
    public Classroom(int maxNumberOfStudents){
        students = new Student[maxNumberOfStudents];
    }
    //takes array
    public Classroom(Student[] students){
        this.students=students;
    }
    //nullary constructor which makes 30 students
    public Classroom(){
        students = new Student[30];
    }

    //getter
    public Student[] getStudents() {
        return students;
    }

    //avg exam score from array of students
    public double getAverageExamScore(){
        double sum = 0;
        int numberOfExams = 0;
        for(int i = 0; i < students.length; i++){
            for (Double x: students[i].getExamScores(1)){
                sum+= x;
            }
            numberOfExams += students[i].getExamScores(1).size();

        }
        double average = sum / numberOfExams;
        return average;
    }

    //add a student to the student list
    public void addStudent(Student student) {
        Student[] temporaryList = new Student[this.students.length+1];
        for (int i = 0; i < this.students.length; i++){
            temporaryList[i] = this.students[i];
        }
        temporaryList[temporaryList.length-1] = student;
        students = temporaryList;
    }}
