package school;

import java.time.LocalDate;

public class UnderGraduateStudent extends Student {
    private int level;
    public UnderGraduateStudent(int studentID, String firstName, String lastName, char gender, LocalDate DOB, String PhoneNumber, int level1) {
        super(studentID, firstName, lastName, gender, DOB, PhoneNumber);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    @Override
    public void displayStudentInfo(){
        super.displayStudentInfo();
        System.out.println("Level" + level);
    }
}
