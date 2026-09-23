package Classwork6;
public class Teacher extends Person {

    @Override
    void performDuty() {
        System.out.println("Teacher is teaching");
    }
    int teacherID;

    public Teacher(int teacherID, String name, int age) {
        super(name, age);
        this.teacherID = teacherID;
    }
    
    
}
