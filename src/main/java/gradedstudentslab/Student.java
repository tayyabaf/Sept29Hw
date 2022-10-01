package gradedstudentslab;

import java.util.ArrayList;

public class Student {
    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;


    public Student(String firstName, String lastName, Double[] testScores) {
        this.firstName = firstName;
        this.lastName = lastName;
        examScores=new ArrayList<>();
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

   // public ArrayList<Double> getExamScores() {
//        return examScores;
//    }

    public void setExamScores(ArrayList<Double> examScores) {
        this.examScores = examScores;
    }

    //returns number of exams taken
    public int getNumberOfExamsTaken(){
        return examScores.size();
    }

    //method overloading so I can usegetExamScores in other classes and return as arrayList

    public ArrayList<Double> getExamScores(int anyRandomNumber) {
        return examScores;
    }


    //returns a string representation of all exams taken
    public String getExamScores(){
        String examScoresAsString = "Exam Scores: ";
            for (Double x : examScores) {
                examScoresAsString += "\n\tExam " + (1+ examScores.indexOf(x)) + " -> " + (x) ;
            }
        return examScoresAsString;
    }

    //adds exam score to examScores
    public void addExamScore(double examScore){
        examScores.add(examScore);
    }

    //sets a current exam score to a new exam score
    public void setExamScore(int examNumber, double newScore){
        examScores.add(examNumber, newScore);
    }

    public double getAverageExamScore(){
        double sum = 0;
        for (Double x : examScores){
            sum += x;
        }
        double average  = sum / (examScores.size());
        return average;
    }

    //clean toString

    @Override
    public String toString() {
        return "Student Name: " + firstName + " " + lastName + "\n> Average Score: " + getAverageExamScore() + "\n> " + getExamScores();
    }
}
