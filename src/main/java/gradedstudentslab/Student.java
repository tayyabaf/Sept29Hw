package gradedstudentslab;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        for(int i = 0; i < testScores.length; i++){
            examScores.add(testScores[i]);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Double> getExamScores() {
        return examScores;
    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    //returns number of exams taken
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    //returns a string representation of all exams taken
    public String getExamScores(Student student){
        String examScoresAsString = "";
        for (int i = 0; i < examScores.size(); i++) {
            for (Double x : examScores) {
                examScoresAsString += "Exam " + examScores.indexOf(x) + " " + x;
            }
        }
        return examScoresAsString;
    }
}
