package Classwork6;
public class MainApp {
    public static void main(String[] args){ 
        Teacher teacher = new Teacher(1,"man",34);
        Student student = new Student(1,"boy",12);
        System.out.println("\nTeacher side");
        teacher.displayDetails();
        teacher.performDuty();
        System.out.println("\nStudent side");
        student.displayDetails();
        student.performDuty();
    }
}
