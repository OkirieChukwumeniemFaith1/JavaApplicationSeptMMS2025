package abstraction;
public abstract class Person {
    String firstName;
    String lastName;
    String phoneNumber;
    String phone;
    String address;
    
    void eat(){
        System.out.println("The person is eating");
    }
    
    abstract void study();
}
