package abstraction;
public class Student extends Person{
    int studentID;
    public Student(){
    }
    
    @Override
    void study() {
        System.out.println("Student is studying");
    }
    
}
