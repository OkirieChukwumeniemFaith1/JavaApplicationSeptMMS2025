package school;

import java.time.LocalDate;

public class GraduateStudent extends Student {

    private String finalYearProject;
    public GraduateStudent(int studentID, String firstName, String lastName, char gender, LocalDate DOB, String PhoneNumber, String finalYearProject1) {
        super(studentID, firstName, lastName, gender, DOB, PhoneNumber); 
        
    }

    public String getFinalYearProject() {
        return finalYearProject;
    }

    public void setFinalYearProject(String finalYearProject) {
        this.finalYearProject = finalYearProject;
    }

    @Override
    public void displayStudentInfo(){
        super.displayStudentInfo();
        System.out.println("final Year Project: " + finalYearProject);
    }
}
