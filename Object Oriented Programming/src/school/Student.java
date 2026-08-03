package school;
import java.time.LocalDate;
public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private char gender;
    private LocalDate DOB;
    private String PhoneNumber;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public Student(int studentID, String firstName, String lastName, char gender, LocalDate DOB, String PhoneNumber) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.DOB = DOB;
        this.PhoneNumber = PhoneNumber;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    public void payFees(double amount){
        System.out.println("Amount paid " + amount);
    }
    public void payFees(double amount, String fullName){
        System.out.println("Amount paid " + amount);
        System.out.println("Student full name " + fullName);
    }
    public void payFees(double amount, String fullName, String paymentMethod){
        System.out.println("Amount paid " + amount);
        System.out.println("Student full name " + fullName);
        System.out.println("Payment Method " + paymentMethod);
    }
    public void displayStudentInfo(){
        System.out.println("StudentID: "+ studentID);
        System.out.println("First Name: "+ firstName);
        System.out.println("Last Name: "+ lastName);
        System.out.println("Gender: "+ gender);
        System.out.println("Date of Birth: "+ DOB);
        System.out.println("Phone Number: "+ PhoneNumber);
    }
}
