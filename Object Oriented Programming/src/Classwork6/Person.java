package Classwork6;
public abstract class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayDetails(){ 
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    abstract void performDuty();
}
