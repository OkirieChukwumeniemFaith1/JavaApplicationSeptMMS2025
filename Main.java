public class Main{
    public static void main(String[] args) {

        Student[] students = {
            new Student("John", 80),
            new Student("Mary", 72),
            new Student("Peter", 90),
            new Student("Alice", 65),
            new Student("David", 88)
        };

        for (Student s : students) {
            if (s.mark >= 75) {
                System.out.println("=========================================");
                System.out.printf("Student Name: %s%n", s.name);
                System.out.printf("Student Mark: %d%n", s.mark);
                System.out.println("Grade A");
            }
        }
    }
}