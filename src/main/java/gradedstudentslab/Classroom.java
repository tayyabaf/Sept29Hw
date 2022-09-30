package gradedstudentslab;

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


}
