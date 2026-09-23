package Classwork6;
public class Student extends Person {

    @Override
    void performDuty() {
        System.out.println("Student is learning");
    }
    int studentID;

    public Student(int studentID, String name, int age) {
        super(name, age);
        this.studentID = studentID;
    }
    
    
}